package LeadCode_Solution;

public class ToLowerCase {
	public ToLowerCase()
	{
		String s="HEllW";
		System.out.println(capitalizeTitle(s));
	}
	 public String capitalizeTitle(String s) {   
		 
////		 for(int i=0;i<s.length();i++)
////		 {
////			 if(s.charAt(i)>='A'&&s.charAt(i)<='Z')
////			 {
////				 s=s.replace(s.charAt(i),(char) (s.charAt(i)+32)); 
////			 }
////		 }
////		 
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
	 
	 
	 
}
