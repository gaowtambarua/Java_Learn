package BitMinupulation;

public class Single_Number_III {
	
	public Single_Number_III()
	{
		
	}
	
	public int[] singleNumber(int[] nums) {
	    int xor = 0;

	    for (int num : nums) {
	        xor ^= num;
	    }

	    int diff = xor & -xor; /// binary te just 1ti one thakbe..last je jaigai one tahakbe okhane man vinno thakbe.  
// diffBit বের করো — (Rightmost Set Bit Trick)
	    int x = 0, y = 0;
	    for (int num : nums) {
	        if ((num & diff) == 0) {
	            x ^= num;
	        } else {
	            y ^= num;
	        }
	    }

	    return new int[]{x, y};
	}
}
