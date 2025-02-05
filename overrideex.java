package javaproject;

class animal1 {
	void makesound() {
System.out.println("Animal make sound!");
	}
}
class dog1 extends animal1{
	@Override
	void makesound() {
		System.out.println("dog barks!");
	}
}

public class overrideex {
	public static void main(String[] args) {
		animal1 a=new dog1();
		a.makesound();
		animal1 b=new animal1();
		b.makesound();
		
	}
}
