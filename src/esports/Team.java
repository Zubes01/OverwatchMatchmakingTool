package esports;

public class Team {
	public int teamAvg;
	public Player MT;
	public Player HS;
	public Player FDPS;
	public Player MS;
	public Player FS;
	
	public Team() {
		teamAvg = 0;
	}
	
	public int calculateAvg(){
		teamAvg = (MT.MTrank + HS.HSrank + FDPS.FDPSrank + MS.MSrank + FS.FSrank)/5;
		return teamAvg;
	}
	
	public void addPlayer(Role role, Player player) {
		switch (role) {
			case MT:
				MT =  player;
			case HS:
				HS = player;
			case FDPS:
				FDPS = player;
			case MS:
				MS = player;
			case FS:
				FS = player;
		}
	}
	
	public void copy(Team team) {
		teamAvg = team.teamAvg;
		MT = team.MT;
		HS = team.HS;
		FDPS = team.FDPS;
		MS = team.MS;
		FS = team.FS;
	}
	
	public boolean containsZeroRank() {
		boolean returnVal = false;
		if(MT.MTrank == 0 || HS.HSrank == 0 || FDPS.FDPSrank == 0 || MS.MSrank == 0 || FS.FSrank == 0) {
			returnVal = true;
		}
		return returnVal;
	}
}
