package findSecondHighest;

import java.util.*;

public class FindSecondHighest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter Lenght of array : ");
		int length = sc.nextInt();
		
		int arr[] = new int[length];
		
		for(int i=0;i<length;i++)
		{
			System.out.println("Enter value of number "+ (i+1));
			arr[i] = sc.nextInt();
			
		}
		int max = arr[0];
		int secondH = arr[0];
	
		
		for(int i=0;i<length;i++)
		{
			if(arr[i]>max) 
			{ 
				secondH = max;
				max = arr[i];
				
			}
			else if (arr[1]>secondH)
			{
				secondH = arr[i];
			}
			
		}
		
		System.out.println("Second Highest number : " + secondH);
	}

}
