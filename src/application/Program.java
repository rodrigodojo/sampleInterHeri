package application;

import entities.*;
import enums.Color;

public class Program {

	public static void main(String[] args) {
		
		AbtractShape s1 = new Circle(Color.BLACK,2.0);
		AbtractShape s2 = new Rectangle(Color.WHITE, 3.0, 4.0);
		
		System.out.println("Circle color: "+ s1.getColor());
		System.out.println("Circle area: "+ String.format("%.2f", s1.area()));
		System.out.println("Rectangle color: "+ s2.getColor());
		System.out.println("Retangle area: "+ String.format("%.2f", s2.area()));
		
	}

}
