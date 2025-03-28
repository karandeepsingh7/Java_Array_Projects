package deletingElement;

public class DeletingElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] array = new int[10];
		int length = array.length;
		array[0] = 5;
		array[1] = 9;
		array[2] = 6;
		array[3] = 10;
		array[4] = 12;
		array[5] = 7;
		
		for(int i=2;i<length-1;i++)
		{
			array[i] = array[i+1];
		}
		
		for(int x : array)
		{
			System.out.print(x + ", ");
		}

	}

}
