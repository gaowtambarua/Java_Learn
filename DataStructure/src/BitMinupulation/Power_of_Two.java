package BitMinupulation;

public class Power_of_Two {

	/////// 10101011011
	////////0000000000
	////Poritibar 4 bit kore barce.
	/// 2^1=2        /////  10       3=11
	/// 2^2=4        /////  100      7=111 
	/// 2^3=8        /////  1000    15=1111
	/// 2^4=16       /////  10000   31=11111
	/// 2^5=32       /////  100000


	public Power_of_Two()
	{
		System.out.println(isPowerOfTwo(2));
	}
	public boolean isPowerOfTwo(int n) {

		return (n>=1)&&(n&(n-1))==0;
	}
}
