//3) define a functional interface "MyInterface" with an abstract method "void fun()"
//define a class Demo with two functions "static void perform" and main.
//from main function pass lambda expression, 
//collect it in "perform" method and invoke "fun()" function.
interface MyInterface
{
	void fun();
	
}
public class Ass_3 {
	public static void perform(MyInterface ref) {
		ref.fun();
	}
	public static void main(String[] args) {
		
		MyInterface ref = ()->{System.out.println("inside fun fucntion of MyInterface");};	
		perform(ref);
	}

}
