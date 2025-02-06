package javaproject;

abstract class vehicle1 {
	abstract void start();

	public void stop() {
		System.out.println("vehicle stoped.");
	}
}
class car1 extends vehicle1{

	@Override
	void start() {
		System.out.println("vehicle started.");
		
	}
	
}

public class abstraction {
	public static void main(String[] args) {
vehicle1 v=new car1();
v.start();
v.stop();
	}
}
