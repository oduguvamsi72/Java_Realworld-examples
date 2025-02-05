package javaproject;

import java.util.Scanner;

interface payment {
	void pay(Double amount);
}

class creaditcardpayment implements payment {
	@Override
	public void pay(Double amount) {
		System.out.println("paid:" + amount + "using creditcard payment.");
	}
}

class phonepaypayment implements payment {
	@Override
	public void pay(Double amount) {
		System.out.println("paid:" + amount + "using phonepay.");
	}
}

class googlepaypayment implements payment {
	@Override
	public void pay(Double amount) {
		System.out.println("paid:" + amount + "using googlepay.");
	}
}

public class paymentgateway {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount:");
		Double amount = sc.nextDouble();
		int uservalue;

		do {
			diaplaymenu();
			System.out.println("Enter Value:");
			uservalue = Integer.parseInt(sc.next());
			payment paymentmethod = null;
			switch (uservalue) {
			case 1:
				paymentmethod = new creaditcardpayment();
				break;
			case 2:
				paymentmethod = new phonepaypayment();
				break;
			case 3:
				paymentmethod = new googlepaypayment();
				break;
			default:
				System.out.println("invalid payment");
			}
			paymentmethod.pay(amount);
		} while (uservalue > 0);
	}

	private static void diaplaymenu() {
		System.out.println("Select a payment method");
		System.out.println("1.creditcard payment");
		System.out.println("2.phonepay payment");
		System.out.println("3.googlepay payment");
	}
}
