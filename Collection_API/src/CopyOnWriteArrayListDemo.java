import java.util.*;
import java.util.concurrent.*;

//3) add 5 numbers inside CopyOnWriteArrayList and 
//show how can you add one more number at the same time of traversal through its iterator.

public class CopyOnWriteArrayListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Integer> list= new CopyOnWriteArrayList<>();
		for(int i=0;i<5;i++)
			list.add(i);
		System.out.println(list);
		Iterator itr = list.iterator();
		while(itr.hasNext())
		{
			System.out.println(itr.next());
			list.add(20);
		}
		System.out.println(list);
		
	}

}
