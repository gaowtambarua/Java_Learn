package BitMinupulation;

public class Brian_Kernighan {
	public Brian_Kernighan()
	{
		System.out.println(Integer.bitCount(11));
		System.out.println(hammingWeight(11));// 1011 bit =3 ta 1 ace
	}
	
	public int hammingWeight(int n) {
		int count=0;
			while(n!=0)
			{
				n=n&(n-1);
				count++;
			}
			
			return count; 
	    }
}
