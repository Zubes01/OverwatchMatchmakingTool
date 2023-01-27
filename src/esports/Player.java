package esports;

public class Player implements java.io.Serializable{
	public String PlayerName;
	public int MTrank;
	public int OTrank;
	public int HSrank;
	public int FDPSrank;
	public int MSrank;
	public int FSrank;
	public boolean taken;
	public Player(String name, int MT, int HS, int FDPS, int MS, int FS) {
		PlayerName = name;
		MTrank = MT;
		HSrank = HS;
		FDPSrank = FDPS;
		MSrank = MS;
		FSrank = FS;
		taken = false;
	}
	
	public boolean equals (Player p) {
		if(PlayerName.equals(p.PlayerName)) {
			return true;
		}
		return false;
	}
	
	public String toString() {
		return PlayerName;
	}
}
