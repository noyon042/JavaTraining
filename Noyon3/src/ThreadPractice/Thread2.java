package ThreadPractice;

public class Thread2 extends Thread{



	BankAccount bankAccount;
    String name;
    int amount;

    Thread2(BankAccount bankAccount,String name,int amount){
        this.bankAccount = bankAccount;
        this.name = name;
        this.amount = amount;
    }


    public void run(){
    	bankAccount.withdrawAmount(name,amount);
    }
}
