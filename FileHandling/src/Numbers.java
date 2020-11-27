import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

//5) accept as many as numbers from user till he presses "0"  and write these numbers in a file. 
//Now Open a file and read these numbers. 
//( Hint :- use Scanner class for input, FileOutputStream,
//DataOutputStream, FileInputStream , DataInputStream)

public class Numbers {

	public static void main(String[] args) {
		
		try(FileOutputStream fos=new FileOutputStream("F:\\temp\\abz1.txt"))
		{
			try(DataOutputStream dos=new DataOutputStream(fos))
			{
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				System.out.println("Enter the Numbers : ");
				while(true)
				{
					int k = sc.nextInt();
					if(k==0)
					{
						break;
					}
					dos.writeInt(k);
				}
			}
		}
		catch(IOException ie)
		{
			ie.printStackTrace();
		}

		try(FileInputStream fis=new FileInputStream("F:\\temp\\abz1.txt"))
		{
			DataInputStream dis=new DataInputStream(fis);
		
				while(dis.available()>0)
				{
					System.out.println(dis.readInt());
				}
		
		}
		catch(Exception ee)
		{
			ee.printStackTrace();
		}

	}

}
