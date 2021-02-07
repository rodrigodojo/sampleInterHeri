package entities;

import enums.Color;

public abstract class AbtractShape implements Shape {
	
	private Color color;

	public AbtractShape(Color color) {
		this.color = color;
	}

	public Color getColor() {
		return color;
	}

	public void setColor(Color color) {
		this.color = color;
	}
	
}
