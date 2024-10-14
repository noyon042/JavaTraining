package ExecutorsClassEx;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class FutureClass {

	  public static void main(String[] args) {

	        //create the pool
	        ExecutorService service = Executors.newFixedThreadPool(10);

	        //service.submit(new Task());
	        List<Future> allFutures = new ArrayList<>();
	        for(int i=0;i<100;i++){
	            Future<Integer> future = service.submit(new Task());
	            allFutures.add(future);
	        }

	        //100 second
	        for(int i=0;i<100;i++){
	            Future<Integer> future = allFutures.get(i);
	            try {
	                int result = future.get();
	                System.out.println("result of fecture of "+ i +" "+result);
	            }
	            catch (ExecutionException e)
	            {
	                e.printStackTrace();
	            }
	            catch (InterruptedException e)
	            {
	                e.printStackTrace();
	            }

	        }
	    }
}
