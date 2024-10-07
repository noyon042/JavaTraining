package ThreadEx;

public class MainClass {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		ThreadClassEx ex=new ThreadClassEx();
		ex.start();
		
		
		for(int i=1;i<=5;i++) {
			System.out.println("Kolpolok Ltd");
			Thread.sleep(1000);
		}
	}

}
