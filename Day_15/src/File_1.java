import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//1)accept 10 characters from a user ( use Scanner).
//store these 10 characters in a file. (FileWriter)
//Now open a file and read all these characters.

public class File_1 
{

	public static void main(String args[])
	{
		// TODO Auto-generated method stub
		char ch;
		try {
			
					//File writing
			FileOutputStream fo= new FileOutputStream("F:\\temp/FileDemo.txt");
			System.out.println("Enter 10 characters");
			Scanner sc= new Scanner(System.in);
			try {
				FileWriter fw= new FileWriter("F:\\temp/FileDemo.txt");
				for(int i=1;i<=10;i++)
				{
					 ch=sc.next().charAt(0);
					 
					 fw.write(ch);
					 
				}
				fw.close();
				
				//file reading
				File f= new File("F:\\temp/FileDemo.txt");
				
				if(!f.exists())
				{
					System.out.println("file does not exists");
					System.exit(0);
				}
				FileInputStream fis= new FileInputStream("F:\\\\temp/FileDemo.txt");
				byte b[]=new byte[((int)f.length())];
				fis.read(b);
				String ss=new String(b);
				System.out.println(ss);
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
		
	}

}
