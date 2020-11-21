//create a multi-threaded application by using Thread pool.
//create 2 threads. 
//each thread should display numbers from 1 to 10.
//[ make sure while one thread executes , other thread should not interfere ]
//Also when first thread displays nos. from 1 to 5 it should released the lock 
//and allow other thread to display nos. from 1 to 5
//and then previous thread will display nos. from 6 to 10 and so on.


//if we have 4 threads in a thread pool and 2 tasks to perfrom then which threads will get execute ?

import java.util.concurrent.*;
import java.util.concurrent.locks.ReentrantLock;
class Th_2 implements Runnable
{
//	ReentrantLock mylock=new ReentrantLock();
     public void run()
	{
    	synchronized(this)//CURRENT THREAD getS LOCKED (oBJECT lOCK)
    	{
    		for(int i=1;i<=10;i++)
    		{
    			System.out.println(i+"\t"+Thread.currentThread());
    			if(i==5)
    			{
    				try {
    					wait(200);
    					notify();
    				} catch (InterruptedException e) {
    				// TODO Auto-generated catch block
    				e.printStackTrace();
    				}
    			}
    		}
    		
    	}
	}
}
public class ThreadAdvanced2
{
	public static void main(String[] args)
	{
		ExecutorService exec=Executors.newCachedThreadPool();
		for(int i=0;i<=1;i++)
		{
			exec.execute(new Th_2());
		}
		exec.shutdown();
    }
}
