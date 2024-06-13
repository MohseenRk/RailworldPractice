
public class CalculatorApp
{

	public static void main(String[] args) 
	{
		Calculator t1 = new Calculator();
		Calculator t2 = new Calculator();
		Calculator t3 = new Calculator();
		Calculator t4 = new Calculator();
		
		    t1.setName("add");
		    t2.setName("sub");
		    t3.setName("div");
		    t4.setName("mul");
		    
		    t1.start();
		    t2.start();
		    t3.start();
		    t4.start();
		    
	}

}
