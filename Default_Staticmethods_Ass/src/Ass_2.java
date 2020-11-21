//2) define interface "Third" with "default void disp1()" and "static void disp2()" methods.
//derive a class "Sub" from "Third" ( do not override "disp1")
//inside main function invoke "disp1" and "disp2" methods.
interface Third
{
	default void disp1()
	{
		System.out.println("in interface Third disp1");
	}
	static void disp2()
	{
		System.out.println("in interface Third disp2");
	}
}
class Sub implements Third
{
	
}
public class Ass_2 {

	public static void main(String[] args) 
	{
		Sub s1 = new Sub();
		s1.disp1();
		Third.disp2();
	}

}
