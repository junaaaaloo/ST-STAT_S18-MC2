package model.marbles;

import java.util.Collections;
import java.util.List;
import java.util.Random;

public class Jar {
	private List <Marble> marbles;
	
	public void setMarbles (List <Marble> marbles) {
		this.marbles = marbles;
	}
	
	public void clearMarbles () {
		marbles.clear();
	}
	
	public void shuffle () {
		Collections.shuffle(marbles);
	}
	
	public Marble randomPick () {
		Random rand = new Random ();
		return marbles.get(rand.nextInt(marbles.size()));
	}
}
