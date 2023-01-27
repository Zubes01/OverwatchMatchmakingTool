package esportsUpdate;

public class MatchmadeGame {
	public Team team1;
	public Team team2;
	
	public MatchmadeGame(Team teamA, Team teamB){
		team1 = new Team();
		team2 = new Team();
		team1.copy(teamA);
		team2.copy(teamB);
	}
	
	public String toString() {
		String result = new String();
		result += "Team 1:\nMT: " + team1.MT.PlayerName;
		result += "\nHS: " + team1.HS.PlayerName;
		result += "\nFDPS: " + team1.FDPS.PlayerName;
		result += "\nMS: " + team1.MS.PlayerName;
		result += "\nFS: " + team1.FS.PlayerName;
		result += "\nAverage: " + team1.teamAvg;
		result += "\n\nTeam 2: \nMT: " + team2.MT.PlayerName;
		result += "\nHS: " + team2.HS.PlayerName;
		result += "\nFDPS: " + team2.FDPS.PlayerName;
		result += "\nMS: " + team2.MS.PlayerName;
		result += "\nFS: " + team2.FS.PlayerName;
		result += "\nAverage: " + team2.teamAvg;
		return result;
	}
}
