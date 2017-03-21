package model.card;

public enum CardValue {
	ACE, TWO, THREE, FOUR, FIVE, SIX, SEVEN, EIGHT, NINE, TEN, JACK, QUEEN, KING, JOKER, UNSPECIFIED;
	
	public static CardValue valueOf (int value) {
		switch (value) {
			case 0: return JOKER;
			case 1: return ACE;
			case 2: return TWO;
			case 3: return THREE;
			case 4: return FOUR;
			case 5: return FIVE;
			case 6: return SIX;
			case 7: return SEVEN;
			case 8: return EIGHT;
			case 9: return NINE;
			case 10: return TEN;
			case 11: return JACK;
			case 12: return QUEEN;
			case 13: return KING;
			default: return UNSPECIFIED;
		}
	}
	
	public static CardValue of (String value) {
		switch (value.toLowerCase()) {
			case "joker": return JOKER;
			case "ace": return ACE;
			case "two": return TWO;
			case "three": return THREE;
			case "four": return FOUR;
			case "five": return FIVE;
			case "six": return SIX;
			case "seven": return SEVEN;
			case "eight": return EIGHT;
			case "nine": return NINE;
			case "ten": return TEN;
			case "jack": return JACK;
			case "queen": return QUEEN;
			case "king": return KING;
			default: return UNSPECIFIED;
		}
	}
	
	public String toString () {
		switch(this) {
			case ACE: return "Ace";
			case TWO: return "Two";
			case THREE: return "Three";
			case FOUR: return "Four";
			case FIVE: return "Five";
			case SIX: return "Six";
			case SEVEN: return "Seven";
			case EIGHT: return "Eight";
			case NINE: return "Nine";
			case TEN: return "Ten";
			case JACK: return "Jack";
			case QUEEN:	return "Queen";
			case KING: return "King";
			case JOKER: return "Joker";
			case UNSPECIFIED:
			default: return "Unspecified";
		}
	}
	
	public static int valueOf (CardValue ofYou) {
		switch (ofYou) {
		case ACE: return 1;
		case TWO: return 2;
		case THREE: return 3;
		case FOUR: return 4;
		case FIVE: return 5;
		case SIX: return 6;
		case SEVEN: return 7;
		case EIGHT: return 8;
		case NINE: return 9;
		case TEN: return 10;
		case JACK: return 11;
		case QUEEN: return 12;
		case KING: return 13;
		case UNSPECIFIED:
		default: return -1;
		}
	}
	
	public boolean equals (CardValue ofYou) {
		if (ofYou == UNSPECIFIED)
			return true;
		else
			return ofYou == this;
	}
}
