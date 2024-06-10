package ExceptionPractice;

import java.util.Scanner;

public class UncheckedException {
	
	public static void main(String[] args) 
	{
		
		try {
		Scanner sc= new Scanner(System.in);
		System.out.println("Enter first no ");
		int a=sc.nextInt();
		System.out.println("Enter second no ");
		int b=sc.nextInt();
		int c=a/b;
		System.out.println(c);
		
		System.out.println("Enter size of array ");
		int size= sc.nextInt();
		int[] arr= new int[size];
		
		System.out.println("Enter an element ");
		int elem= sc.nextInt();
		
		System.out.println("Enter index you want to store ");
		int i=sc.nextInt();
		arr[i]= elem;
		System.out.println("Element store successfully ");
		}
		catch(ArithmeticException ae)
		{
			System.out.println("cannot divided by zero");
			ae.printStackTrace();
		}
		catch(ArrayIndexOutOfBoundsException aie) {
			System.out.println("Please provide correct index ");
			aie.printStackTrace();
		}
		catch(NegativeArraySizeException nae)
		{
			System.out.println("Please provide positive size ");
			nae.printStackTrace();
		}
		catch(Exception e)
		{
			System.out.println("Exception handled ");
		}
		
	}

}
