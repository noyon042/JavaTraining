package ThreadEx;

public class RoomInfo {

	 int totalSeat =1;
	    public synchronized void seatAssign(String name,int seat){

	        if(totalSeat >= seat){
	            System.out.println("This seat Assign by "+name);
	            totalSeat = totalSeat -seat;
	        }
	        else
	        {
	            System.out.println("No seat availavle");
	        }

	    }
}
