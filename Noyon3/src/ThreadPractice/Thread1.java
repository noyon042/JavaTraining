package ThreadPractice;

public class Thread1 extends Thread {

	BankAccount bankAccount;
    String name;
    int amount;

    Thread1(BankAccount bankAccount,String name,int amount){
        this.bankAccount = bankAccount;
        this.name = name;
        this.amount = amount;
    }


    public void run(){
    	bankAccount.withdrawAmount(name,amount);
    }
}
