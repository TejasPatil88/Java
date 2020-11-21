//Define class "Parent1" with some data.
//Define interface "Parent2" with some data.
//Derive a class "Child" from "Parent1" and "Parent2", instantiate it and call the members.
class Parent1
{
	public void Disp1()
	{
		System.out.println("base class disp1");
	}
}
interface Parent2
{
	void Disp2();
}
class Child extends Parent1 implements Parent2
{
	public void Disp2() 
	{
		System.out.println("Child class Disp2 by interface");
	}
	
}
public class Ass_7 {

	public static void main(String[] args) 
	{
		Child c1=new Child();
		c1.Disp1();
		c1.Disp2();
	}

}
