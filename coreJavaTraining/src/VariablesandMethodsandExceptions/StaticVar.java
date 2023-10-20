package VariablesandMethodsandExceptions;

public class StaticVar {
	
	String name;
	String address;
	static String city;
	static int i;

	static
	{
		city="Bangalore";
		i=0;
	}
	
	StaticVar(String name, String address)
	{
		this.name=name;
		this.address=address;
		
	}
	
	public void getAddress()
	{
		i++;
		System.out.println(i+" "+address+" "+city);
		
	}
	
	public static void getCity()
	{
		System.out.println(city);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		StaticVar obj = new StaticVar("Bob","CanarabankLayout");
		StaticVar obj1 = new StaticVar("Jack","Malleswaram");
		StaticVar obj2 = new StaticVar("Jill","Sahakaranagar");
		StaticVar.getCity();
		obj.getAddress();
		obj1.getAddress();
		obj2.getAddress();
		
	}

}
