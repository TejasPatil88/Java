//1) create a multi-threaded application by using Thread pool.
//create 2 threads. 
//each thread should display characters from A to J. 
//[ make sure while one thread executes , other thread should not interfere ]
import java.util.concurrent.*;
class Th1 implements Runnable
{
   synchronized public void run()
	{
		perform();
	}
    void perform()
	{
	for(char i='a';i<='j';i++)
	{
		System.out.println(i+"\t"+Thread.currentThread());
//		try
//		{
//			Thread.sleep(100);
//		}
//		catch(InterruptedException ie)
//		{
//			System.out.println(ie);
//		}
	}
	}
}
public class ThreadAdvanced1
{
	public static void main(String args[])
	{
		ExecutorService exec=Executors.newCachedThreadPool();
		for(int i=0;i<=1;i++)
		{
			exec.execute(new Th1());
		}

		exec.shutdown();
	}
}			 
