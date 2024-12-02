package dataStructure;

import java.util.Arrays;
import java.util.Scanner;

public class aray {
	
	public aray()
	{
		arrayDeclare();
	}
	
	public void arrayDeclare()
	{
		//2d Array
		int[][] matrix={
				{1, 2, 3},
			    {4, 5, 6},
			    {7, 8, 9}
		};
		System.out.println("Matrix value "+matrix[2][2]);
		System.out.println("Matrix Length "+matrix.length);
		
		//3d Array
		int[][][] threeDArray = {
			    {{1, 2}, {3, 4}},
			    {{5, 6}, {7, 8}}
			};
		System.out.println("3D Matrix Length "+threeDArray.length);
		
		/////////////////Arrays short
		
		int[] a={3,1,6,4,2,8,9};
		Arrays.sort(a);
		for(int i=0;i<a.length;i++)
		{
			System.out.print(" "+a[i]);
		}
		System.out.println("\n"+Arrays.toString(a));
		
		
		
		////////Input
		Scanner scanner = new Scanner(System.in);
		int[] na =new int[123] ;
		for(int i=0;i<10;i++)
		{
			na[i]=scanner.nextInt();
			System.out.println(na[i]);
		}
		
		String[] s=new String[100];
		for(int i=0;i<20;i++)
		{
			s[i]=scanner.nextLine();
			System.out.println(s[i]);
		}
		scanner.close();
	}
}
