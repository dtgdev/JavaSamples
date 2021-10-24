package inher_1;

import java.util.Random;

public class Checking extends Account {
    private double intRate = 0.1;

    Random rand = new Random();

    public Checking(String name, String ssn) {
        super(name,ssn); // It should call the parent constructor first
        System.out.println("Checking Constructor");

    }

    @Override
    public void setIntRate(double intRate) {
       this.intRate = intRate;
    }

    @Override
    public double getIntRate() {
        return intRate;
    }

    @Override
    public String toString() {
        return "Checking : name : "+getName()+"  ssn: "+getSsn()+"  acctno: "+getAcctno()+" balance: "+getBalance();
    }
}
