package LeadCode_Solution;

public class Check_If_N_and_Its_Double_Exist {
	public  Check_If_N_and_Its_Double_Exist()
	{
		int[] nums={10,2,5,3};
		System.out.println(checkIfExist(nums));
	}
	public boolean checkIfExist(int[] arr) {
		
		for(int i=0;i<arr.length;i=i+2)
		{
			
			for(int j=i+1;j<arr.length;j++)
			{
				if(arr[i]==2*arr[j])
				{
					return true;
				}
			}
		}
		return false;
	}
}
