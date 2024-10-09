package ThreadEx;

public class MainThread {


		  public static void main(String[] args) {
		        RoomInfo roomInfo = new RoomInfo();

		        Thread1 thread1 = new Thread1(roomInfo,"Shamim",1);
		        Thread2 thread2 = new Thread2(roomInfo,"Rakibul",1);

		        thread1.start();
		        thread2.start();
		    }
	}


