package javaproject;

class phone {
	
	String brand;
	
	phone(String brand) {
		this.brand = brand;
	}

	void makecall(String number) {
		System.out.println(brand + "is calling" + number);
	}

	void sms(String number, String msg) {
		System.out.println("Sending msg to" + number + ":" + msg);
	}
}

class smartphone extends phone {
	boolean beingtouthed;

	smartphone(String brand, boolean beingtouthed) {
		super(brand);
		this.beingtouthed = beingtouthed;
	}

	void browseinternet() {
		System.out.println(brand + "is running the internet.");
	}
}

public class inheritanceex1 {
	public static void main(String[] args) {
		smartphone s = new smartphone("samsung", true);
		s.makecall("876463766");
		s.sms("734678364", "Hello");
		s.browseinternet();
	}
}
