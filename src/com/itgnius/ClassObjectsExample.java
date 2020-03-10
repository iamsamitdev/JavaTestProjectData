package com.itgnius;

class Lamp {
	boolean status;

	void turnOn() {
		status = true;
	}

	void turnOff() {
		status = false;
	}

	void displayLightStatus() {
		System.out.println("Light on? " + status);
	}
}

public class ClassObjectsExample {

	public static void main(String[] args) {
		
		// Create Object
		Lamp l1 = new Lamp();
		Lamp l2 = new Lamp();
		
		// Access members
		l1.turnOn();
		l2.turnOff();
		
		l1.displayLightStatus();
		l2.displayLightStatus();		

	}

}
