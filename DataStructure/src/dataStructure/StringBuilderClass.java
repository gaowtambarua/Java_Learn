package dataStructure;

public class StringBuilderClass {
	public StringBuilderClass()
	{
		String s = "Let's take LeetCode contest";
		String words[]=s.split(" ");
		StringBuilder stringbuild=new StringBuilder();
		for(String word : words )
		{
			String sr=new StringBuilder(word).reverse().toString();
			System.out.println(sr);
			//			stringbuild.append(sr);
			//			stringbuild.append(" ");
		}
		System.out.println(stringbuild.toString());



		///////////////////////////////////////////////////////////

		s = "abcdefgd"; 
		int k = 3;
		int len=s.length()%k==0?(s.length()/k):(s.length()/k)+1,left=0,i=0;
		String word[]=new String[len];
		for(i=0;(i+k)<s.length();i=i+k)
		{
			word[left]=s.substring(i,k+i);
			left++;
		}
		word[left]=s.substring(i,s.length());
		for(i=0;i<word.length;i=i+2)
		{
			word[i]=new StringBuilder(word[i]).reverse().toString();
		}
		s=String.join("",word);

		StringBuilder sb = new StringBuilder("World");
		sb.insert(0, "Hello ");   // index 0 মানে একদম শুরু
		System.out.println(sb.toString());
	}

}
