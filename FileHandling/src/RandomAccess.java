import java.io.RandomAccessFile;

//2) using RandomAccessFile class create a file.
//accept a message from user and write in a file.
//now read the message which u have stored in a file.
//now again accept a message and write in a file at the end of existing message.
//now read the entire content of file . ( u should be able to read both the messages now)

public class RandomAccess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try(RandomAccessFile rf=new RandomAccessFile("f:\\temp/FileDemo.txt","rw"))
		{
		rf.seek(rf.length());
		System.out.println("Enter data");
		byte b[]=new byte[200];
		int k=System.in.read(b);
		rf.write(b,0,k);
		rf.seek(0);
		byte c[]=new byte[(int)rf.length()];
		rf.read(c);
		String ss=new String(c);
		System.out.println(ss);
		rf.seek(rf.length());
		System.out.println("Enter data again");
		k=System.in.read(b);
		rf.write(b,0,k);
		System.out.println("Finally reading all data");
		rf.seek(0);
		c=new byte[(int)rf.length()];
		rf.read(c);
		ss=new String(c);
		System.out.println(ss);
		}catch(Exception ee)
		{
			ee.printStackTrace();
		}
	}

}

