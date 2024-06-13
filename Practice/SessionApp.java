package Practice;

public class SessionApp {

	public static void main(String[] args) 
	{
		JavaSession t1 = new JavaSession();
		JavaSession t2 = new JavaSession();
		
		t1.setName("ram");
		t2.setName("shayam");
		
		
		t1.start();
		t2.start();
		
	}

}
