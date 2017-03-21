package model.coin;

public class CoinsExperiment {
	private Coin coin;
	private Coin success;

	public void defineSuccess (Coin success) {
		this.success = success;
	}
	
	public void generateExperiment (int trials) {
		while (trials != 0) {
			coin.flip();
			trials --;
		}
	}
}
