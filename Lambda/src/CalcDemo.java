//4) define a functional interface "Calculator" with an abstract method "int multiply(int a,int b)"
//define a class "CalcDemo" with main method.
//inside main using lambda create an implementation of "Calculator" ,
//invoke "multiply()" method and display its result.
interface Calculator 
{
	void multiply(int a,int b);
}
public class CalcDemo {

	public static void main(String[] args) {
		Calculator ref = (int a,int b)->{System.out.println(a*b);};
		ref.multiply(10,4);
	}
}
