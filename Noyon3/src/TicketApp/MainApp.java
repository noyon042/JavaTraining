package TicketApp;

public class MainApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		TicketAppEx ticketAppEx=new TicketAppEx();
		ticketAppEx.start();
		
		synchronized (ticketAppEx) {
		
			try {
				
				ticketAppEx.wait();
				System.out.println("Total Price="+ticketAppEx.totalPrice);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		
	}

}
