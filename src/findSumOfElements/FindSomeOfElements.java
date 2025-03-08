package findSumOfElements;

public class FindSomeOfElements {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			int arr[] = {3,9,7,8,12,6,15,5,4,10};
			int sum = 0;
			int length = arr.length;
			System.out.println("No. of elements = "+length);
			
			for (int i = 0;i<length;i++)
			{
				sum = sum + arr[i];
			}
			
			System.out.println("Sum of elements = "+sum);
	}

}
