package javaexamples;

public class methodovveriding 
{
	public void metho21()
	{
		System.out.println("method1");
	}
}
	  class overriding extends methodovveriding
	{
		public void method2()
		{
			System.out.println("method2");
		}
	
	
	

	    public static void main( String[] args )		
	    {
			overriding over = new overriding();
			over.method2();
			methodovveriding over1 = new overriding ();
			over1.metho21();
			
			
		}
	}


