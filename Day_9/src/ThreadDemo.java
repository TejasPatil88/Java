//create a multi-threaded application by using  
//"extends Thread " method.create 2 threads.
//they should display characters from A to J. class Th1 extends Thread
public class ThreadDemo extends Thread
{
	public void run()
	{
		for(char i='a';i<='j';i++)
		{
			System.out.print(i+" ");
		}
	}
    public static void main(String[] args)
    {
      // TODO Auto-generated method stub
      ThreadDemo s1 = new ThreadDemo();
      ThreadDemo s2 = new ThreadDemo();
      s1.start();
      s2.start();
	}
}
