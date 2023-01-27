package esportsUpdate;
import java.io.*;
import java.lang.Math;
import java.util.ArrayList;

public class Main {
	public static void main(String args[]) {			
		//PlayerList playerList = new PlayerList();
		//playerList = loadPlayers(playerList);
		
		//playerList = loadOldData();
		
		//savePlayers(playerList);		
		
		//printTeamsByRank(playerList.players);
		
		new GUI();
	}
	
	/*public static PlayerList loadPlayers(PlayerList playerList) {
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
	}*/
}
