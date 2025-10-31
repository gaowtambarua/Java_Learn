package dataStructure;

public class Lexicographically_Smallest_String_After_Reverse {
	public Lexicographically_Smallest_String_After_Reverse()
	{
		String s="dcab";
		System.out.println(lexSmallest(s));
	}
	public String lexSmallest(String s) {

		 int n=s.length();
	        String result=s;
	        for(int k=1;k<=n;k++)
	            {
	                StringBuilder build1=new StringBuilder(s.substring(0,k)).reverse();
	                build1.append(s.substring(k));
	                if(build1.toString().compareTo(result)<0)
	                {
	                    result=build1.toString();
	                }

	                build1=new StringBuilder(s.substring(n-k)).reverse();
	                build1.insert(0,s.substring(0,n-k));
	                if(build1.toString().compareTo(result)<0)
	                {
	                    result=build1.toString();
	                }
	            }
	        return result;
	}
}
