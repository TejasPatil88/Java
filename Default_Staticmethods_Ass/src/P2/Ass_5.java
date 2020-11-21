package P2;
//5) define interface "First" with "static void disp1()" method.
//class "Base" with "static void disp2()" method.
//derive a class "Sub" from "Base" and "First"
//now define a class Demo in which define "main" method.
//inside main show how many ways you can invoke "disp1" and "disp2" methods.
interface First
{
	static void disp1()
	{
		System.out.println("in interface First disp1");
	}
}
class Base
{
	static void disp2()
	{
		System.out.println("in class Base disp2");
	}
}
class Sub extends Base implements First
{

}
public class Ass_5 {

	public static void main(String[] args) {
		First.disp1();
		Base.disp2();
		Sub.disp2();

	}

}
