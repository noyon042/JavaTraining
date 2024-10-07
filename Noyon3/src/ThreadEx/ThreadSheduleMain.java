package ThreadEx;

public class ThreadSheduleMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ThreadSheduleEx threadSheduleEx=new ThreadSheduleEx();
		ThreadSheduleEx threadSheduleEx1=new ThreadSheduleEx();
		ThreadSheduleEx threadSheduleEx2=new ThreadSheduleEx();

		threadSheduleEx.setName("Thread one");
		threadSheduleEx1.setName("Thread two");
		threadSheduleEx2.setName("Thread three");

		threadSheduleEx.start();
		threadSheduleEx1.start();
		threadSheduleEx2.start();

		
		
	}

}
