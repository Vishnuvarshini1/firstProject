package org.phone;

public class InternalStorage {
	public void processorName() {
		System.out.println("Processor Name : Snapdragon 6 series");
	}
	public void ramSize() {
		System.out.println("ram size: 16GB");
	}
	public static void main(String[] args) {
		ExternalStorage es = new ExternalStorage();
		es.size();
		InternalStorage is = new InternalStorage();
		is.processorName();
		is.ramSize();
	}
}
