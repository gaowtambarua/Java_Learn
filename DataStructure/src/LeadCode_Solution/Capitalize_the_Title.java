package LeadCode_Solution;

public class Capitalize_the_Title {
	public Capitalize_the_Title()
	{
		String title="fiRst leTTeR of EACH Word";
		
		System.out.println(capitalizeTitle(title));
	}
	public String capitalizeTitle(String title) {
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
