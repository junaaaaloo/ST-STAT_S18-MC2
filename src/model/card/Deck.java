package model.card;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Deck {
	private List <Card> cards;
	
	public Deck () {
		initializeCards();
	}
	
	public void shuffle () {
		Collections.shuffle(cards);
	}
	
	public Card pick () {
		Random rand = new Random();
		return cards.get(rand.nextInt(cards.size()));
	}
	
	public void initializeCards () {
		cards = new ArrayList <Card> ();
		
		for (CardShape shape:CardShape.values()) {
			for (CardValue value: CardValue.values()) {
				if(shape != CardShape.UNSPECIFIED || value != CardValue.UNSPECIFIED) {
					Card newCard = new Card ();
					newCard.setShape(shape);
					newCard.setValue(value);
					cards.add(newCard);
				}
			}
		}
	}
	public List <Card> getCards() {
		return cards;
	}
}
