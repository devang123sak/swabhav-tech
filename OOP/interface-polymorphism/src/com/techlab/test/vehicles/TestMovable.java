package com.techlab.test.vehicles;

import com.techlab.vehicles.Bike;
import com.techlab.vehicles.Car;
import com.techlab.vehicles.IMovable;
import com.techlab.vehicles.Truck;

public class TestMovable {

	public static void main(String[] args) {

		IMovable[] obj = new IMovable[3];
		obj[0] = new Bike();
		obj[1] = new Car();
		obj[2] = new Truck();

		startRace(obj);
	}

	public static void startRace(IMovable[] obj) {

		System.out.println("Race is Start");
		for (IMovable p : obj)
			p.move();
		System.out.println("Race is Finished");

	}

}
