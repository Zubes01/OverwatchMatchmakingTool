package esportsUpdate;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.Collections;

public class PlayerList implements java.io.Serializable{
	ArrayList<Player> players = new ArrayList<Player>();
	ArrayList<Player> MTs = new ArrayList<Player>();
	ArrayList<Player> HSs = new ArrayList<Player>();
	ArrayList<Player> FDPSs = new ArrayList<Player>();
	ArrayList<Player> MSs = new ArrayList<Player>();
	ArrayList<Player> FSs = new ArrayList<Player>();

	public void addPlayer(Player addMe) {
		players.add(addMe);
		if (addMe.MTrank != 0) {
			MTs.add(addMe);
		}
		if (addMe.HSrank != 0) {
			HSs.add(addMe);
		}
		if (addMe.FDPSrank != 0) {
			FDPSs.add(addMe);
		}
		if (addMe.MSrank != 0) {
			MSs.add(addMe);
		}
		if (addMe.FSrank != 0) {
			FSs.add(addMe);
		}
	}
	
	public void removePlayer(Player removeMe) {
		players.remove(removeMe);
		if (MTs.contains(removeMe)) {
			MTs.remove(removeMe);
		}
		if (HSs.contains(removeMe)) {
			HSs.remove(removeMe);
		}
		if (FDPSs.contains(removeMe)) {
			FDPSs.remove(removeMe);
		}
		if (MSs.contains(removeMe)) {
			MSs.remove(removeMe);
		}
		if (FSs.contains(removeMe)) {
			FSs.remove(removeMe);
		}
	}
	
	public void removePlayer(String playerName) {
		for (Player p : players) {
			if (p.PlayerName.equals(playerName)) {
				this.removePlayer(p);
				return;
			}
		}
	}
	
	public void setTakenStatus(String playerName, boolean takenStatus) {
		for (Player p : players) {
			if (p.PlayerName.equals(playerName)) {
				p.taken = takenStatus;
			}
		}
		for (Player p : MTs) {
			if (p.PlayerName.equals(playerName)) {
				p.taken = takenStatus;
			}
		}
		for (Player p : HSs) {
			if (p.PlayerName.equals(playerName)) {
				p.taken = takenStatus;
			}
		}
		for (Player p : FDPSs) {
			if (p.PlayerName.equals(playerName)) {
				p.taken = takenStatus;
			}
		}
		for (Player p : MSs) {
			if (p.PlayerName.equals(playerName)) {
				p.taken = takenStatus;
			}
		}
		for (Player p : FSs) {
			if (p.PlayerName.equals(playerName)) {
				p.taken = takenStatus;
			}
		}
	}
	
	public void shufflePlayerLists() {
		Collections.shuffle(players);
		Collections.shuffle(MTs);
		Collections.shuffle(HSs);
		Collections.shuffle(FDPSs);
		Collections.shuffle(MSs);
		Collections.shuffle(FSs);
	}
	
	public String getPlayerStatsString() {
		String playerStats = new String();
		for (Player p : players) {
			playerStats += p.PlayerName + Integer.toString(p.MTrank) + Integer.toString(p.HSrank) + Integer.toString(p.FDPSrank) + Integer.toString(p.MSrank) + Integer.toString(p.FSrank) + "/n";
		}
		return playerStats;
	}
	
	public void setRank(Player player, Role role, int rank) {
		String playerName = player.PlayerName;
		switch (role) {
		case MT:
			for (Player p : players) {
				if (p.PlayerName.equals(playerName)) {
					p.MTrank = rank;
				}
			}
			for (Player p : MTs) {
				if (p.PlayerName.equals(playerName)) {
					p.MTrank = rank;
				}
			}
			for (Player p : HSs) {
				if (p.PlayerName.equals(playerName)) {
					p.MTrank = rank;
				}
			}
			for (Player p : FDPSs) {
				if (p.PlayerName.equals(playerName)) {
					p.MTrank = rank;
				}
			}
			for (Player p : MSs) {
				if (p.PlayerName.equals(playerName)) {
					p.MTrank = rank;
				}
			}
			for (Player p : FSs) {
				if (p.PlayerName.equals(playerName)) {
					p.MTrank = rank;
				}
			}
		case HS:
			for (Player p : players) {
				if (p.PlayerName.equals(playerName)) {
					p.HSrank = rank;
				}
			}
			for (Player p : MTs) {
				if (p.PlayerName.equals(playerName)) {
					p.HSrank = rank;
				}
			}
			for (Player p : HSs) {
				if (p.PlayerName.equals(playerName)) {
					p.HSrank = rank;
				}
			}
			for (Player p : FDPSs) {
				if (p.PlayerName.equals(playerName)) {
					p.HSrank = rank;
				}
			}
			for (Player p : MSs) {
				if (p.PlayerName.equals(playerName)) {
					p.HSrank = rank;
				}
			}
			for (Player p : FSs) {
				if (p.PlayerName.equals(playerName)) {
					p.HSrank = rank;
				}
			}
		case FDPS:
			for (Player p : players) {
				if (p.PlayerName.equals(playerName)) {
					p.FDPSrank = rank;
				}
			}
			for (Player p : MTs) {
				if (p.PlayerName.equals(playerName)) {
					p.FDPSrank = rank;
				}
			}
			for (Player p : HSs) {
				if (p.PlayerName.equals(playerName)) {
					p.FDPSrank = rank;
				}
			}
			for (Player p : FDPSs) {
				if (p.PlayerName.equals(playerName)) {
					p.FDPSrank = rank;
				}
			}
			for (Player p : MSs) {
				if (p.PlayerName.equals(playerName)) {
					p.FDPSrank = rank;
				}
			}
			for (Player p : FSs) {
				if (p.PlayerName.equals(playerName)) {
					p.FDPSrank = rank;
				}
			}		
		case MS:
			for (Player p : players) {
				if (p.PlayerName.equals(playerName)) {
					p.MSrank = rank;
				}
			}
			for (Player p : MTs) {
				if (p.PlayerName.equals(playerName)) {
					p.MSrank = rank;
				}
			}
			for (Player p : HSs) {
				if (p.PlayerName.equals(playerName)) {
					p.MSrank = rank;
				}
			}
			for (Player p : FDPSs) {
				if (p.PlayerName.equals(playerName)) {
					p.MSrank = rank;
				}
			}
			for (Player p : MSs) {
				if (p.PlayerName.equals(playerName)) {
					p.MSrank = rank;
				}
			}
			for (Player p : FSs) {
				if (p.PlayerName.equals(playerName)) {
					p.MSrank = rank;
				}
			}	
		case FS:
			for (Player p : players) {
				if (p.PlayerName.equals(playerName)) {
					p.FSrank = rank;
				}
			}
			for (Player p : MTs) {
				if (p.PlayerName.equals(playerName)) {
					p.FSrank = rank;
				}
			}
			for (Player p : HSs) {
				if (p.PlayerName.equals(playerName)) {
					p.FSrank = rank;
				}
			}
			for (Player p : FDPSs) {
				if (p.PlayerName.equals(playerName)) {
					p.FSrank = rank;
				}
			}
			for (Player p : MSs) {
				if (p.PlayerName.equals(playerName)) {
					p.FSrank = rank;
				}
			}
			for (Player p : FSs) {
				if (p.PlayerName.equals(playerName)) {
					p.FSrank = rank;
				}
			}
		}
		if (!MTs.contains(player) && rank != 0) {
			MTs.add(player);
		}
		if (!HSs.contains(player) && rank != 0) {
			HSs.add(player);
		}
		if (!FDPSs.contains(player) && rank != 0) {
			FDPSs.add(player);
		}
		if (!MSs.contains(player) && rank != 0) {
			MSs.add(player);
		}
		if (!FSs.contains(player) && rank != 0) {
			FSs.add(player);
		}
	}

	public void changeName(Player player, String newName) {
		if (players.contains(player)) {
			players.get(players.indexOf(player)).PlayerName = newName;
		}
		if (MTs.contains(player)) {
			MTs.get(MTs.indexOf(player)).PlayerName = newName;
		}
		if (HSs.contains(player)) {
			HSs.get(HSs.indexOf(player)).PlayerName = newName;
		}
		if (FDPSs.contains(player)) {
			FDPSs.get(FDPSs.indexOf(player)).PlayerName = newName;
		}
		if (MSs.contains(player)) {
			MSs.get(MSs.indexOf(player)).PlayerName = newName;
		}
		if (FSs.contains(player)) {
			FSs.get(FSs.indexOf(player)).PlayerName = newName;
		}
	}
	
	public MatchmadeGame runMatchmaking(int RANK_DIFFERENCE_ALLOWED) {
		this.pruneList();
		this.shufflePlayerLists();
		Team team1 = new Team();
		Team team2 = new Team();
		Team variableTeam1 = new Team();
		Team variableTeam2 = new Team();
		int teamDiff = 5000;
		System.out.println("Most similarly matched teams: \n");
		if (this.MTs.isEmpty()){ System.out.println("ERROR: NOT ENOUGH PLAYERS IN EACH ROLE! MORE MTs NEEDED!"); return null;};
		for (Player p1 : this.MTs) {
			variableTeam1.addPlayer(Role.MT, p1);
			this.setTakenStatus(p1.PlayerName, true);
			//for (Player p2 : this.OTs) {
				//if (!p2.taken) {
					//variableTeam1.addPlayer(Role.OT, p2);
					//this.setTakenStatus(p2.PlayerName, true);
					if (this.HSs.isEmpty()){ System.out.println("ERROR: NOT ENOUGH PLAYERS IN EACH ROLE! MORE HSs NEEDED!"); return null;};
					for(Player p3 : this.HSs) {
						if (!p3.taken) {
							variableTeam1.addPlayer(Role.HS, p3);
							this.setTakenStatus(p3.PlayerName, true);
							if (this.FDPSs.isEmpty()){ System.out.println("ERROR: NOT ENOUGH PLAYERS IN EACH ROLE! MORE FDPSs NEEDED!"); return null;};
							for(Player p4 : this.FDPSs) {
								if (!p4.taken) {
									variableTeam1.addPlayer(Role.FDPS, p4);
									this.setTakenStatus(p4.PlayerName, true);
									if (this.MSs.isEmpty()){ System.out.println("ERROR: NOT ENOUGH PLAYERS IN EACH ROLE! MORE MSs NEEDED!"); return null;};
									for(Player p5 : this.MSs) {
										if (!p5.taken) {
											variableTeam1.addPlayer(Role.MS, p5);
											this.setTakenStatus(p5.PlayerName, true);
											if (this.FSs.isEmpty()){ System.out.println("ERROR: NOT ENOUGH PLAYERS IN EACH ROLE! MORE FSs NEEDED!"); return null;};
											for(Player p6 : this.FSs) {
												if (!p6.taken) {
													variableTeam1.addPlayer(Role.FS, p6);
													this.setTakenStatus(p6.PlayerName, true);
													if (this.MTs.isEmpty()){ System.out.println("ERROR: NOT ENOUGH PLAYERS IN EACH ROLE! MORE MTs NEEDED!"); return null;};
													for(Player p7 : this.MTs) {
														if (!p7.taken) {
															variableTeam2.addPlayer(Role.MT, p7);
															this.setTakenStatus(p7.PlayerName, true);
															//for(Player p8 : this.OTs) {
																//if (!p8.taken) {
																	//variableTeam2.addPlayer(Role.OT, p8);
																	//this.setTakenStatus(p8.PlayerName, true);
																	if (this.HSs.isEmpty()){ System.out.println("ERROR: NOT ENOUGH PLAYERS IN EACH ROLE! MORE HSs NEEDED!"); return null;};
																	for(Player p9 : this.HSs) {
																		if (!p9.taken) {
																			variableTeam2.addPlayer(Role.HS, p9);
																			this.setTakenStatus(p9.PlayerName, true);
																			if (this.FDPSs.isEmpty()){ System.out.println("ERROR: NOT ENOUGH PLAYERS IN EACH ROLE! MORE FDPSs NEEDED!"); return null;};
																			for(Player p10 : this.FDPSs) {
																				if (!p10.taken) {
																					variableTeam2.addPlayer(Role.FDPS, p10);
																					this.setTakenStatus(p10.PlayerName, true);
																					if (this.MSs.isEmpty()){ System.out.println("ERROR: NOT ENOUGH PLAYERS IN EACH ROLE! MORE MSs NEEDED!"); return null;};
																					for(Player p11 : this.MSs) {
																						if (!p11.taken) {
																							variableTeam2.addPlayer(Role.MS, p11);
																							this.setTakenStatus(p11.PlayerName, true);
																							if (this.FSs.isEmpty()){ System.out.println("ERROR: NOT ENOUGH PLAYERS IN EACH ROLE! MORE FSs NEEDED!"); return null;};
																							for (Player p12 : this.FSs) {
																								if (!p12.taken) {
																									variableTeam2.addPlayer(Role.FS, p12);
																									variableTeam1.calculateAvg();
																									variableTeam2.calculateAvg();
																									if (Math.abs(variableTeam1.teamAvg - variableTeam2.teamAvg) < teamDiff) {
																										teamDiff = Math.abs(variableTeam1.teamAvg - variableTeam2.teamAvg);
																										team1.copy(variableTeam1);
																										team2.copy(variableTeam2);
																										if (teamDiff < RANK_DIFFERENCE_ALLOWED) {
																											break;
																										}
																									}
																								}
																							}
																							this.setTakenStatus(p11.PlayerName, false);
																							if (teamDiff < RANK_DIFFERENCE_ALLOWED) {
																								break;
																							}
																						}
																					}
																					this.setTakenStatus(p10.PlayerName, false);
																					if (teamDiff < RANK_DIFFERENCE_ALLOWED) {
																						break;
																					}
																				}
																			}
																			this.setTakenStatus(p9.PlayerName, false);
																			if (teamDiff < RANK_DIFFERENCE_ALLOWED) {
																				break;
																			}
																		}
																	}
																	//this.setTakenStatus(p8.PlayerName, false);
																	//if (teamDiff < RANK_DIFFERENCE_ALLOWED) {
																	//	break;
																	//}
																//}
															//}
															this.setTakenStatus(p7.PlayerName, false);
															if (teamDiff < RANK_DIFFERENCE_ALLOWED) {
																break;
															}
														}
													}
													this.setTakenStatus(p6.PlayerName, false);
													if (teamDiff < RANK_DIFFERENCE_ALLOWED) {
														break;
													}
												}
											}
											this.setTakenStatus(p5.PlayerName, false);
											if (teamDiff < RANK_DIFFERENCE_ALLOWED) {
												break;
											}
										}
									}
									this.setTakenStatus(p4.PlayerName, false);
									if (teamDiff < RANK_DIFFERENCE_ALLOWED) {
										break;
									}
								}
							}
							this.setTakenStatus(p3.PlayerName, false);
							if (teamDiff < RANK_DIFFERENCE_ALLOWED) {
								break;
							}
						}
					}
					//this.setTakenStatus(p2.PlayerName, false);
					//if (teamDiff < RANK_DIFFERENCE_ALLOWED) {
						//break;
					//}
				//}
			//}
			this.setTakenStatus(p1.PlayerName, false);
			if (teamDiff < RANK_DIFFERENCE_ALLOWED) {
				break;
			}
		}
		
		if (team1.MT == null || team2.MT == null) {
			System.out.println("Error: not enough players in each role. More MTs needed.");
		}
		else if (team1.HS == null || team2.HS == null) {
			System.out.println("Error: not enough players in each role. More HSs needed.");
		}
		else if (team1.FDPS == null || team2.FDPS == null) {
			System.out.println("Error: not enough players in each role. More FDPSs needed.");
		}
		else if (team1.MS == null || team2.MS == null) {
			System.out.println("Error: not enough players in each role. More MSs needed.");
		}
		else if (team1.FS == null || team2.FS == null) {
			System.out.println("Error: not enough players in each role. More FSs needed.");
		}
		else {
			System.out.println("Team 1:");
			System.out.println("MT: " + team1.MT.PlayerName);
			System.out.println("HS: " + team1.HS.PlayerName);
			System.out.println("FDPS: " + team1.FDPS.PlayerName);
			System.out.println("MS: " + team1.MS.PlayerName);
			System.out.println("FS: " + team1.FS.PlayerName);
			System.out.println("avg: " + team1.calculateAvg());
			System.out.println("\nTeam 2:");
			System.out.println("MT: " + team2.MT.PlayerName);
			System.out.println("HS: " + team2.HS.PlayerName);
			System.out.println("FDPS: " + team2.FDPS.PlayerName);
			System.out.println("MS: " + team2.MS.PlayerName);
			System.out.println("FS: " + team2.FS.PlayerName);
			System.out.println("avg: " + team2.calculateAvg());
			MatchmadeGame thisGame = new MatchmadeGame(team1, team2);
			return thisGame;
		}
		return null;
	}

	public void printTeamsByRank() {
		Team maxRankTeam = new Team();
		int maxRank = 0;
		Team variableTeam = new Team();
		if (players.size() < 6) {
			System.out.println("Not enough players!");
			return;
		}
		System.out.println("Maximum rank team: ");
		for (Player p1 : players) {
			variableTeam.addPlayer(Role.MT, p1);
					for(Player p3 : players) {
						if (!(p3.equals(p1))) {
							variableTeam.addPlayer(Role.HS, p3);
							for(Player p4 : players) {
								if (!(p4.equals(p3)|| p4.equals(p1))) {
									variableTeam.addPlayer(Role.FDPS, p4);
										for(Player p5 : players) {
											if(!(p5.equals(p4) || p5.equals(p3) || p5.equals(p1))) {
												variableTeam.addPlayer(Role.MS, p5);
													for(Player p6 : players) {
														if(!(p6.equals(p5) || p6.equals(p4) || p6.equals(p3) || p6.equals(p1))) {
															variableTeam.addPlayer(Role.FS, p6);
															variableTeam.calculateAvg();
															if (variableTeam.teamAvg > maxRank) {
																maxRankTeam.copy(variableTeam);
																maxRank = variableTeam.teamAvg;
															}
														}
													}
											}
										}
								}
							}
						}
					}
		}
		System.out.println(maxRankTeam.MT.PlayerName);
		System.out.println(maxRankTeam.HS.PlayerName);
		System.out.println(maxRankTeam.FDPS.PlayerName);
		System.out.println(maxRankTeam.MS.PlayerName);
		System.out.println(maxRankTeam.FS.PlayerName);
		System.out.println(maxRankTeam.calculateAvg());
		players.remove(maxRankTeam.MT);
		players.remove(maxRankTeam.HS);
		players.remove(maxRankTeam.FDPS);
		players.remove(maxRankTeam.MS);
		players.remove(maxRankTeam.FS);	
		
		if (players.size() < 6) {
			return;
		}
		
		Team maxRankJVTeam = new Team();
		int maxJVrank = 0;
		System.out.println("\nMaximum rank JV Team:");
		for (Player p1 : players) {
			variableTeam.addPlayer(Role.MT, p1);
					for(Player p3 : players) {
						if (!(p3.equals(p1))) {
							variableTeam.addPlayer(Role.HS, p3);
							for(Player p4 : players) {
								if (!(p4.equals(p3) || p4.equals(p1))) {
									variableTeam.addPlayer(Role.FDPS, p4);
										for(Player p5 : players) {
											if(!(p5.equals(p4) || p5.equals(p3) || p5.equals(p1))) {
												variableTeam.addPlayer(Role.MS, p5);
													for(Player p6 : players) {
														if(!(p6.equals(p5) || p6.equals(p4) || p6.equals(p3) || p6.equals(p1))) {
															variableTeam.addPlayer(Role.FS, p6);
															variableTeam.calculateAvg();
															if (variableTeam.teamAvg > maxJVrank) {
																maxRankJVTeam.copy(variableTeam);
																maxJVrank = variableTeam.teamAvg;
															}
														}
													}
											}
										}
								}
							}
						}
					}
		}
		
		System.out.println(maxRankJVTeam.MT.PlayerName);
		System.out.println(maxRankJVTeam.HS.PlayerName);
		System.out.println(maxRankJVTeam.FDPS.PlayerName);
		System.out.println(maxRankJVTeam.MS.PlayerName);
		System.out.println(maxRankJVTeam.FS.PlayerName);
		System.out.println(maxRankJVTeam.calculateAvg());
		players.remove(maxRankJVTeam.MT);
		players.remove(maxRankJVTeam.HS);
		players.remove(maxRankJVTeam.FDPS);
		players.remove(maxRankJVTeam.MS);
		players.remove(maxRankJVTeam.FS);
		
		if (players.size() < 6) {
			return;
		}
		
		Team maxRankTeam3 = new Team();
		int maxTeam3Rank = 0;
		System.out.println("\nMaximum rank Academy Team:");
		for (Player p1 : players) {
			variableTeam.addPlayer(Role.MT, p1);
					for(Player p3 : players) {
						if (!(p3.equals(p1))) {
							variableTeam.addPlayer(Role.HS, p3);
							for(Player p4 : players) {
								if (!(p4.equals(p3)|| p4.equals(p1))) {
									variableTeam.addPlayer(Role.FDPS, p4);
										for(Player p5 : players) {
											if(!(p5.equals(p4) || p5.equals(p3) || p5.equals(p1))) {
												variableTeam.addPlayer(Role.MS, p5);
													for(Player p6 : players) {
														if(!(p6.equals(p5) || p6.equals(p4) || p6.equals(p3) || p6.equals(p1))) {
															variableTeam.addPlayer(Role.FS, p6);
															variableTeam.calculateAvg();
															if (variableTeam.teamAvg > maxTeam3Rank) {
																maxRankTeam3.copy(variableTeam);
																maxTeam3Rank = variableTeam.teamAvg;
															}
														}
													}
											}
										}
								}
							}
						}
					}
				
			
		}
		
		System.out.println(maxRankTeam3.MT.PlayerName);
		System.out.println(maxRankTeam3.HS.PlayerName);
		System.out.println(maxRankTeam3.FDPS.PlayerName);
		System.out.println(maxRankTeam3.MS.PlayerName);
		System.out.println(maxRankTeam3.FS.PlayerName);
		System.out.println(maxRankTeam3.calculateAvg());
		players.add(maxRankTeam.MT);
		players.add(maxRankTeam.HS);
		players.add(maxRankTeam.FDPS);
		players.add(maxRankTeam.MS);
		players.add(maxRankTeam.FS);
		players.add(maxRankJVTeam.MT);
		players.add(maxRankJVTeam.HS);
		players.add(maxRankJVTeam.FDPS);
		players.add(maxRankJVTeam.MS);
		players.add(maxRankJVTeam.FS);
	}

	public String stringTeamsByRank() {
		String optimalString = new String();
		Team maxRankTeam = new Team();
		int maxRank = 0;
		Team variableTeam = new Team();
		if (players.size() < 6) {
			return "Not enough players!";
		}
		optimalString += "Maximum rank team: ";
		optimalString += "\n";
		for (Player p1 : players) {
			variableTeam.addPlayer(Role.MT, p1);
					for(Player p3 : players) {
						if (!(p3.equals(p1))) {
							variableTeam.addPlayer(Role.HS, p3);
							for(Player p4 : players) {
								if (!(p4.equals(p3)|| p4.equals(p1))) {
									variableTeam.addPlayer(Role.FDPS, p4);
										for(Player p5 : players) {
											if(!(p5.equals(p4) || p5.equals(p3) || p5.equals(p1))) {
												variableTeam.addPlayer(Role.MS, p5);
													for(Player p6 : players) {
														if(!(p6.equals(p5) || p6.equals(p4) || p6.equals(p3) || p6.equals(p1))) {
															variableTeam.addPlayer(Role.FS, p6);
															variableTeam.calculateAvg();
															if (variableTeam.teamAvg > maxRank) {
																maxRankTeam.copy(variableTeam);
																maxRank = variableTeam.teamAvg;
															}
														}
													}
											}
										}
								}
							}
						}
					}
				
			
		}
		optimalString += maxRankTeam.MT.PlayerName;
		optimalString += "\n";
		optimalString += maxRankTeam.HS.PlayerName;
		optimalString += "\n";
		optimalString += maxRankTeam.FDPS.PlayerName;
		optimalString += "\n";
		optimalString += maxRankTeam.MS.PlayerName;
		optimalString += "\n";
		optimalString += maxRankTeam.FS.PlayerName;
		optimalString += "\n";
		optimalString += maxRankTeam.calculateAvg();
		optimalString += "\n";
		players.remove(maxRankTeam.MT);
		players.remove(maxRankTeam.HS);
		players.remove(maxRankTeam.FDPS);
		players.remove(maxRankTeam.MS);
		players.remove(maxRankTeam.FS);
		
		if (players.size() < 6) {
			return optimalString;
		}
		
		Team maxRankJVTeam = new Team();
		int maxJVrank = 0;
		optimalString += "\nMaximum rank JV Team:";
		optimalString += "\n";
		for (Player p1 : players) {
			variableTeam.addPlayer(Role.MT, p1);
					for(Player p3 : players) {
						if (!p3.equals(p1)) {
							variableTeam.addPlayer(Role.HS, p3);
							for(Player p4 : players) {
								if (!(p4.equals(p3) || p4.equals(p1))) {
									variableTeam.addPlayer(Role.FDPS, p4);
										for(Player p5 : players) {
											if(!(p5.equals(p4) || p5.equals(p3) || p5.equals(p1))) {
												variableTeam.addPlayer(Role.MS, p5);
													for(Player p6 : players) {
														if(!(p6.equals(p5) || p6.equals(p4) || p6.equals(p3) || p6.equals(p1))) {
															variableTeam.addPlayer(Role.FS, p6);
															variableTeam.calculateAvg();
															if (variableTeam.teamAvg > maxJVrank) {
																maxRankJVTeam.copy(variableTeam);
																maxJVrank = variableTeam.teamAvg;
															}
														}
													}
											}
										}
								}
							}
						}
					}
				
			
		}
		
		optimalString += maxRankJVTeam.MT.PlayerName;
		optimalString += "\n";
		optimalString += maxRankJVTeam.HS.PlayerName;
		optimalString += "\n";
		optimalString += maxRankJVTeam.FDPS.PlayerName;
		optimalString += "\n";
		optimalString += maxRankJVTeam.MS.PlayerName;
		optimalString += "\n";
		optimalString += maxRankJVTeam.FS.PlayerName;
		optimalString += "\n";
		optimalString += maxRankJVTeam.calculateAvg();
		optimalString += "\n";
		players.remove(maxRankJVTeam.MT);
		players.remove(maxRankJVTeam.HS);
		players.remove(maxRankJVTeam.FDPS);
		players.remove(maxRankJVTeam.MS);
		players.remove(maxRankJVTeam.FS);
		
		if (players.size() < 6) {
			return optimalString;
		}
		
		Team maxRankTeam3 = new Team();
		int maxTeam3Rank = 0;
		optimalString += "\nMaximum rank Academy Team:";
		optimalString += "\n";
		for (Player p1 : players) {
			variableTeam.addPlayer(Role.MT, p1);
					for(Player p3 : players) {
						if (!p3.equals(p1)) {
							variableTeam.addPlayer(Role.HS, p3);
							for(Player p4 : players) {
								if (!(p4.equals(p3) || p4.equals(p1))) {
									variableTeam.addPlayer(Role.FDPS, p4);
										for(Player p5 : players) {
											if(!(p5.equals(p4) || p5.equals(p3) || p5.equals(p1))) {
												variableTeam.addPlayer(Role.MS, p5);
													for(Player p6 : players) {
														if(!(p6.equals(p5) || p6.equals(p4) || p6.equals(p3) || p6.equals(p1))) {
															variableTeam.addPlayer(Role.FS, p6);
															variableTeam.calculateAvg();
															if (variableTeam.teamAvg > maxTeam3Rank) {
																maxRankTeam3.copy(variableTeam);
																maxTeam3Rank = variableTeam.teamAvg;
															}
														}
													}
											}
										}
								}
							}
						}
					}
				
			
		}
		
		optimalString += maxRankTeam3.MT.PlayerName;
		optimalString += "\n";
		optimalString += maxRankTeam3.HS.PlayerName;
		optimalString += "\n";
		optimalString += maxRankTeam3.FDPS.PlayerName;
		optimalString += "\n";
		optimalString += maxRankTeam3.MS.PlayerName;
		optimalString += "\n";
		optimalString += maxRankTeam3.FS.PlayerName;
		optimalString += "\n";
		optimalString += maxRankTeam3.calculateAvg();
		optimalString += "\n";
		players.add(maxRankTeam.MT);
		players.add(maxRankTeam.HS);
		players.add(maxRankTeam.FDPS);
		players.add(maxRankTeam.MS);
		players.add(maxRankTeam.FS);
		players.add(maxRankJVTeam.MT);
		players.add(maxRankJVTeam.HS);
		players.add(maxRankJVTeam.FDPS);
		players.add(maxRankJVTeam.MS);
		players.add(maxRankJVTeam.FS);
		return optimalString;
	}
	
	public void applyMatchResults(MatchmadeGame game, int winningTeam, int rankAdjustment) {
		if (winningTeam == 1) { //first-team/teamA/team1 won
			this.setRank(game.team1.FDPS, Role.FDPS, (game.team1.FDPS.FDPSrank + rankAdjustment));
			this.setRank(game.team1.HS, Role.HS, (game.team1.HS.HSrank + rankAdjustment));
			this.setRank(game.team1.MT, Role.MT, (game.team1.MT.MTrank + rankAdjustment));
			this.setRank(game.team1.MS, Role.MS, (game.team1.MS.MSrank + rankAdjustment));
			this.setRank(game.team1.FS, Role.FS, (game.team1.FS.FSrank + rankAdjustment));
			this.setRank(game.team2.FDPS, Role.FDPS, (game.team1.FDPS.FDPSrank - rankAdjustment));
			this.setRank(game.team2.HS, Role.HS, (game.team1.HS.HSrank - rankAdjustment));
			this.setRank(game.team2.MT, Role.MT, (game.team1.MT.MTrank - rankAdjustment));
			this.setRank(game.team2.MS, Role.MS, (game.team1.MS.MSrank - rankAdjustment));
			this.setRank(game.team2.FS, Role.FS, (game.team1.FS.FSrank - rankAdjustment));
		}
		if (winningTeam == 2){ //second-team/teamB/team2 won
			this.setRank(game.team2.FDPS, Role.FDPS, (game.team1.FDPS.FDPSrank + rankAdjustment));
			this.setRank(game.team2.HS, Role.HS, (game.team1.HS.HSrank + rankAdjustment));
			this.setRank(game.team2.MT, Role.MT, (game.team1.MT.MTrank + rankAdjustment));
			this.setRank(game.team2.MS, Role.MS, (game.team1.MS.MSrank + rankAdjustment));
			this.setRank(game.team2.FS, Role.FS, (game.team1.FS.FSrank + rankAdjustment));
			this.setRank(game.team1.FDPS, Role.FDPS, (game.team1.FDPS.FDPSrank - rankAdjustment));
			this.setRank(game.team1.HS, Role.HS, (game.team1.HS.HSrank - rankAdjustment));
			this.setRank(game.team1.MT, Role.MT, (game.team1.MT.MTrank - rankAdjustment));
			this.setRank(game.team1.MS, Role.MS, (game.team1.MS.MSrank - rankAdjustment));
			this.setRank(game.team1.FS, Role.FS, (game.team1.FS.FSrank - rankAdjustment));
		}
		else { //draw or other outcome, don't do anything
			return;
		}
	}

	public void savePlayers() {
		try {
			FileOutputStream fileOut = new FileOutputStream("savedPlayers.ser");
			ObjectOutputStream out = new ObjectOutputStream(fileOut);
			out.writeObject(this);
			out.close();
		} catch (IOException i){
			i.printStackTrace();
			return;
		}
	}

	public void loadOldData() {
		Player p1 = new Player("Timoteo",			31,	0,	0,	0,	0);
		Player p2 = new Player("CliffordBeThicc",	27,	0,	0,	0,	0);
		Player p3 = new Player("Justinian",			24,	0,	0,	0,	0);
		Player p4 = new Player("buckethead",		0,	31,	0,	0,	0);
		Player p5 = new Player("spike",				0,	0,	28,	0,	0);
		Player p6 = new Player("liftkey",			0,	0,	31,	0,	0);
		Player p7 = new Player("jakob1",			0,	25,	0,	0,	0);
		Player p8 = new Player("n i c k",			0,	0,	21,	0,	0);
		Player p9 = new Player("tj pexa",			0,	0,	8,	0,	0);
		Player p10= new Player("zmans",				0,	0,	0,	0,	35);
		Player p11= new Player("sam",				0,	0,	0,	35,	0);
		Player p12= new Player("mlg not",			0,	0,	0,	0,	32);
		Player p13= new Player("YupYup",			0,	0,	0,	29,	0);
		Player p14= new Player("krogaha",			0,	0,	0,	0,	25);
		Player p15= new Player("otter",				0,	0,	0,	0,	21);
		Player p16= new Player("coolish",			0,	0,	0,	18,	0);
		Player p17= new Player("jpz",				0,	0,	0,	0,	14);
		Player p18= new Player("GamerApe",			0,	0,	0,	10,	0);
		Player p19= new Player("BeanyPenguin",		0,	0,	0,	0,	10);
		Player p20= new Player("Poyo",				0,	0,	0,	0,	14);
		final Player[] initialList = {p1, p2, p3, p4, p5, p6, p7, p8, p9, p10, p11, p12, p13, p14, p15, p16, p17, p18, p19, p20};
		for (Player p : initialList) {
			this.addPlayer(p);
		}
		
	}

	public void loadNewData() {
		
	}
	
	public void pruneList() {
		ArrayList<Player> removeList = new ArrayList<Player>();
		for (Player p : MTs) {
			if(p.MTrank == 0) {
				removeList.add(p);
			}
		}
		for (Player p : removeList) {
			MTs.remove(MTs.indexOf(p));
		}
		removeList.clear();
		for (Player p : HSs) {
			if(p.HSrank == 0) {
				removeList.add(p);
			}
		}
		for (Player p : removeList) {
			HSs.remove(HSs.indexOf(p));
		}
		removeList.clear();
		for (Player p : FDPSs) {
			if(p.FDPSrank == 0) {
				removeList.add(p);
			}
		}
		for (Player p : removeList) {
			FDPSs.remove(FDPSs.indexOf(p));
		}
		removeList.clear();
		for (Player p : MSs) {
			if(p.MSrank == 0) {
				removeList.add(p);
			}
		}
		for (Player p : removeList) {
			MSs.remove(MSs.indexOf(p));
		}
		removeList.clear();
		for (Player p : FSs) {
			if(p.FSrank == 0) {
				removeList.add(p);
			}
		}
		for (Player p : removeList) {
			FSs.remove(FSs.indexOf(p));
		}
		removeList.clear();
	}

}
