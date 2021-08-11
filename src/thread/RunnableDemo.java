package thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class RunnableDemo {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ExecutorService executorService=Executors.newFixedThreadPool(8);
		for(int i=0;i<10;i++){
			
			Runnable runnable= new MyRunnable("my worker thread: " + i);
			// t.start();
			 executorService.execute(runnable);
		}
		executorService.shutdown();
		while(executorService.isTerminated()){
			
		}
		Runnable runnable= new MyRunnable("All thread completed");
	}

}
