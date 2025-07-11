package Math;

public class Power_of_Four {

	// 1e-1	0.1
	// 1e-3	0.001
	// 1e-10	0.0000000001
	// 1e-20	0.00000000000000000001
	// 1e-50	0.000...0001 (৪৯টা ০) ✅ 

	//1e-50 মানে:  1 × 10−50
	// log b^n=log(n)/log(b)	


	public Power_of_Four()
	{
		//			System.out.println(1e-10);
		//			System.out.println(0.01<1e-10);//0.01 <0.0000000001 0.01 boro aikhane 
		//			System.out.println(0.00<1e-12);
		System.out.println(Math.abs(-123));/// math .abs er kaz hocce ai positive value return korbe
		System.out.println(isPowerOfFour(24));
	}
	public boolean isPowerOfFour(int n) {
		//			if(n<1)
		//			{
		//				return false;
		//			}
		//			while(n%4==0)
		//			{
		//				n=n/4;
		//			}
		//			return n==1;

		if (n <= 0) return false;
		double logVal = Math.log(n) / Math.log(4); ///////////////  a^x=b  
		return Math.abs(logVal - Math.round(logVal)) < 1e-10;  //Math.round er kaz hocce doshomik shonkha bad deowa


	}
}
