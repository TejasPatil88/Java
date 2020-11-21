class Human
{
	public void walk()
	{
		System.out.println("Human walk");
	}
}
public class Demo extends Human {
	public void walk()
	{
		System.out.println("Demo walk");
	}

	public static void main(String[] args) {
		Human obj = new Demo();
		Human obj2 = new Human();
		obj.walk();
		obj2.walk();
	}

}
