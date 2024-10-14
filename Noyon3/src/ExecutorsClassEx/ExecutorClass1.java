package ExecutorsClassEx;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ExecutorClass1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//create one thread
		ExecutorService executorService=Executors.newSingleThreadExecutor();
		
		//create thread pool
		ExecutorService executorService1=Executors.newFixedThreadPool(5);
		
		//cached thread pool
		ExecutorService executorService2=Executors.newCachedThreadPool();
		
		//schedule thread pool
		ExecutorService executorService3=Executors.newScheduledThreadPool(1);


	}

}
