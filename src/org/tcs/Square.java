package org.tcs;

public class Square extends Circle {
@Override
	public void draw() {
		System.out.println("Drawing a square");
	}
	public static void main(String[] args) {
		Shape s = new Shape();
		s.draw();
		Shape s1 = new Circle();
		s1.draw();
		Shape s2 = new Square();
		s2.draw();
	}
}
