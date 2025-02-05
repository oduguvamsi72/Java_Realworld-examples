package javaproject;

//------------------------ Main Class -------------------------
class bankaccount {
    Double balance;

    bankaccount(Double balance) {
        this.balance = balance;
    }

    void calculateinterest() {
        System.out.println("Calculating interest on balance: " + balance);
    }
}

//------------------------ Subclass -------------------------
class currentaccount extends bankaccount {

    currentaccount(Double balance) {
        super(balance);
    }

    @Override
    void calculateinterest() {
        Double interest = balance * 0.10;
        System.out.println("Interest Calculated: " + interest);
    }
}

public class banksystempoly {
    public static void main(String[] args) {
        bankaccount b = new currentaccount(1000.0);
        b.calculateinterest();
        bankaccount n=new bankaccount(5000.0);
        n.calculateinterest();
    }
}
