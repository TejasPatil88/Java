
class Thread1 implements Runnable
{
	@SuppressWarnings("static-access")
	public void run()
	{
		//synchronized(this)
		{
			Thread t = Thread.currentThread();
			
			for(int i=1;i<=10;i++)
			{		
				System.out.print(t.getName()+i);
			}
			try {
				
				t.sleep(1000);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			//notifyAll();
			System.out.print(" ");
		}
	}
}

class Thread2 implements Runnable
{
	@SuppressWarnings("static-access")
	public void run()
	{
		//synchronized(this)
		{
			Thread t = Thread.currentThread();
			for(int i=10;i>=1;i--)
			{
				System.out.print(t.getName()+i);
			}
			System.out.print(" ");
			try {
				
				t.sleep(10);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				//e.printStackTrace();
			}
			//notifyAll();
		}
	}
}

public class ThreadDemo5 
	{
	 
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Thread1 th1 = new Thread1();
		Thread1 th2 = new Thread1();
		Thread s1 = new Thread(th1);
		Thread s2 = new Thread(th2);
		s1.start();
		s2.start();
		s1.setName("first");
		s2.setName("second");
		
	}
	}