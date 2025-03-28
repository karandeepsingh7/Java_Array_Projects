package copyingArray;

public class CopyingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {8,6,10,9,2,15,7,13,14,11};
		
		int[] array2 = new int[10];
		int array2Length = array2.length;
		
		for(int i = 0; i<array2Length ; i++)
		{
			array2[i] = array1[i];
		}
		
		for(int i : array1)
		{
			System.out.print(i);
		}
		System.out.println();
		
		for(int j : array2)
		{
			System.out.print(j);
		}
		
	}

}
