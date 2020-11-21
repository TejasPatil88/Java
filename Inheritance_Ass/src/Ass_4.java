//Create a class "Top1" with "disp1()" method.
//From this class Derive "Bottom1", "Bottom2" and "Bottom3" classes ,override the "disp1()".
//Now show how will u achieve dynamic polymorphism.
class Top1
{
	void Disp1()
	{
		System.out.println(" in Top1");
	}
}
class Bottom1 extends Top1
{
	void Disp1()
	{
		System.out.println("in Bottom1");
	}
}
class Bottom2 extends Top1
{
	void Disp1()
	{
		System.out.println("in Bottom2");
	}
}
class Bottom3 extends Top1
{
	void Disp1()
	{
		System.out.println("in Bottom3");
	}
}
public class Ass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Top1 t1 = new Bottom1();//upcasting
		Top1 t2 = new Bottom2();
		Top1 t3 = new Bottom3();
		t1.Disp1();
		t2.Disp1();
		t3.Disp1();  
	}
}
