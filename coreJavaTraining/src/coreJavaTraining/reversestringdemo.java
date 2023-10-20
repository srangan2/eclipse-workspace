package coreJavaTraining;

public class reversestringdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	//	String s ="A B";
		//String t="";
		
		/*
		for(int i=s.length()-1;i>=0;i--)
		{
			if (!s(i) == ' ')
			{
                t[i] = ' ';
			}
			else
			{	
			t=(t+s.charAt(i));
		}
		}
		
		System.out.println(t);
		
		/*
		if (s==t)
		{
			System.out.println("String is a polindrome");
		}
		else
		{
			System.out.println("String is not a polindrome");
			*/
		
		
		String str = "hi welcome to Tutorialspoint";
	      String strArray[] = str.split(" ");
	      StringBuffer sb= new StringBuffer(str);
	      sb.reverse();
	      for(int i=0 ; i<str.length(); i++){
	      if(str.charAt(i)== ' '){
	         sb.insert(i, " ");
	      }
	   }
	   sb.append("");
	   System.out.println(sb);
	}
		
	}

}
