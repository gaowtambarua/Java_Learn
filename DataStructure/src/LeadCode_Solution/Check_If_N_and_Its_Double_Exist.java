package LeadCode_Solution;

import java.util.HashSet;

public class Check_If_N_and_Its_Double_Exist {
	public Check_If_N_and_Its_Double_Exist()
	{
		int[] arr1 = {2,0,10,-19,4,6,-8};
		System.out.println(checkIfExistC(arr1)); 
		System.out.println(checkIfExistJava(arr1)); 
	}
//////////////////////////////////////////Java basic code 1346 code	
	public boolean checkIfExistJava(int[] arr) {
		HashSet<Integer> seen=new HashSet<Integer>();
		for(int num:arr)
		{
			if(seen.contains(num*2)||(num % 2 == 0 && seen.contains(num / 2)))
			{
				return true;
			}
			seen.add(num);
		}
		return false;
	}
	
////////////////////////////////////////// C basic code 1346 code	
	public boolean checkIfExistC(int[] arr)
	{
		for(int i=0;i<arr.length;i++)
		{
			for(int j=0;j<arr.length;j++)
			{
				if(i!=j)
				{
					if(arr[i]==arr[j]*2)
					{
						return true;
					}
				}
			}
		}
		return false;
	}
	
	
	
}
