package com.learn;
class Modifier_Test {
 String name ="default variable";
 void test() {
	System.out.println("Default Method");
}
	public static void main(String[] args) {
		
		Modifier_Test m = new Modifier_Test();
		System.out.println(m.name);
		m.test();

	}

}
