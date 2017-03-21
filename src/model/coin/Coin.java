package model.coin;

import java.util.Random;

public class Coin {
	private boolean heads;
	
	public boolean isHeads() {
		return heads;
	}
	
	public boolean flip () {
		Random rand = new Random();
		this.heads = rand.nextBoolean();
		return isHeads();
	}
}
