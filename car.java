package javaproject;

public class car {
	String brand;
	int price;
	int speed;
	
	car(String brand,int price,int speed){
		this.brand=brand;
		this.price=price;
		this.speed=speed;

	}
	
	void displaycar() {
		System.out.println("car brand:"+brand);
		System.out.println("car price:"+price);
		System.out.println("car speed:"+speed);
		System.out.println("");

	}
	public static void main(String[] args) {
		car c=new car("Audi",292329,183);
		car c1=new car("suziki",292000,300);
		c.displaycar();
		c1.displaycar();
		
	}
}
