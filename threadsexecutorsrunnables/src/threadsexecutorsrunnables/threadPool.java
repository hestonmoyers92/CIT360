/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threadsexecutorsrunnables;


import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

/**
 *
 * @author PMPAdmin
 */

public class threadPool {
    
	public static void main(String[] args) {
		Executor anExecutor = Executors.newCachedThreadPool();
		for(int threadCnt = 0; threadCnt < 3; threadCnt++){
			RunnableTest SimpleRunnable = 
            new RunnableTest();
			anExecutor.execute(SimpleRunnable);
		}
		try {
			Thread.sleep(3000);
			System.out.println("Hello!");
			for(int threadCnt = 0; threadCnt < 3; threadCnt++){
				RunnableTest simpleRunnable = 
                new RunnableTest();
				anExecutor.execute(simpleRunnable);
			}
		} catch (InterruptedException e) {
                    // TODO Auto-generated catch block

		}
        
	}
}