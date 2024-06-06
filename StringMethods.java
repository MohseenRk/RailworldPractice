
public class StringMethods {
	
	public static void main(String[] args) {
		
	
	String s1=new String("java");
	String s2=new String("java");
	
	String s3= "java";
	String s5= "Java";
	
	if(s1==s2)
	{
		System.out.println("Address is same");
	}
	else
	{
		System.out.println("Address is not same");
	}
	
	if(s1.equals(s2))
	{
		System.out.println("value is same");
	}
	else {
	System.out.println("value is not same");
	}
		
		
		
	System.out.println(s1==s2);
	System.out.println(s1.equals(s2));
	
	String s4= s1.intern();
	System.out.println(s3==s4);
	System.out.println(s2==s4);
	System.out.println(s4.compareTo(s5)==0);
	System.out.println(s4.compareTo(s5)>0);
	System.out.println(s4.compareTo(s5)<0);
	
	}
	
}
