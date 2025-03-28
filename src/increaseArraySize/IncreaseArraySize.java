package increaseArraySize;

public class IncreaseArraySize {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array1 = {8,6,10,9,2};
		System.out.println(array1.length);
		
		int[] array2 = new int[2*array1.length];
		int array2Length = array2.length;
		
		for(int i = 0; i<array1.length ; i++)
		{
			array2[i] = array1[i];
		}
		
		array1 = array2;
		array2 = null;
		
		for(int i : array1)
		{
			System.out.print(i);
		}
		System.out.println();
		System.out.print(array1.length);
	}

}
