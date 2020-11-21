//Go for Hierarchical inheritance, 
//create instances of child class and observe constructor invocation.
package pack1;

class Base 
{
	public void methodofBase ()
	{
		System.out.println("In methodofBase Class Base");
	}
}
class Sub1 extends Base
{
	public void methodofSub1 ()
	{
		System.out.println("In methodofSub1 Class Sub1");
	}
	
}
class Sub2 extends Base
{
	public void methodofSub2 ()
	{
		System.out.println("In methodofSub2 Class Sub2");
	}
	
}
class Sub3 extends Base
{
	
	public void methodofSub3 ()
	{
		System.out.println("In methodofSub3 Class Sub3");
	}
	
}

class Base1
{
	int a=100;
	public int test1()
	{
		System.out.println("base1");
		return 1;
		
	}
	public int test()
	{
		System.out.println("base1");
		return 1;
		
	}
	
}

class Su1 extends Base1
{
	int a=200;
	public int test()
	{
		System.out.println("sub1");
		return 1;
		
	}
	
}

public class Ass_3 
{
	public static void main(String[] args) 
	{
		Base1 s= new Su1();
		System.out.println(s.a);
		s.test();
//		Sub1 s1=new Sub1();
//		s1.methodofBase();
//		s1.methodofSub1();
//		Sub2 s2=new Sub2();
//		s2.methodofBase();
//		s2.methodofSub2();
//		Sub3 s3=new Sub3();
//		s3.methodofBase();
//		s3.methodofSub3();
	}

}
