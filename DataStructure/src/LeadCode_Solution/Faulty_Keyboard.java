package LeadCode_Solution;

public class Faulty_Keyboard {
	public Faulty_Keyboard()
	{
		String s = "string";
		finalString(s);
	}

	public String finalString(String s) {
		StringBuilder reverse=new StringBuilder();
		for(char ch : s.toCharArray())
		{
			if(ch!='i')
			{
				reverse.append(ch);
			}
			else
			{
				reverse.reverse();
			}
		}
		return reverse.toString();
	}
}
