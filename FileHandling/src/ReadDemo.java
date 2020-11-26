import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class ReadDemo {

	public static void main(String[] args)
	{
		File f = new File("F:\\abc.txt");
		if(!f.exists())
		{
			System.out.println("File does not Exits !!!!!!!!!!!! ");
			System.exit(0);
		}
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte b[] = new byte[(int) (f.length())];
		try {
			fis.read(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s = new String(b);
		System.out.println(s);
	}
}
