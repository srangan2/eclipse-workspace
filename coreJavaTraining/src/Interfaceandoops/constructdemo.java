package Interfaceandoops;

public class constructdemo {
	
	public constructdemo()
	{
		System.out.println("I am in the constructor");
		System.out.println("I am in the constructor1");
		System.out.println("I am in the constructor2");
	}

	public constructdemo(int a, int b)
	{
		System.out.println("I am in the Parametrized constructor");
		System.out.println("I am in the Parametrized constructor1");
		System.out.println(a+b);
	}

	public constructdemo(String a)
	{
		System.out.println(a);
	}
	
	public void getdata()
	{
		System.out.println("I am in the method");

	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		constructdemo cd = new constructdemo();
		cd.getdata();
		//constructdemo cd1= new constructdemo(2,4);
		//constructdemo cd2= new constructdemo("hello");

	}

}
