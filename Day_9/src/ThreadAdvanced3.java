import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.locks.ReentrantLock;

//create a multi-threaded application by using Thread pool 
//and ReentrantLock (explicit locking) .
//create 2 threads. each thread should display characters from A to J.
//[ make sure while one thread executes , other thread should not interfere ]

class Th_3 implements Runnable
{
	ReentrantLock mylock = new ReentrantLock();
	@Override
	public void run() {
		// TODO Auto-generated method stub
		mylock.lock();
		for(char i='a';i<='j';i++)
		{
			System.out.print(""+Thread.currentThread()+i+" "+"\n");
		}
		mylock.unlock();
	}
	
}

public class ThreadAdvanced3 
{
	public static void main(String[] args) 
	{
//		ExecutorService exec = Executors.newCachedThreadPool();
//		for(int i=0;i<=1;i++)
//		{
//			exec.execute(new Th_3());
//		}
//		exec.shutdown();
		Th_3 th = new Th_3();
		Thread t=new Thread(th);
		Thread t1=new Thread(th);
		t.start();
		t1.start();
		
		
		
	}
}
