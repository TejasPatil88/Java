import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class CopyOfFile {

	public static void main(String[] args) 
	{
		File f = new File("F:\\abc.txt");
		if(!f.exists())
		{
			System.out.println("File does not exits ");
			System.exit(0);
		}
		FileInputStream fis = null;
		try {
			fis = new FileInputStream(f);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		byte b[] = new byte[(int ) (f.length())];
		System.out.println(b.length);
		try {
			fis.read(b);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		String s = new String(b);
		System.out.println(s);


		try {
			@SuppressWarnings("resource")
			FileOutputStream fos = new FileOutputStream("F:\\abc1.txt",true);
			@SuppressWarnings("unused")
			byte b1[] = new byte[b.length];
			fos.write(b);
		} 
		catch (Exception e) 
		{
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
