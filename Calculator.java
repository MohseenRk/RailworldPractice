import java.util.Scanner;

public class Calculator  extends Thread
{
	Scanner sc = new Scanner(System.in);
	
	public void run()
	{
		if (getName().equals("add"))
		{
			add();
		}
		else if(getName().equals("sub"))
		{
			sub();
		}
		else if(getName().equals("div"))
		{
			div();
		}
		else
		{
			mul();
		}
	}
	
	void add()
	{
	try 
		{
		System.out.println("add method started");
		System.out.println("enter first no");
		int a = sc.nextInt();
		System.out.println("enter second no");
		int b = sc.nextInt();
		int c = a+b;
		Thread.sleep(2000);
		System.out.println("result is "+c);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}	
	System.out.println("add method ended");
	}
	
	void sub() 
	{
		try 
		{
		System.out.println("sub method started");	
		System.out.println("enter first no");
		int a = sc.nextInt();
		System.out.println("enter second no");
		int b = sc.nextInt();
		int c = a-b;
		Thread.sleep(2000);
		System.out.println("result is "+c);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("sub method ended");
	}
	
	void div()
	{
		try 
		{
		System.out.println("div method started");
		System.out.println("enter first no");
		int a = sc.nextInt();
		System.out.println("enter second no");
		int b = sc.nextInt();
		int c = a/b;
		Thread.sleep(2000);
		System.out.println("result is "+c);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("div method ended");
	}
	
	void mul()
	{
		try 
		{
		System.out.println("mul method started");	
		System.out.println("enter first no");
		int a = sc.nextInt();
		System.out.println("enter second no");
		int b = sc.nextInt();
		int c = a*b;
		Thread.sleep(2000);
		System.out.println("result is "+c);
		}
		catch (Exception e)
		{
			e.printStackTrace();
		}
		System.out.println("mul method ended");
	}
	
}
