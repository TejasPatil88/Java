class Machine
{
	
}
class Laptop extends Machine
{
	
}
class Test
{
  public static void main(String[] args)
  {
	  Machine m = new Machine();
      Laptop l = new Laptop();
      Machine m1 = new Laptop();           // Upcasting
      if(m instanceof Laptop) {
      Laptop l1 = (Laptop) m;             // Downcasting
      }
      
  }
}