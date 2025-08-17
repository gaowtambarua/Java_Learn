package LeadCode_Solution;

public class Reverse_Words_in_a_String_III {
	public Reverse_Words_in_a_String_III()
	{
		String s = "Let's take LeetCode contest";
		System.out.println(reverseWords(s));
		System.out.println(reverseWords2(s));
	}
	public String reverseWords(String s) {
		String words []=s.split(" ");
		StringBuilder result=new StringBuilder();
		for(int i=0;i<words.length;i++)
		{
			String reverse=new StringBuilder(words[i]).reverse().toString();
			result.append(reverse);
			result.append(" ");
		}
		return result.toString().trim();
	}
	public String reverseWords2(String s) {
		char[] chars = s.toCharArray(); // Step 1: convert string to char array
		int start = 0;
		for (int i = 0; i <=chars.length; i++) {
			if(i==chars.length||chars[i]==' ')
            {
            	reverse(chars,start,i-1);
            	start=i+1;
            }
        }
		return new String(chars);
	}
	public void reverse(char [] chars,int start,int end)
	{
		while(start<end)
		{
			char ch=chars[end];
			chars[end]=chars[start];
			chars[start]=ch;
			start++;
			end--;
		}
	}
}
