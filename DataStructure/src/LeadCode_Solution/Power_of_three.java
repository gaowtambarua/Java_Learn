package LeadCode_Solution;

public class Power_of_three {
	public Power_of_three()
	{
		System.out.println(isPowerOfThree(243));
	}
	public boolean isPowerOfThree(int n) {
		if (n < 1) return false;

		while (n % 3 == 0) {
			n /= 3;
		}

		return n == 1;
	}
}
