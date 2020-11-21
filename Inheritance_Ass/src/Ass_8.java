//Define a class "base1" with only parameterized constructor.
//Derive a class "sub1" from "base1". This class should have following constructors
//	a) Default
//	b) one parameter
//	c) two parameter
//Now try to instantiate "sub1" , using any of the above mentioned constructors.
class Base1
{
	int num=100;
	void disp1()
	{
		System.out.println(num);
	}
	Base1 (int k)
	{
		System.out.println("In Base class param const");
	}
}
class Sob1 extends Base1
{
	int num1=80;
	void disp2()
	{
		System.out.println(num1);
	}
	Sob1()
	{
		super(10);
		System.out.println("In Sub1 default const");
	}
	Sob1(int k)
	{
		super(20);
		System.out.println("In Sub1 one param const");
	}
	Sob1(int x,int y)
	{
		super(40);
		System.out.println("In Sub1 two param const");
	}

}
public class Ass_8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sob1 s1=new Sob1(20,10);
		s1.disp1();
		s1.disp2();

	}

}
