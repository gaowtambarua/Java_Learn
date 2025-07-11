package dataStructure;

public class String_ToLowerCase {
	public String_ToLowerCase()
	{
		String s="HEllW";
		System.out.println(capitalizeTitle(s));

		String title="fiRst leTTeR of EACH Word";

		System.out.println(capitalizeTitle2(title));
	}
	public String capitalizeTitle(String s) {   

		////		 for(int i=0;i<s.length();i++)
		////		 {
		////			 if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
		////			 {
		////				 s=s.replace(s.charAt(i),(char) (s.charAt(i)+32)); 
		////			 }
		////		 }
		////		 return s;
		//		 
		//		 return s.toLowerCase();


		char c[]=s.toCharArray();
		for(int i=0;i<c.length;i++)
		{
			if(c[i]>='A'&&c[i]<='Z')
			{
				c[i]=(char)(c[i]+32);
			}
		}

		return new String(c); 
	}
	public String capitalizeTitle2(String title) {
		String [] word=title.split(" ");
		for(int i=0;i<word.length;i++)
		{
			if(word[i].length()<=2)
			{
				word[i]=word[i].toLowerCase();
			}
			else
			{
				word[i]=word[i].substring(0,1).toUpperCase()+word[i].substring(1).toLowerCase();
			}
		}
		return String.join(" ", word);
	}


}
