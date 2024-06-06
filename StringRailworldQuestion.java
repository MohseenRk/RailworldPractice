
public class StringRailworldQuestion
{
	public static void main(String[] args) {
		
		String s1= "hello";
		String s2= new String("hii");
		String s3 = s1.concat(s2);
		String s4=s1.concat(s1);
		
		System.out.println(s1.length());
		System.out.println(s1.charAt(1));
		System.out.println(s1.indexOf('l'));
		System.out.println(s1.contains("lo"));
		System.out.println(s1.contains(s2));
		System.out.println(s1.substring(1));
		System.out.println(s1.substring(1, 3));
		System.out.println(s3);
		System.out.println(s4);
		
	}

}
