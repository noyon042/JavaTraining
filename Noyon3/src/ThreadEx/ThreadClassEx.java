package ThreadEx;

public class ThreadClassEx extends Thread {
	
	
	public void run()
	
	{
		try {
			for(int i=1;i<=5;i++) {
				System.out.println("ADDIE Ltd");
				sleep(1000);
			}
		} 
	
	
		catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
}
