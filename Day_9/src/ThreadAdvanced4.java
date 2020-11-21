import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

//create a multi-threaded application by using Thread pool 
//and ReentrantLock.create 2 threads.
//each thread should display numbers from 1 to 10.
//[ make sure while one thread executes , other thread should not interfere ]
//Also when first thread displays nos.
//thread1 should print from 1 to 5 it should released the lock and allow other thread to display nos.
//from 1 to 5 and then previous thread will display nos. from 6 to 10 and so on.

class Th_4 implements Runnable
{
	ReentrantLock lock = new ReentrantLock();
	@Override
	synchronized public void run() {
		// TODO Auto-generated method stub
		lock.lock();
		for(int i=1;i<=10;i++)
		{
			System.out.println(Thread.currentThread()+" -- "+i);
			if(i==5)
			{
				lock.unlock();	
			}
			
			try {Thread.sleep(1);}catch(Exception e) {}
		}
	}
	
}

public class ThreadAdvanced4 {
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Th_4 t= new Th_4();
		ExecutorService exec = Executors.newCachedThreadPool();
		for(int i=0;i<=1;i++)
		{
			exec.execute (t);
		}
		exec.shutdown();
	}

}
