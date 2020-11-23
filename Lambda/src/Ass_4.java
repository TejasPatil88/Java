/*
 4) define a functional interface "Calculator" with an abstract method "int multiply(int a,int b)"
	define a class "CalcDemo" with main method.
	inside main using lambda create an implementation of "Calculator" , invoke "multiply()" method and display its result.
 */


interface Calculate
{
	int multiply(int a,int b);
}

public class Ass_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Calculate ref= (a,b)->{int c=a*b;return c;};
		System.out.println("Multiplication is:"+ref.multiply(2, 4));
		

	}

}