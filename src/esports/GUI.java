package esports;
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

public class GUI implements ActionListener, ListSelectionListener{
	PlayerList playerList;
	JTextArea results;
	MatchmadeGame currentGame;
	JFrame frame;
	DefaultListModel<Player> selectPlayerModel;
	JList<Player> selectPlayer;
	JPanel panel;
	JPanel playerPanel;
	JPanel playerOptionsPanel;
	JTextField[] playerRanks;
	String[] rankList;
	String[] playerRankStrings;
	JTextArea[] roleGuide;
	JPanel playerRankPanel;
	JPanel playerNamePanel;
	JTextField playerName;
	
	public GUI() {
		playerList = new PlayerList();
		//playerList = loadPlayers(playerList);
		//playerList.loadOldData();
		playerList.loadNewData();
		//playerList.savePlayers();

		frame = new JFrame();
		//Player[] playerArray = new Player[playerList.players.size()];
		//playerRankStrings = new String[playerList.players.size()];
		/*for (int i = 0; i < playerArray.length; i++) {
			playerArray[i] = playerList.players.get(i);
			playerRankStrings[i] = new String("MT: " + playerArray[i].MTrank
									   + "\nOT: " + playerArray[i].OTrank
									   + "\nHS: " + playerArray[i].HSrank
									   + "\nFDPS: " + playerArray[i].FDPSrank
									   + "\nMS: " + playerArray[i].MSrank
									   + "\nFS: " + playerArray[i].FSrank);
		}*/
		panel = new JPanel();
		playerPanel = new JPanel();
		playerOptionsPanel = new JPanel();
		selectPlayerModel = new DefaultListModel<Player>();
		selectPlayer = new JList<Player>(selectPlayerModel);
		selectPlayerModel.addAll(playerList.players);
		selectPlayer.addListSelectionListener(this);
		selectPlayer.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
		JButton startMatchmakingButton = new JButton("Run matchmaking");
		JButton optimize = new JButton("Optimize teams");
		optimize.setActionCommand("optimize");
		optimize.addActionListener(this);
		results = new JTextArea();
		results.setText("Information will be displayed here");
		startMatchmakingButton.setActionCommand("matchmake");
		startMatchmakingButton.addActionListener(this);
		panel.setBorder(BorderFactory.createEmptyBorder(30, 30, 10, 30));
		panel.setLayout(new GridLayout());
		playerNamePanel = new JPanel();
		JTextArea playerNameLabel = new JTextArea("Player name: ");
		playerNameLabel.setEditable(false);
		playerName = new JTextField(10);
		playerNamePanel.add(playerNameLabel);
		playerNamePanel.add(playerName);
		playerRanks = new JTextField[6];
		roleGuide = new JTextArea[6];
		playerRankPanel = new JPanel();
		roleGuide[0] = new JTextArea("MT: ");
		roleGuide[1] = new JTextArea("HS: ");
		roleGuide[2] = new JTextArea("FDPS: ");
		roleGuide[3] = new JTextArea("MS: ");
		roleGuide[4] = new JTextArea("FS: ");
		for (int i = 0; i < playerRanks.length; i++) {
			playerRanks[i] = new JTextField(5);
			roleGuide[i].setEditable(false);
			playerRankPanel.add(roleGuide[i]);
			playerRankPanel.add(playerRanks[i]);
		}
		JButton saveChanges = new JButton("Save Changes");
		saveChanges.setActionCommand("savechanges");
		saveChanges.addActionListener(this);
		playerRankPanel.add(saveChanges);
		JButton deletePlayer = new JButton("Delete Player");
		deletePlayer.setActionCommand("deleteplayer");
		deletePlayer.addActionListener(this);
		JButton addPlayer = new JButton("Add New Player");
		addPlayer.setActionCommand("addplayer");
		addPlayer.addActionListener(this);
		playerOptionsPanel.setLayout(new GridLayout(4, 1));
		playerOptionsPanel.add(playerNamePanel);
		playerOptionsPanel.add(playerRankPanel);
		playerOptionsPanel.add(deletePlayer);
		playerOptionsPanel.add(addPlayer);
		playerPanel.add(selectPlayer, BorderLayout.WEST);
		playerPanel.add(playerOptionsPanel, BorderLayout.EAST);
		panel.add(startMatchmakingButton);
		panel.add(optimize);
		panel.add(results);
		frame.add(playerPanel, BorderLayout.NORTH);
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("Zubes' Matchmaking Program");
		frame.pack();
		frame.setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if ("matchmake".equals(e.getActionCommand())) {
			currentGame = playerList.runMatchmaking(1);
			if (currentGame == null) {
				results.setText("Error, not enough players in each role.");
			}
			else {
				results.setText(currentGame.toString());
			}
		}
		else if ("optimize".equals(e.getActionCommand())) {
			results.setText(playerList.stringTeamsByRank());
		}
		else if ("deleteplayer".equals(e.getActionCommand())) {
			if (selectPlayer.getSelectedIndex() != -1) {
				playerList.removePlayer(selectPlayer.getSelectedValue());
				selectPlayerModel.remove(selectPlayer.getSelectedIndex());
			}
		}
		else if ("addplayer".equals(e.getActionCommand())) {
			Player newplayer = new Player("newplayer", 0, 0, 0, 0, 0);
			playerList.addPlayer(newplayer);
			selectPlayerModel.addElement(newplayer);
		}
		else if ("savechanges".equals(e.getActionCommand())) {
			if (selectPlayer.getSelectedIndex() != -1) {
				playerList.setRank(selectPlayer.getSelectedValue(), Role.MT, Integer.valueOf(playerRanks[0].getText()));
				playerList.setRank(selectPlayer.getSelectedValue(), Role.HS, Integer.valueOf(playerRanks[2].getText()));
				playerList.setRank(selectPlayer.getSelectedValue(), Role.FDPS, Integer.valueOf(playerRanks[3].getText()));
				playerList.setRank(selectPlayer.getSelectedValue(), Role.MS, Integer.valueOf(playerRanks[4].getText()));
				playerList.setRank(selectPlayer.getSelectedValue(), Role.FS, Integer.valueOf(playerRanks[5].getText()));
				playerList.changeName(selectPlayer.getSelectedValue(), playerName.getText());
				selectPlayerModel.set(selectPlayer.getSelectedIndex(), selectPlayer.getSelectedValue());
			}
		}
	}
	
	public static PlayerList loadPlayers(PlayerList playerList) {
		try {
			FileInputStream fileIn = new FileInputStream("savedPlayers.ser");
			ObjectInputStream in = new ObjectInputStream(fileIn);
			playerList = (PlayerList) in.readObject();
			in.close();
			return playerList;
		} catch (IOException i) {
			i.printStackTrace();
			return null;
		} catch (ClassNotFoundException c) {
			System.out.println("playerlist class not found");
			c.printStackTrace();
			return null;
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent s) {
		if (selectPlayer.getSelectedValue() != null) {
			playerRanks[0].setText(Integer.toString(selectPlayer.getSelectedValue().MTrank));
			playerRanks[1].setText(Integer.toString(selectPlayer.getSelectedValue().OTrank));
			playerRanks[2].setText(Integer.toString(selectPlayer.getSelectedValue().HSrank));
			playerRanks[3].setText(Integer.toString(selectPlayer.getSelectedValue().FDPSrank));
			playerRanks[4].setText(Integer.toString(selectPlayer.getSelectedValue().MSrank));
			playerRanks[5].setText(Integer.toString(selectPlayer.getSelectedValue().FSrank));
			playerName.setText(selectPlayer.getSelectedValue().PlayerName);
		}
	}

}
