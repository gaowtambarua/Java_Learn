package Algoritham.Tree.Week_4;
import java.util.*;
public class Replace_Words {
	class TrieNode
	{
		TrieNode children []=new TrieNode [26];
		boolean wordend=false;
	}
	class Trie
	{
		TrieNode root;

		public Trie()
		{
			root=new TrieNode();
		}
		public void insert(String data)
		{
			TrieNode node=root;
			for(char ch : data.toCharArray())
			{
				int idx=ch-'a';
				if(node.children[idx]==null)
				{
					node.children[idx]=new TrieNode();
				}
				node=node.children[idx];
			}
			node.wordend=true;
		}
		private String buildResult(String preFix)
		{
			TrieNode note=root;
			String result="";
			for(char ch : preFix.toCharArray())
			{
				int idx=ch-'a';
				if(note.children[idx]==null)
				{
					return preFix;
				}
				note=note.children[idx];
				result=result+ch;
				if(note.wordend)
				{
					break;
				}
			}
			return result;
		}
	}

	public Replace_Words()
	{
		List<String> dictionary=new ArrayList<>(Arrays.asList("a","b","c")); 
		String sentence="aadsfasf absbs bbab cadsfafs";
		System.out.println(replaceWords(dictionary,sentence));
	}
	public String replaceWords(List<String> dictionary, String sentence) {
		Trie root=new Trie();
		for(String data : dictionary)
		{
			root.insert(data);
		}
		String word[]=sentence.split(" ");
		String result="";
		for(String s : word)
		{
			result=result+root.buildResult(s)+" ";
		}
		return result.trim();
	}
}
