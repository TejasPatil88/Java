//1) define a functional interface "First" with an abstract method "void disp1()" ,
//default method "void disp2()" and a static method "void disp3()"
//inside main function using lambda expression invoke "disp1()" and "disp2()" methods.
//also invoke "disp3()" method inside main.
interface First
{
	void disp1();
	default void disp2()
	{
		System.out.println("in interface First default disp2");
	}
	static void disp3()
	{
		System.out.println("in interface First static disp3");
	}
}
public class Ass_1 {

	public static void main(String[] args) {
		First ref = ()->{System.out.println("in First disp1");};
		ref.disp1();
		ref.disp2();
		First.disp3();
	}

}
