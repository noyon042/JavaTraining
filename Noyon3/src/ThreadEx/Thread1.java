package ThreadEx;

public class Thread1 extends Thread {

	 RoomInfo roomInfo;
	    String name;
	    int seat;

	    Thread1(RoomInfo roomInfo,String name,int seat){
	        this.roomInfo = roomInfo;
	        this.name = name;
	        this.seat = seat;
	    }


	    public void run(){
	        roomInfo.seatAssign(name,seat);
	    }
}
