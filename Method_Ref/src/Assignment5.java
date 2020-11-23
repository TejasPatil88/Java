/*
 5) define a functional interface "Emp" with an abstract method "void show()".
	define a class "MyClass" with default constructor with the message "inside default constructor of MyClass".
	inside main function instantiate "MyClass" using method reference to "Emp"
 */

interface Emp
{
	void show();
}

class MyClass
{
	MyClass()
	{
		System.out.println("inside default constructor of myclass");
	}
}

public class Assignment5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Emp ref = MyClass::new;
		ref.show();
	}
}