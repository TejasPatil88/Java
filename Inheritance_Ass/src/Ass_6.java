//Define interface "A" with "disp1()" method.
//Derive from "A", interface "B" with "disp2" method.
//Derive class "C" , from "B".
//Instantiate class "C" and call its members as well as derived from parent interfaces.
interface A
{
	  void Disp1();
}
interface B extends A
{
	void Disp2();
}
class C implements B
{

	@Override
	public void Disp1() 
	{
		// TODO Auto-generated method stub
		System.out.println("in class C Disp1");
	}

	@Override
	public void Disp2() 
	{
		// TODO Auto-generated method stub
		System.out.println("in class C Disp2");
	}
}
public class Ass_6 {

	public static void main(String[] args)
	{
		// TODO Auto-generated method stub
		C c1=new C();
		c1.Disp1();
		c1.Disp2();
	}
}
