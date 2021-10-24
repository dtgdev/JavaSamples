package inher_1;

import java.util.Random;

public class Account {
    private String name;
    private String ssn;
    private double balance;
    private int acctno;
    Random rand = new Random();
    private double intRate = .03;


//
//    //this is a default constructor
    public Account(){

    }

    public Account(String name, String ssn) {
        System.out.println("Parent Constructor");
        this.name = name;
        this.ssn = ssn;

    }

    public void creatAccountNo(){
        this.acctno = rand.nextInt(100000);
    }


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public String getSsn() {
        return ssn;
    }

    public void setSsn(String ssn) {
        this.ssn = ssn;
    }

    public double deposit(double balance) {
        return this.balance += balance;
    }


    public double witdrawal(double balance) {
        if (this.balance < balance) {
            return -1;
        }
        return this.balance -= balance;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public int getAcctno() {
        return acctno;
    }

    public void setAcctno(int acctno) {
        this.acctno = acctno;
    }

    public void setIntRate(double intRate) {
        this.intRate = intRate;
    }

    public double getIntRate() {
        return intRate;
    }

    @Override
    public String toString() {
        return (name + " ssn = " + ssn );

    }
}
