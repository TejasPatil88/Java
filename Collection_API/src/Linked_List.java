import java.util.LinkedList;

//2) create LinkedList with the values 10,20,30 and 40.
//display it.
//now insert 500 in the beginning.
//insert 400 at 2nd position.
//add 1000 at the end.
//display the list again.

public class Linked_List 
{

	public static void main(String[] args) 
	{
		
		LinkedList<Integer> linkedList= new LinkedList<Integer>(); 
		linkedList.add(10); 
		linkedList.add(20);
		linkedList.add(30);
		linkedList.add(40);
		System.out.println(linkedList);
		linkedList.addFirst(500);
		linkedList.add(2, 400);
		linkedList.addLast(1000);
		System.out.println(linkedList);
		
	}

}
