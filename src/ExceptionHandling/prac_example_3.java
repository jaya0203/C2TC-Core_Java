package ExceptionHandling;

public class prac_example_3 {

	public static void main(String[] args)
	{
		int x=1;
		int y=0;
		String z="pqr";
		
		try
		{
			int k=x/0;
			int l=Integer.parseInt(z);
			System.out.println("try-block");
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e);
		}
		catch(NumberFormatException ex)
		{
			System.out.println(ex);
		}
		
	}
}
