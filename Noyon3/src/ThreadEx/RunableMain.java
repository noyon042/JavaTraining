package ThreadEx;

public class RunableMain {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		RunableClassEx runableClassEx=new RunableClassEx();
		
		Thread thread=new Thread(runableClassEx);
		thread.start();
		
		

		for(int i=1;i<=5;i++) {
			System.out.println("BJ IT");
			Thread.sleep(1000);
		}
	}

}
