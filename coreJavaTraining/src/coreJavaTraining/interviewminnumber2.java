package coreJavaTraining;

public class interviewminnumber2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][]= {{2,4,5},{3,0,7},{1,2,9}};
		int min=abc[0][0];
		int mincolumn=0;
		int max=abc[0][mincolumn];
		for(int i=0;i<3;i++)
		{
			for (int j=0;j<3;j++)
			{
				if(abc[i][j]<min)
				{
					min=abc[i][j];
					mincolumn=j;
				}
			}
		}
		int k=0;
		while(k<3)
		{
			if(abc[k][mincolumn]>max)
			{
				max=abc[k][mincolumn];
			}
			k++;
		}
		System.out.println(max);
	}

}
