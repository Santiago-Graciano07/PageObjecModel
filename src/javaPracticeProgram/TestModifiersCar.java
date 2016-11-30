package javaPracticeProgram;

import vehicle.Car;

public class TestModifiersCar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

Car nissan = new Car();
		
		nissan.sModel = "2010";
		Car.iColor = "black";
		nissan.iHighestSpeed = 300;
		
		nissan.DisplayCharacterstics();
	}

}
