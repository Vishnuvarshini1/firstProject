package org.computer;

public class Desktop extends Computer {
	public void desktopsize() {
		System.out.println("Desktop size is: 18");
	}
	public static void main(String[] args) {
		Desktop d = new Desktop();
		d.desktopsize();
		d.computerModel();
	}
}
