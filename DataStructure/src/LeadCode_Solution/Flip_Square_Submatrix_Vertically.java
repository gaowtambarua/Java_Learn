package LeadCode_Solution;

import java.util.Arrays;

public class Flip_Square_Submatrix_Vertically {
	public Flip_Square_Submatrix_Vertically(){
		int grid[][]= {

				{3,4,2,3},
				{2,3,4,2}
		};

		int x = 0, y = 2, k = 2;
		
		reverseSubmatrix(grid, x, y, k);
	}
	public int[][] reverseSubmatrix(int[][] grid, int x, int y, int k) {
		int top=x;
		int buttom=x+k-1;
		while(top<buttom)
		{
			for(int left=y;left<k+y;left++)
			{
				int temp=grid[buttom][left];
				grid[buttom][left]=grid[top][left];
				grid[top][left]=temp;
			}
			top++;
			buttom--;
		}
		return grid;
	}
}
