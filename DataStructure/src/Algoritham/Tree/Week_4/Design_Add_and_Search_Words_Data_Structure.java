package Algoritham.Tree.Week_4;

import java.util.*;

import Algoritham.Tree.Week_4.Implement_Trie_Prefix_Tree.TrieNode;

public class Design_Add_and_Search_Words_Data_Structure {
	class TrieNode
	{
		HashMap<Character,TrieNode> map=new HashMap();
		boolean wordEnd=false;
	}
	
	class WordDictionary {
		TrieNode root;
		public WordDictionary() {
			root=new TrieNode();
		}

		public void addWord(String word) {
			TrieNode node=root;
			for(char ch :word.toCharArray())
			{
				if(!node.map.containsKey(ch))
				{
					node.map.put(ch, new TrieNode());
				}
				node=node.map.get(ch);
			}
			node.wordEnd=true;
		}

		public boolean search(String word) {

			return dfs(word,root);
		}
		private boolean dfs(String word,TrieNode root)
		{
			System.out.println(word.length()+" "+word+" "+root.wordEnd);
			if(word.length()==0)
			{
				return root.wordEnd;
			}
			TrieNode node=root;
			char frst=word.charAt(0);
			if(frst=='.')
			{
				for(char ch : node.map.keySet())
				{
					
					if(dfs(word.substring(1),node.map.get(ch)))
					{
						return true;
					}
				}
				return false;
			}
			else
			{
				if(!node.map.containsKey(frst))
				{
					return false;
				}
				node=node.map.get(frst); 
				
				return dfs(word.substring(1),node);
			}
		}
	}

	public Design_Add_and_Search_Words_Data_Structure()
	{
		WordDictionary wordDictionary = new WordDictionary(); 
		wordDictionary.addWord("mad");
//		wordDictionary.addWord("m");
//		wordDictionary.addWord("md");
//		//		wordDictionary.addWord("aam");
//		//wordDictionary.search("pad"); // return False
//		//		wordDictionary.search("bad"); // return True
//		//		wordDictionary.search(".ad");
		System.out.println(wordDictionary.search("mad"));
		
		
	}

}
