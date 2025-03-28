package reverseCopyingArray;
import java.util.*;

public class ReverseCopyingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter Length of Array : ");
		int array1length = sc.nextInt();
		
		int array1[] = new int[array1length];
		
		for(int i = 0; i<array1length ; i++)
		{
			System.out.println("Enter Value " + i + " : ");
			array1[i] = sc.nextInt();
		}
		
		int array2[] = new int[array1.length];
		
		for(int j = 0; j<array1.length; j++)
			{
				int decrement = array1.length-j;
				array2[decrement-1] = array1[j];
				
			}
		
		for(int i : array2)
		{
			System.out.print(i);
		}
	}

}
