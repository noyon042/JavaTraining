package ThreadEx;

public class Thread2 extends Thread{

	 RoomInfo roomInfo;
	    String name;
	    int seat;

	    Thread2(RoomInfo roomInfo,String name,int seat){
	        this.roomInfo = roomInfo;
	        this.name = name;
	        this.seat = seat;
	    }

	    public void run(){
	        roomInfo.seatAssign(name,seat);
	    }
}
