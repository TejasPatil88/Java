//1) accept 10 numbers from user and add them inside the ArrayList.
//using ListIterator display all the numbers bidirectionally.

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Scanner;
public class ArrayListDemo
{
	public static void main(String args[])
	{
		List<Integer> mylist = new ArrayList<Integer>();
		System.out.println("Enter the Elements");
		Scanner sc = new Scanner(System.in);
		for (int i=0;i<5;i++)
		{
			mylist.add(sc.nextInt());		
		}
		
		ListIterator ltr=mylist.listIterator();
		System.out.print("[");
		while(ltr.hasNext())
		{
			System.out.print(ltr.next()+",");
			
		}
		System.out.print("]");
		System.out.println("Using ListIterator from the end");
		
		while(ltr.hasPrevious())
		{
			System.out.println(ltr.previous());
		}
	
		sc.close();
	}
	
}