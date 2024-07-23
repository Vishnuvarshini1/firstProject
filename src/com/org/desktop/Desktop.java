package com.org.desktop;

import com.org.hardware.Hardware;
import com.org.software.Software;

public class Desktop implements Hardware,Software{
@Override	
public void hardwareResource() {
	System.out.println("Hardware Resource");
}
@Override
public void softwareResource() {
	System.out.println("Software Resource");
}
public void desktopModel() {
	System.out.println("Desktop");
}
public static void main(String[] args) {
	Hardware h = new Desktop();
	h.hardwareResource();
	Software s  = new Desktop();
	s.softwareResource();
	
}
}
