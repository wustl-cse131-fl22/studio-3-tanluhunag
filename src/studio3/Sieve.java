package studio3;

import java.util.Scanner;

public class Sieve {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		
		System.out.println("To what number?");
		int number = in.nextInt();
		int[] numberArray;
		int i;
		int j;
		int k=0;
		int l=0;
		int m=0;
		
		
		
		numberArray = new int [number];
		
        for (i = 2; i < number; i++)
        {
        	for (j=2; j< i; j++)
        	{
        		if (i%j==0)
        		{
        			k++;
        			
        		}    		
        	}
        	if (k==0)
        	{
        		numberArray[l]=i;
        		l++;
     
        	}
        	else
        	{
        		k=0;
        	}
        	
        	
        	
        }
        for (m=0; m < numberArray.length;  m++)
        {
            
        	if (numberArray[m]!=0)
        	{
        		System.out.println( numberArray[m] );
        	}
        	
        
	}

	}
}
