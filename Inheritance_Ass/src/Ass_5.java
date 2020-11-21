//create abstract class Shape. declare "draw()" function as abstract. 
//From this class define "Triangle","Polygon" and "Circle" .
//create an array of Shape having 3 elements.
//store child objects into this array . and call
//their draw function
abstract class Shape
{
	void disp()
	{
		System.out.println("shape");
	}
	abstract  void Draw();
}
class Triangle extends Shape
{
	void Draw()
	{
		System.out.println("Draw Traingle");
	}
}
class Polygon extends Shape
{
	void Draw()
	{
		System.out.println("Draw Polygon");
	}
}
class Circle extends Shape
{
	void Draw()
	{
		System.out.println("Draw Circle");
	}
}
public class Ass_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Shape arr[]=new Shape[3];
		arr[0]=new Triangle();
		arr[1]=new Polygon();
		arr[2]=new Circle();
		for(int i = 0;i<arr.length;i++)
			arr[i].Draw();
	}
}
