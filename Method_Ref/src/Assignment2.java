/*
 2) define a functional interface "Third" with an abstract method "void show(int num)".
	define a class "Sample" with a method "void disp(int num)"
	inside main function create a method reference for "Third" and invoke "disp" of "Sample" by passing a value "500".
*/
@FunctionalInterface
interface Third 
{
	void show(int num);
}


class Sample
{
	void disp(int num)
	{
		System.out.println("Sample class disp num is "+num);
	}
}

public class Assignment2 {
	
	
public static void main(String[] args) {
	
	
	Sample s =new Sample();
	Third ref=s::disp;
	ref.show(500);
	
}


}
