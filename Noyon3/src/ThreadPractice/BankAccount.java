package ThreadPractice;

public class BankAccount {
	int totalAmount =50000;
	
	//method synchronization
//    public synchronized void withdrawAmount(String name,int amount){
//
//        if(totalAmount >= amount){
//            System.out.println("This amount withdraw by "+name);
//            totalAmount = totalAmount -amount;
//        }
//        else
//        {
//            System.out.println("This bank has not sufficient fund.");
//        }
//
//    }
	
	//Block synchronization
    public void withdrawAmount(String name,int amount){

    	synchronized (this) {
			
		String name1="Noyon Taj";
        if(totalAmount >= amount){
            System.out.println("This amount withdraw by "+name);
            totalAmount = totalAmount -amount;
        }
        else
        {
            System.out.println("This bank has not sufficient fund.");
        }
        
        System.out.println(name1);
    	}
    }
}
