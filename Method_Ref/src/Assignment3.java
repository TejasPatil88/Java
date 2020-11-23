/*
 3) define a functional interface "Fifth" with an abstract method "int add(int a,int b)"	
	define a class Math1 with a method "int calc(int a,int b)"
	inside main function invoke "calc" method with the help of
	a) lamdba expression
	b) method reference 
 */
@FunctionalInterface
interface Fifth
{
	int add(int a,int b);
}
class Math1
{
	int calc(int a,int b)
	{
		int c=a+b;
		
		return c;
		
	}
}

public class Assignment3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Method reference
		Math1 m1 =new Math1();
		Fifth ref = m1::calc;		
		System.out.println("Addition is :"+ref.add(50, 10));
		
		
		//lambda expression
		Fifth ref2=(a,b)->{
			Math1 m =new Math1();
			return m.calc(a, b);
			
		};
		System.out.println("Addition is :"+ref2.add(70, 40));
	}

}