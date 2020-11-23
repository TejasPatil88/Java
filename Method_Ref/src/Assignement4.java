/*
	4)  define a functional interface "Sixth" with an abstract method "void disp5()".
		define a class "Sample" with a static method "void fun1()"
		inside main function create a method reference for "Sixth" and invoke "fun1" of "Second"
*/
@FunctionalInterface
interface Sixth
{
	void disp5();
}


class Sample1 
{
	static void fun1()
	{
		System.out.println("Sample Fun1");
	}
}


public class Assignement4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sixth ref = Sample1::fun1;
		ref.disp5();
	}

}