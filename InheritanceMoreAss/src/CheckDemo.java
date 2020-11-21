//3)	Define a class “Check” in which declare member variables using  different accessibility modifiers
//i.e.  <default>, private ,public and protected.   Define a function “disp”  which should be public.  
//Define a class “CheckDemo” in which you will write “main()” function. 
//Create an instance of  the class “Check” and  show how many  variables can be accessed directly and how many indirectly.

class Check
{
	//member variables
	private int var1=10;
	int var2=20;
	protected int var3=30;
	public int var4=50;
	
	public void setVar1(int num)
	{
		this.var1=num;
	}
	//member function
	public void disp()
	{
		System.out.println("var1"+var1);
	}
	
	
}

class Sub extends Check
{
	
}

public class CheckDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Check c= new Check();
		System.out.println(c.var3);
		Sub s= new Sub();
		System.out.println(s.var3);
		//System.out.println(c.var1);//
		c.disp();
	}
}
