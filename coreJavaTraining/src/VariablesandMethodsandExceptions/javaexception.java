package VariablesandMethodsandExceptions;

public class javaexception {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//int a =4;
		//3 lines of code - not sure if they thrwo error
		
		int b=7;
		int c=0;
		
		try
		{
		int k=b/c;
		//int arr[]= new int[5];
		//System.out.println(arr[7]);
		
		System.out.println(k);
		}
		catch(ArithmeticException e)
		{
			System.out.println("I captured Arithmatic exception");
		}
		
		catch(IndexOutOfBoundsException e)
		{
			System.out.println("I captured Index/bound exception");
		}
		catch(Exception e)
		{
			System.out.println("I captured general exception");
		}
		finally
		{
			System.out.println("delete cookies");
		}
	}

}
