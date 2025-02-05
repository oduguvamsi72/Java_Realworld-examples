package javaproject;

 class animal {
	void makesound() {
		System.out.println("hyyy.");
	}
}

class cat extends animal {
	void bark() {
		System.out.println("Bowww.");
	}
}
public class inheritance{
	public static void main(String[] args) {
		cat c=new cat();
		c.bark();
		c.makesound();
	}
}