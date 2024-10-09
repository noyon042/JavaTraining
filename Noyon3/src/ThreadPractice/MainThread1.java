package ThreadPractice;

public class MainThread1 {

	public static void main(String[] args) {
	

		BankAccount bankAccount = new BankAccount();

	       Thread1  thread1=new Thread1(bankAccount, "First person is Noyon", 30000);
	       Thread2  thread2=new Thread2(bankAccount, "Second person is Nabil", 20000);
	       Thread3  thread3=new Thread3(bankAccount, "Third person is Amirul", 10000);
	       
	       thread1.start();
	       thread2.start();
	       thread3.start();
	       
	     
	       

	}

}
