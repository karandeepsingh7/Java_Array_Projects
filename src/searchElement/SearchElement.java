package searchElement;
import java.util.*;

public class SearchElement {

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
		
		System.out.println("Enter no. you want to find : ");
		int find = sc.nextInt();
		
		for(int i=0;i<length;i++)
		{
			if(arr[i]==find) 
			{ 
				System.out.println("Your Number "+find+" is at index "+i);
			}
			else {
				System.out.println("TRIED");
				
			}
		}
		
	}

}
