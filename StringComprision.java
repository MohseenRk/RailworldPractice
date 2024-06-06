
public class StringComprision {

	public static void main(String[] args) {
		
		String s1 = new String ("java");
		String s2 = new String ("java");
		//s1="java";
		//s2= "java";
		
		if(s1==s2) {
			System.out.println("address is equal");
		}
		else {
			System.out.println("address is not equal");
	}
		if(s1.equals(s2)) {
			System.out.println("value is equal");
		}
		else {
			System.out.println("value is not equal");
		}
		if(s1.equalsIgnoreCase(s2)) {
			System.out.println("value are equal after ignoring");
		}
		else {
			System.out.println("value are not equal after ignoring");
		}
		if(s1.compareTo(s2)>0) {
			System.out.println("s1 is greater");
		}
		else if(s1.compareTo(s2)<0) {
			System.out.println("s2 is greater");
		}
		else {
			System.out.println("both is equal");
		}
	}
	
	

}
