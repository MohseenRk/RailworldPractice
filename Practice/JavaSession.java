package Practice;

class JavaSession extends Thread

{
	public void run()
	{
		try {
		for(int i=1; i<=5; i++)
		{
			System.out.println(getName()+" is joining session");
			
				Thread.sleep(3000);
		   }
				
		}
		catch (InterruptedException e) 
			{
				e.printStackTrace();
			}
		}
	}




