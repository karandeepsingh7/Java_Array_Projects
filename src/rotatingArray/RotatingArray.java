package rotatingArray;

public class RotatingArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = {5,9,6,10,12,7,3,5,4,2};
		
		int length = array.length;
		
		/*//LEFT TO RIGHT
		int firstElement = array[0];
		
		int j = 1;
		
		for(int i=0;i<length-1;i++)
		{
			array[i]=array[j];
			j++;
		}
		
		array[9] = firstElement;
		
		*/
		
		//RIGHT TO LEFT
		int firstElement = array[length-1];
		
		for(int i=length-1;i>0;i--)
		{
			array[i]=array[i-1];
		}
		
		array[0] = firstElement;
		
		for(int x=0;x<length;x++)
		{
			System.out.print(array[x]+", ");
		}
		
	}

}
