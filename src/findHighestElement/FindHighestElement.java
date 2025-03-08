package findHighestElement;

import java.util.*;

public class FindHighestElement {

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
		int max = 0;
		
		for(int i=0;i<length;i++)
		{
			if(arr[i]>max) 
			{ 
				max = arr[i];
			}
			
		}
		System.out.println("Highest number : " + max);
	}

}
