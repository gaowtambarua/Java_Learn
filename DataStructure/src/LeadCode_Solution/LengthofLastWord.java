package LeadCode_Solution;

public class LengthofLastWord {

	public LengthofLastWord()
	{
		String s="Hello World";
		System.out.println(lengthOfLastWord(s));
	}
	public int lengthOfLastWord(String s) {
		String [] a=null;
		a=s.split(" ");
		return a[a.length-1].length();
	}
}
