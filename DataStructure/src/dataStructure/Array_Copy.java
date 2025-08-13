package dataStructure;

import java.util.Arrays;

public class Array_Copy {
	public Array_Copy()
	{
		int [] a={1,2,4};
		System.out.println(Arrays.toString(a));
		System.out.println("---------------------");
		arraCopy1(a);
		System.out.println(Arrays.toString(a));
		System.out.println("---------------------");
		arraCopy2(a);
		System.out.println(Arrays.toString(a));
	}
	public void arraCopy1(int [] a)
	{
		a=Arrays.copyOf(new int []{3,4,6}, a.length);
		System.out.println(Arrays.toString(a));
	}
	public void arraCopy2(int [] a)
	{
		System.arraycopy(new int []{3,4,6}, 0, a, 0, a.length);
		System.out.println(Arrays.toString(a));
	}
}
