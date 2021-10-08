package Array2D;

import java.util.Scanner;

public class Simple2D {
	public static void main(String[]args)
	{
		int a[][]=new int [][] { {2,3},
						          {4,5},
					           	  {6,7}};
		System.out.println("array element...");
		for (int i=0;i<a.length;i++)
		{
			for(int j=0;j<a[i].length;j++)
			{
				System.out.print(a[i][j]+" ");
			}
			System.out.println();
		}

}
}