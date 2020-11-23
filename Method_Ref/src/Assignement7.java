/*
7)  define a class "Student" with name and age as member variables, parameterized constructor , setters , getters and "toString" method. 
	
	define a functional interface "MyInterface" with an abstract method "void show(Student ref)"
	inside main function 
	a) create an instance of "Student" class by passing "Vijay" and '20' values.
	b) create method reference for "MyInterface" and display the instance of "Student" class created above.
 */

@FunctionalInterface
interface MyInterface
{
	void show(Student ref);
}


class Student
{
	String name;
	int age;
	Student s;

	Student(String name,int age)
	{
		this.name=name;
		this.age=age;
	}
	
	void getObjectData(Student sObj)
	{
		System.out.println("Name :"+sObj.name);
		System.out.println("Age  :"+sObj.age);
	}
	void setAge(int age)
	{
		this.age=age;
	}
	void setName(String name)
	{
		this.name=name;
	}
	
	int getAge()
	{
		return age;
	}

	String getName()
	{
		return name;
	}
	
	
}

public class Assignement7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Student s = new Student("ABC",20);
		Student s1 = new Student("XYZ",23);
		MyInterface ref= s::getObjectData;
		ref.show(s);
		ref.show(s1);
		
	}

}