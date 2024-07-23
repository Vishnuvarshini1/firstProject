package org.allvehicle;

import org.fourwheeler.FourWheeler;
import org.threewheeler.ThreeWheeler;
import org.twowheeler.TwoWheeler;

public class Vehicle {
	public void vehicleNecessary() {
		System.out.println("Vehicle Necessary for Transport");
	}
	public static void main(String[] args) {
		Vehicle v = new Vehicle();
		v.vehicleNecessary();
		TwoWheeler tw = new TwoWheeler();
		tw.bike();
		tw.cycle();
		ThreeWheeler thw = new ThreeWheeler();
		thw.auto();
		FourWheeler fw = new FourWheeler();
		fw.car();
		fw.bus();
		fw.lorry();
		
	}
}
