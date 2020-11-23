/*
 1) define a functional interface "First" with an abstract method "void disp1()".
	define a class "Second" with a method "void fun1()"  
	inside main function create a method reference for "First" and invoke "fun1" of "Second" 
*/
@FunctionalInterface
interface First
{
	void disp1();
}



class Second 
{
	void fun1()
	{
		System.out.println("Second Class Fun Method");
	}
}


// in Method reference we have a method in a class which can be the implementation of an abstract method 
// so we link that implementation with the existing abstract method
public class Assignment_1 {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		Second s=new Second();
		First ref=s::fun1;
		ref.disp1();
		

	}

}