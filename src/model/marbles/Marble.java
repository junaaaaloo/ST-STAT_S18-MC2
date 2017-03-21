package model.marbles;

import javafx.scene.paint.Color;

public class Marble {
	private Color color;
	
	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
	public Marble clone () {
		Marble clone = new Marble ();
		clone.setColor(color);
		return clone;
	}
}
