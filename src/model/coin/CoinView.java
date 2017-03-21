package model.coin;

import javafx.scene.Node;
import javafx.scene.image.ImageView;

public class CoinView {
	private ImageView heads;
	private ImageView tails;
	private Coin coin;
	
	public void setCoin(Coin coin) {
		this.coin = coin;
	}
	
	public ImageView getHeads() {
		return heads;
	}
	
	public void setHeads(ImageView heads) {
		this.heads = heads;
	}
	
	public ImageView getTails() {
		return tails;
	}
	
	public void setTails(ImageView tails) {
		this.tails = tails;
	}
	
	public Node getCoin () {
		Node node;
		
		return node;
	}
}
