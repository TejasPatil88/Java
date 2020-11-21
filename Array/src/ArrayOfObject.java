class Car
{
	String name;
	int model_no;
	public Car(String name, int model_no) {
		this.name = name;
		this.model_no = model_no;
	}
	@Override
	public String toString() {
		return "Car [name=" + name + ", model_no=" + model_no + "]";
	}
}
public class ArrayOfObject {

	public static void main(String[] args) {
		Car c1 = new Car("ABC",101);
		Car c2 = new Car("XYZ",102);
		Car c3 = new Car("UVW",103);
		
		Car [] c = new Car [3];
		c [0] = c1;
		c [1] = c2;
		c [2] = c3;
		
		for(int i=0;i<c.length;i++)
		{
			System.out.println(c[i]);
		}
	}

}
