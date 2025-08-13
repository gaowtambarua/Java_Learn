package BitMinupulation;

public class Binary_Representation {
	public Binary_Representation()
	{
		System.out.println(Integer.parseInt("0000", 2)); //0
		System.out.println(Integer.parseInt("0001", 2)); //1
		System.out.println(Integer.parseInt("0010", 2)); //2
		System.out.println(Integer.parseInt("0011", 2)); //3
		System.out.println(Integer.parseInt("0100", 2)); //4
		System.out.println(Integer.parseInt("0101", 2)); //5
		System.out.println(Integer.parseInt("0110", 2)); //6
		System.out.println(Integer.parseInt("0111", 2)); //7
		System.out.println(Integer.parseInt("1000", 2)); //8
		System.out.println(Integer.parseInt("1001", 2)); //9
		System.out.println(Integer.parseInt("1010", 2)); //10
		System.out.println(Integer.parseInt("1011", 2)); //11
		System.out.println(Integer.parseInt("1100", 2)); //12
		System.out.println(Integer.parseInt("1101", 2)); //13
		System.out.println(Integer.parseInt("1110", 2)); //14
		System.out.println(Integer.parseInt("1111", 2)); //15
		System.out.println("-------------");
		// 2,2,3,2,3,3,9
		
		// 0010
		// 0010
		// 0011
		// 0010
		// 0011
		// 0011
		// 1001
		//---------
		// 
		System.out.println(Integer.toBinaryString(9|3)); 
		//System.out.println(Integer.toBinaryString(3)); 
		////////////////////////
		
		int a = 5; // Binary: 0101  // 1 0 0 0
		int b = 3; // Binary: 0011
		System.out.println(a & b); 
		
		////////////counting bit
		System.out.println(Integer.toBinaryString(4));
	}
}
