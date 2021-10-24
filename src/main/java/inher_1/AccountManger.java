package inher_1;

public class AccountManger {

    public void createAccount(){

//        Account account = new Account("Tom Brady", "222-22-4322");
//        System.out.println(account.toString());

        Checking checking = new Checking("Tom Brady", "222-22-4322");
        checking.creatAccountNo(); // this create an account number
        checking.deposit(500.00);
        System.out.println(checking.toString());
        System.out.println("Cheking Int Rate: "+checking.getIntRate());

        Saving saving = new Saving("Tom Brady", "222-22-4322");
        saving.creatAccountNo(); // this create an account number
        saving.deposit(9000.00);
        System.out.println(saving.toString());
        System.out.println("Saving Int Rate: "+saving.getIntRate());

        //Create a Saving account

    }

    public void dispaly(){

    }


    public static void main(String[] args) {
        AccountManger accountManger = new AccountManger();
        accountManger.createAccount();
    }
}
