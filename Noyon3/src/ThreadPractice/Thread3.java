package ThreadPractice;

public class Thread3 extends Thread{


	BankAccount bankAccount;
    String name;
    int amount;

    Thread3(BankAccount bankAccount,String name,int amount){
        this.bankAccount = bankAccount;
        this.name = name;
        this.amount = amount;
    }


    public void run(){
    	bankAccount.withdrawAmount(name,amount);
    }
}
