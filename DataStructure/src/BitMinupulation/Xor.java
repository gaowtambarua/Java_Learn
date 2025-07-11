package BitMinupulation;

public class Xor {

	//XOR 
	//////   0 0=0
	//////   0 1=1
	/////    1 0=1
	//////   1 1=0
	/////////////////////////
	//AND
	//////   0 0=0
	//////   0 1=0
	/////    1 0=0
	//////   1 1=1
	/////////////////////////
	//OR 
	//////   0 0=0
	//////   0 1=1
	/////    1 0=1
	//////   1 1=1
	/////////////////////////
	//Not
	//////   0=1
	//////   1=0
	/////////////////////////



	public Xor()
	{
		int [] nums={2,2,1};/// XOR er khettre same value hole minus hoye jabe.
		System.out.println(singleNumber(nums));
	}
	public int singleNumber(int[] nums) {
		int m=0;
		for(int n:nums)
		{
			m=m^n;
		}
		return m;
	}
}
