//create 3 threads in such a way that while one thread is executing,
//2 threads cannot interfere. 
//they should display output "Exec  0" to "Exec 5".
public class ThreadDemo3 implements Runnable
	{
		synchronized public void run()             
		{
			for(char i='a';i<='j';i++)
			{
				System.out.println(i+"\t"+Thread.currentThread());
			}
		}
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		ThreadDemo3 th = new ThreadDemo3();
		Thread s1 = new Thread(th);
		Thread s2 = new Thread(th);
		s1.start();
		s2.start();
	}
}
