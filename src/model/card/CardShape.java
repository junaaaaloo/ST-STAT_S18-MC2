package model.card;

public enum CardShape {
	SPADE, HEART, CLOVER, CLUB, UNSPECIFIED;
	
	public String toString () {
		switch (this) {
			case SPADE:
				return "Spade";
			case HEART:
				return "Heart";
			case CLOVER:
				return "Clover";
			case CLUB:
				return "Club";
			case UNSPECIFIED:
			default:
				return "Unspecified";
		}
	}
	
	public static CardShape of (String shape){
		switch (shape.toLowerCase()) {
			case "spade":
				return SPADE;
			case "heart":
				return HEART;
			case "clover":
				return CLOVER;
			case "club":
				return CLUB;
			default:
				return UNSPECIFIED;
		}
	}
	
	public boolean equals (CardShape ofYou) {
		if (ofYou == UNSPECIFIED)
			return true;
		else
			return ofYou == this;
	}
}
