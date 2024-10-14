package TicketApp;

public class TicketAppEx extends Thread {

	int totalPrice=0;
	int ticketPrice=50;
	
	public void run() {
		
		synchronized (this) {
		
			for(int i=1;i<=10;i++)
			{
				totalPrice=totalPrice+ticketPrice;
			}
			
			this.notify();
		}
	}
}
