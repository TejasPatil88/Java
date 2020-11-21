//1) define interface "First" with "default void fun()" 
//and interface "Second" with "default void fun()". 
//Now derive a class Child from both these interfaces. 
//Inside main function instantiate Child class instance and invoke "fun" method.
interface First
{
	default void fun ()
	{
		System.out.println("in interface First fun");
	}
}
interface Second
{
	default void fun ()
	{
		System.out.println("in interface Second fun");
	}
}
class Child implements First,Second
{

	@Override
	public void fun()
	{
		System.out.println("in overridden method of Child");
	}
	
}
public class Ass_1 {

	public static void main(String[] args) 
	{
		Child c1 = new Child();
		c1.fun();
	}

}
