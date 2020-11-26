import java.io.FileOutputStream;

public class WriteDemo {

	public static void main(String[] args) 
	{
		try {
			@SuppressWarnings("resource")
			FileOutputStream fos = new FileOutputStream("F:\\abc.txt",true);
			byte b[] = new byte[100];
			System.out.println("Enter tha data : ");
			int k = System.in.read(b);
			fos.write(b, 0, k);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
