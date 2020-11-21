//create a class "Vehicle", define a method "public void start()" in it. 
//From this class derive a class FourWheeler. 
//How will u override "start()" method of parent class ?
class Vehicle
{
	public void start()
	{
		System.out.println("Vehicle Start");
	}
}
class FourWheeler extends Vehicle
{
	public void start()
	{
		System.out.println("FourWheeler Start");
	}
}
public class Ass_2 
{
	public static void main(String[] args)
	{
	   Vehicle v1=new Vehicle();
	   v1.start();
	   Vehicle v2=new FourWheeler();
	   v2.start();
	}
}
