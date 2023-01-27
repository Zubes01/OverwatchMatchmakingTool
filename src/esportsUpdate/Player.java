package esportsUpdate;

public class Player implements java.io.Serializable{
	public String PlayerName;
	public int MTrank;
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
	
	public int rankStringToRankInt(String rank) {
		int startingVal;
		if (rank.charAt(0) == 'B' || rank.charAt(0) == 'b') {
			startingVal = 6;
		}
		else if (rank.charAt(0) == 'S' || rank.charAt(0) == 's') {
			startingVal = 11;
		}
		else if ((rank.charAt(0) == 'G' || rank.charAt(0) == 'g') && (rank.charAt(1) != 'M' || rank.charAt(1) != 'm')){
			startingVal = 16;
		}
		else if (rank.charAt(0) == 'P' || rank.charAt(0) == 'p') {
			startingVal = 21;
		}	
		else if (rank.charAt(0) == 'D' || rank.charAt(0) == 'd') {
			startingVal = 26;
		}
		else if (rank.charAt(0) == 'M' || rank.charAt(0) == 'm') {
			startingVal = 31;
		}
		else if ((rank.charAt(0) == 'G' || rank.charAt(0) == 'g') && (rank.charAt(1) == 'M' || rank.charAt(1) == 'm')){
			startingVal = 36;
		}
		else if (rank.charAt(0) == 'T' || rank.charAt(0) == 't') {
			return 36;
		}
		else {
			return 0;
		}
		
		if (rank.contains("1")) {
			return startingVal - 1;
		}
		else if (rank.contains("2")) {
			return startingVal - 2;
		}
		else if (rank.contains("3")) {
			return startingVal - 3;
		}
		else if (rank.contains("4")) {
			return startingVal - 4;
		}
		else if (rank.contains("5")) {
			return startingVal - 5;
		}
		else {
			return 0;
		}
	}

	public String rankIntToRankString(int rank) {
		if (rank > 35) {
			return "T500";
		}
		if (rank < 0) {
			return "B500";
		}
		switch(rank) {
			case 35:
				return "GM1";
			case 34:
				return "GM2";
			case 33:
				return "GM3";
			case 32:
				return "GM4";
			case 31:
				return "GM5";
			case 30:
				return "M1";
			case 29:
				return "M2";
			case 28:
				return "M3";
			case 27:
				return "M4";
			case 26:
				return "M5";
			case 25:
				return "D1";
			case 24:
				return "D2";
			case 23:
				return "D3";
			case 22:
				return "D4";
			case 21:
				return "D5";
			case 20:
				return "P1";
			case 19:
				return "P2";
			case 18:
				return "P3";
			case 17:
				return "P4";
			case 16:
				return "P5";
			case 15:
				return "G1";
			case 14:
				return "G2";
			case 13:
				return "G3";
			case 12:
				return "G4";
			case 11:
				return "G5";
			case 10:
				return "S1";
			case 9:
				return "S2";
			case 8:
				return "S3";
			case 7:
				return "S4";
			case 6:
				return "S5";
			case 5:
				return "B1";
			case 4:
				return "B2";
			case 3:
				return "B3";
			case 2:
				return "B4";
			case 1:
				return "B5";
			default:
				return "NA";
				
		}
	}
	
	public String toString() {
		return PlayerName;
	}
}
