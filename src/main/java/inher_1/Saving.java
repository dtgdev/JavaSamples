package inher_1;

import java.util.Random;

public class Saving extends Account {

    public Saving(String name, String ssn) {
        super(name, ssn);
        System.out.println("Saving Constructor");
    }


    @Override
    public String toString() {
        return " Saving : name : "+getName()+"  ssn: "+getSsn()+"  acctno: "+getAcctno()+" balance: "+getBalance();
    }
}
