/*
5) define a class "Display" with "void disp" method. inside this method display values from 1 to 10.
create an implementation of "Runnable" using lambda expression which will invoke "disp()" method of "Display" class.
create 2 threads and pass above created "Runnable" implementation to these threads.
make sure while one thread is executing other thread will not interfere.
 */

class Display
{
	void disp()
	{
		for(int i=1;i<=10;i++)
		{
			System.out.println(i);
		}
	}
}



public class Ass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Display d= new Display();
		Runnable ref=()->{d.disp();};
		Thread th1=new Thread(ref);
		th1.start();
		Thread th2=new Thread(ref);
		th2.start();
		
		
		//This is how we can add class lock in lambda
		Runnable ref2=()->{
			synchronized (ref.getClass().getName()) {
				for(int i=1;i<=10;i++)
				{
					System.out.println(i);
				}
			}
		};
		
		th1=new Thread(ref2);
		th1.start();
		th2=new Thread(ref2);
		th2.start();
	}

}
