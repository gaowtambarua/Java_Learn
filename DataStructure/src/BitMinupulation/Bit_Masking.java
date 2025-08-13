package BitMinupulation;

public class Bit_Masking {
	public Bit_Masking()
	{
		int a=5;
		int mask=1<<1;
		System.out.println(Integer.toBinaryString(mask)+"="+Integer.parseInt("1011",2));
		System.out.println(Integer.toBinaryString(11));
		System.out.println("000"+Integer.toBinaryString(11>>3));
		System.out.println(Integer.toBinaryString(11<<5));
		
		
		System.out.println("////////////////////");
		///////////////////////////////////////////////
		int num = 5;  // 0101
		mask = 1 << 2;  // 0100 (4)
		if ((num & mask) != 0) {
		    System.out.println("3rd bit is set");
		}
	}
}
