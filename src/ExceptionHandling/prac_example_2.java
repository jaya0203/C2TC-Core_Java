package ExceptionHandling;

public class prac_example_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// Handling Arithmetic exception by using try-catch block
		
		int data=100;
		try
		{
			int result=data/0;
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
       System.out.println("Exception is handled");
	}

}
