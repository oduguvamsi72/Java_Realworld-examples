package javaproject;

import java.util.Scanner;

//abstract method
abstract class bankstmt {
	protected String accholder;
	protected Double balance;

//constructor
	public bankstmt(String accholder, Double balance) {
		this.accholder = accholder;
		this.balance = balance;
	}

	abstract void calinterest();

	public void deposit(Double amount) {
		balance += amount * 0.05;
		System.out.println("deposted amount is." + amount + "New balance is" + balance);
	}

	public void withdraw(Double amount) {
		if (amount > balance) {
			System.out.println("insufficient amount.");
		} else {
			balance -= amount;
			System.out.println("withdraw amount is." + amount + "New balance is" + balance);

		}
	}

	public void displaybalance() {
		System.out.println("accholder:" + accholder);
		System.out.println("balance is:" + balance);
	}
}

class savingacc extends bankstmt {
	private Double rate = 5.0;

	public savingacc(String accholder, Double balance) {
		super(accholder, balance);
	}

	void calinterest() {
		Double interest = (balance * rate) / 100;
		balance += interest;
		System.out.println("interest added." + interest + "balance is" + balance);
	}
}

class currentacc extends bankstmt {
	private Double rate = 6.0;

	public currentacc(String accholder, Double balance) {
		super(accholder, balance);
	}

	void calinterest() {
		Double interest = (balance * rate) / 100;
		balance += interest;
		System.out.println("interest added." + interest + "balance is" + balance);
	}
}

public class banksysabstract {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		bankstmt b=new savingacc("vamsi",70000.0);
		b.displaybalance();
		b.calinterest();
		b.deposit(3563517.0);
		b.withdraw(724545.0);

	}
}
