package coreJavaTraining;


public class add2numbers {

	
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a =2;
		int b =4;
		int c=(a+b);
		
		System.out.println("Result is " +c);
		Runtime rt = Runtime.getRuntime();

		long total_mem = rt.totalMemory();

		long free_mem = rt.freeMemory();

		long used_mem = total_mem - free_mem;

		System.out.println("Amount of used memory: " + used_mem);
	}

}
