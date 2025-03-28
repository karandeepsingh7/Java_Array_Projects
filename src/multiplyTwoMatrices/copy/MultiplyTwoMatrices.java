package multiplyTwoMatrices.copy;

public class MultiplyTwoMatrices {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int array1[][] = new int[3][3];
		array1[0][0] = 3;
		array1[0][1] = 5;
		array1[0][2] = 9;
		
		array1[1][0] = 7;
		array1[1][1] = 6;
		array1[1][2] = 2;
		
		array1[2][0] = 4;
		array1[2][1] = 3;
		array1[2][2] = 5;
		
		int array2[][] = {{1,0,0},{0,1,0},{0,0,1}};
		
		int array3[][] = new int[3][3];
		
		for (int i = 0;i<array1.length ; i++)
		{
			for(int j = 0;j<array1[i].length;j++)
			{
				System.out.print(array1[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0;i<array2.length ; i++)
		{
			for(int j = 0;j<array2[i].length;j++)
			{
				System.out.print(array2[i][j]);
			}
			System.out.println();
		}
		
		System.out.println();
		
		for (int i = 0;i<array3.length ; i++)
		{
			for(int j = 0;j<array3[i].length;j++)
			{
				for(int k = 0;k<array3[i].length;k++)
				{
					//array3[i][j] = 0;
					array3[i][j] = array3[i][j] + array1[i][k]*array2[k][j];
				}
				System.out.print(array3[i][j]);
			}
			System.out.println();
		}
		
	}

}
