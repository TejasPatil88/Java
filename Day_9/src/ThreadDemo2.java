//above program  using "implements Runnable" method

	public class ThreadDemo2 implements Runnable
	{
		 public void run()
		{
		
			for(char i='a';i<='j';i++)
			{
				System.out.print(i+" ");
			}
			//System.out.println("***********************************");
		}
	
	 
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadDemo2 t1 = new ThreadDemo2();
		ThreadDemo2 t2 = new ThreadDemo2();
		Thread s1 = new Thread(t1);
		Thread s2 = new Thread(t2);
		s1.start();
		s2.start();
		
		

	}

}
