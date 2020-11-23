/*
 6) define a functional interface "Seventh" with an abstract method "void fun(int k)".
	define a class "Sample" with parameterized constructor with the message "inside parameterized constructor of Sample\t"+k .
	inside main function instantiate "Sample" by passing value "200" using method reference to "Seventh"
*/
interface Seventh
{
	void fun(int k);
}


class Sample2
{
	Sample2(int k)
	{
		System.out.println("inside parameterized constructor of Sample2\t"+k);
	}
}
public class Assignment6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Seventh ref = Sample2::new;
		ref.fun(200);
	}

}
