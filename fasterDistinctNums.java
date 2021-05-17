package Tirgul1;

import java.util.Arrays;

public class fasterDistinctNums {
	
	public static void printArray(int[]A)
	{
		for (int i=0; i<A.length; i++)
		{
			System.out.print(A[i]+" ");
		}
	}
	
	public static int countDistinctNums(int A[]) {
		int counter = 0;
		boolean[] Barray = new boolean[A.length*10];
		Arrays.fill(Barray, Boolean.FALSE);
		for (int i=0; i<A.length; i++)
		{
			if (Barray[A[i]]==true)
			{
				counter=counter;
			} else {
				Barray[A[i]]=true;
				counter++;
			}
			
		}
		return counter;
	}


	
	
	public static void main(String[] args) {
		int a[] = {1,2,9,33,45,50,50};
		printArray(a);
		System.out.println();
		
		System.out.println("The number of distinct numbers is: ");
		System.out.println(countDistinctNums(a));
	}

}