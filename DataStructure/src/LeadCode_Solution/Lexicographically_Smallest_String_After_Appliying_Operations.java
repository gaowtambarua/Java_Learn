package LeadCode_Solution;

public class Lexicographically_Smallest_String_After_Appliying_Operations {
	public Lexicographically_Smallest_String_After_Appliying_Operations()
	{
		String s="43987654";
		int a=7,b=3;

		System.out.println(findLexSmallestString(s,a,b));

	}

	public String findLexSmallestString(String s, int a, int b) {
		int len=s.length();
		while(true)
		{
			String roted=s.substring((len-b),len)+s.substring(0,len-b);
			if(roted.compareTo(s)<0)
			{
				s=roted;
				char ch[]=s.toCharArray();
				while(true)
				{
					for(int i=1;i<ch.length;i=i+2)
					{
						int num=((ch[i]-'0')+a)%10;
						ch[i]=(char)(num+'0');
					}
					if((new String(ch)).compareTo(s)<0)
					{
						s=new String(ch);
					}
					else
					{
						break;
					}
				}
				
			}
			else
			{
				char ch[]=s.toCharArray();
				for(int i=1;i<ch.length;i=i+2)
				{
					int num=((ch[i]-'0')+a)%10;
					ch[i]=(char)(num+'0');
				}
				if((new String(ch)).compareTo(s)<0)
				{
					s=new String(ch);
					System.out.println(s);
				}
				else
				{
					break;
				}
				
			}
			
		}
		return s;
	}

}
