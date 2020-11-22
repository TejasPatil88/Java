//2) define a functional interface "Second" with an abstract method "void disp4()".
//define a class Demo with main function.
//inside main function create two implementations of "Second" using lambda expression and 
//display their names.
interface Second
{
	void disp4();
}
public class Ass_2 {

	public static void main(String[] args) {
		Second ref = ()->{System.out.println("in interface Second disp4");};
		ref.disp4();
		Second ref1 = ()->{System.out.println("in interface Second disp4");};
		ref1.disp4();
		System.out.println("Implementation class name is\t"+ref.getClass().getName());
		System.out.println("Implementation class name is\t"+ref1.getClass().getName());
	}

}
