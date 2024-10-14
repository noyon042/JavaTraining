package TicketApp;

public class Main2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CalculateEvenNumber calculateEvenNumber=new CalculateEvenNumber();
		calculateEvenNumber.start();
		
		synchronized (calculateEvenNumber) {
		
			try {
				
				calculateEvenNumber.wait();
				System.out.println("Total sum of Even Number="+calculateEvenNumber.sum);
				
			} catch (InterruptedException e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
	}

}
