package ThreadEx;

public class RunableClassEx implements Runnable{

	@Override
	public void run() {

		try {
			for(int i=1;i<=5;i++) {
				System.out.println("Tiger IT Ltd");
				Thread.sleep(1000);
			}
		} 
	
	
		catch (InterruptedException e) {
			// TODO: handle exception
			e.printStackTrace();
		}
		
	}

	
}
