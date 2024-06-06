
public class Practice
{

	public static void main(String[] args) 
	{
	 
		StringBuilder s = new StringBuilder("hello");
		System.out.println(s);
		s.append("java");
		System.out.println(s);
		System.out.println(s.capacity());
		s.append(" world program ");
		System.out.println(s);
		System.out.println(s.capacity());
		System.out.println(s.length());
	}

}
