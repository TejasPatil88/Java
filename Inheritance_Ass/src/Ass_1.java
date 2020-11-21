//Create a multi-level inheritance ,
//instantiate the child class and observe constructor invocation.
// Also show, if needed how will u invoke parent class constructor from child class ?

class Base{
	int num=10;
	Base ()
	{
		System.out.println("base const");
	}
	void disp()
	{
		System.out.println("num"+num);
	}
}
class Sub extends Base {
	int num1=20;
	Sub()
	{
		System.out.println("Sub const");
	}
	void disp()
	{
		System.out.println("num1"+num1+num);
	}
}
class Sub1 extends Base{
	int num3=30;
	Sub1()
	{
		System.out.println("Sub1 const");
	}
	void disp()
	{
		System.out.println("num3"+num3);
	}
	
}

public class Ass_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
            Base s1= new Sub();
            s1.disp();
        
	}

}
