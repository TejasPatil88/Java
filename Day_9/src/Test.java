
public class Test {
	
	public static void main(String[] args) {
		
		Thread t = new Thread() ;
		
		t.setName("Thread-1");
		
		String s = t.getName() ;
		System.out.println(s == t.getName());
	}

}
