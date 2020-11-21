import java.util.ArrayList;
import java.util.List;

//4) create a class "MyClass".
//create 5 different objects of it.
//add them in a ArrayList.
//store ArrayList in file.
//Now open a file, read ArrayList and display all objects.

class MyClass
{
	int a=10;

	@Override
	public String toString() {
		return "MyClass [a=" + a + "]";
	}
	
	
	
}


public class MyClassDemo {

	public static void main(String[] args)
	{
		MyClass m[] = new MyClass[5];
		List<Object> list = new ArrayList<Object>();
		for(int i=0;i<5;i++)
		{
			m[i]= new MyClass();
			list.add(m[i]);
			System.out.println(m[i].hashCode());
		}
		System.out.println(list);

	}

}
