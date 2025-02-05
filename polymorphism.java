package javaproject;

class vehicle {
//single  parameter
	void speed(int maxspeed) {
		System.out.println("Vehicle speed:" + maxspeed + "KMPH");
	}

//	overloaded method with two parameters
	void speed(int maxspeed, String unit) {
		System.out.println("Vehicle speed:" + maxspeed + "KMPH per:"+ unit);
	}
}

public class polymorphism {
//runtime-overriding
//compiletime-overloading
	public static void main(String[] args) {
		vehicle s = new vehicle();
		s.speed(180);
		s.speed(200, "2050");
	}
}
