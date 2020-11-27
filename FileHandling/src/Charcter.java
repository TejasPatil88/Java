import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

//1)accept 10 characters from a user ( use Scanner).
//store these 10 characters in a file. (FileWriter)
//Now open a file and read all these characters.


public class Charcter {

	public static void main(String[] args) {
		char ch;
		// File Writing
		try {
			@SuppressWarnings({ "unused", "resource" })
			FileOutputStream fos = new FileOutputStream("F:\\xyz.txt");
			System.out.println("Enter the char : ");
	     	@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
	     	FileWriter fw = null;
	     	fw = new FileWriter("F:\\xyz.txt");
			for(int i=0;i<10;i++){
				ch = sc.next().charAt(0);
				fw.write(ch);	
				}
			fw.close();
		
		//File Reading
		    File F = new File("F:\\xyz.txt");
		    if(!F.exists())
		    {
		    	System.out.println("File does not Exits ");
		    	System.exit(0);
		    }
		    
		    @SuppressWarnings("resource")
			FileInputStream fis = new FileInputStream("F:\\xyz.txt");
		    byte b[] = new byte[((int) F.length())];
		    fis.read(b);
		    String s = new String(b);
		    System.out.println(s);
		    
	}	
			 catch (IOException e1) 
		{
				 e1.printStackTrace();}
	}
}

