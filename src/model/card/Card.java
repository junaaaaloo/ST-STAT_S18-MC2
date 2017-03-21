package model.card;

public class Card{
	private CardShape shape;
	private CardValue value;
	
	public CardShape getShape () {
		return shape;
	}
	
	public CardValue getValue () {
		return value;
	}
	
	public void setShape (CardShape shape) {
		this.shape = shape;
	}
	
	public void setValue (CardValue value) {
		this.value = value;
	}
}
