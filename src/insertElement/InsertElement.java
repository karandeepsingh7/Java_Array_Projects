package insertElement;

public class InsertElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		array[0] = 5;
		array[1] = 9;
		array[2] = 6;
		array[3] = 10;
		array[4] = 12;
		array[5] = 7;
		
		int x = 15;
		
		for(int i=6;i>2;i--)
		{
			array[i] = array[i-1];
		}
		
		array[2] = x;
		
		for(int y : array)
		{
			System.out.print(y + ", ");
		}
		
	}

}
