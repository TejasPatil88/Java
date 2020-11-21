//3)define interface "Fourth" with "default void disp3()" method.
//define a class "Base1" with "public void disp3()" method,
//now derive a class Sub1 from "Base1" and "Fourth". 
//Sub1 class should have only "public void myfun()" method.
//inside main create an object of "Sub1" and invoke "disp3".
//once you get the result, also try to invoke "disp3" of "Fourth"
interface Fourth
{
	default void disp3()
	{
		System.out.println("in interface Fourth disp3");
	}
}
class Base1
{
	public void disp3()
	{
		System.out.println("in class Base1 disp3");
	}
}
class Sub1 extends Base1 implements Fourth
{
	public void myfun()
	{
		Fourth.super.disp3();
		System.out.println("in class Sub1 myfun");
	}
}
public class Ass_3 {

	public static void main(String[] args) {
		Sub1 s1 = new Sub1();
		s1.disp3();
		s1.myfun();
	}

}
