package dataStructure;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Two_Three_Dimantion_List_ {
	public Two_Three_Dimantion_List_()
	{
		//		int[][] nums = {
		//		{1, 2, 3},
		//		{0,2,13}
		//		}; // Step 1: Input
		//System.out.println(Arrays.deepToString(nums));

		List<List<List<Integer>>> nums=new ArrayList<>(); // 1 2 3
		List<List<Integer>> layer0 =new ArrayList<>();
		layer0.add(Arrays.asList(1, 2, 3));
		layer0.add(Arrays.asList(0,2,13));
		List<List<Integer>> layer1 =new ArrayList<>();
		layer1.add(Arrays.asList(3, 2, 1));
		layer1.add(Arrays.asList(13,2,0));
		nums.add(layer0);
		nums.add(layer1);
		System.out.println(nums);
	}
}
