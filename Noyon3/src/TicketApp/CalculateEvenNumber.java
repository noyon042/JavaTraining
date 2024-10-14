package TicketApp;

public class CalculateEvenNumber extends Thread{

	int sum=0;
	
public void run() {
		
		synchronized (this) {
		
			for(int i=1;i<=100;i++)
			{
				if(i%2==0) {
					System.out.println(i+"=Even number");
					sum=sum+i;
//					System.out.println("=Summation of Even number"+sum);

				}
			}
			
			this.notify();
		}
	}	
	
		
		
}
