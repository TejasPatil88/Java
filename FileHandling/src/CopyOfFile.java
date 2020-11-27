import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

//write a file copy program using FileInputStream and FileOutputStream
//
//hint: existing file u need to open using FileInputStream and new file u need
//to open using FileOutputStream.
//
//first read existing file's data inside byte array and then write the same
//byte array inside new file.
//
//byte array should be created equivalent to the length of existing file.


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
		byte b[] = new byte[(int ) (f.length())];
		System.out.println(b.length);
			fis.read(b);
		String s = new String(b);
		System.out.println(s);
		
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
