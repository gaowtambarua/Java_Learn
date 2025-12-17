package Algoritham.Tree.Week_4;

import java.util.ArrayList;
import java.util.List;

public class Trie_Autocomplete {
	class TrieNode {
		TrieNode[] children = new TrieNode[26];
		boolean isEnd = false;
	}
	class Trie {
		TrieNode root;
		public Trie()
		{
			root=new TrieNode();
		}
		public void insert(String word)
		{
			TrieNode cur=root;
			for(char c : word.toCharArray())
			{
				int indx=c-'a';
				if(cur.children[indx]==null)
				{
					cur.children[indx]=new TrieNode();
				}
				cur=cur.children[indx];
			}
			cur.isEnd=true;
		}

		// DFS to collect all words from this node
		
		public List<String> autocomplete(String prefix)
		{
			// Find the node where prefix ends
			TrieNode preFixNode=findPreFixNode(prefix);
			List<String> result=new ArrayList<>();
			bfs(preFixNode,result,prefix);
			return result;
		}
		public void bfs(TrieNode node,List<String> result,String word)
		{
			if(node==null)
			{
				return;
			}
			if(node.isEnd)
			{
				result.add(word);
			}
			for(int i=0;i<26;i++)
			{
				if(node.children[i]!=null)
				{
					char ch=(char)(i+'a');
					bfs(node.children[i],result,word+ch);
				}
			}
		}
		
		// Find the node where prefix ends
		private TrieNode findPreFixNode(String prefix)
		{
			TrieNode node=root;
			for(char ch : prefix.toCharArray())
			{
				int idx=ch-'a';
				if(node.children[idx]==null)
				{
					return null;
				}
				node=node.children[idx];
			}
			return node;
		}
	}

	public Trie_Autocomplete()
	{
		Trie trie = new Trie();
		trie.insert("app");
        trie.insert("apple");
        trie.insert("apply");
        trie.insert("apt");
        trie.insert("bat");
        trie.insert("batch");

		System.out.println(trie.autocomplete("ap")); 
		
		trie = new Trie();
        trie.insert("app");
        trie.insert("apple");
        trie.insert("apply");
        trie.insert("apt");
        trie.insert("bat");
        trie.insert("batch");

        System.out.println(trie.autocomplete("ap")); 
        // Output: [app, apple, apply, apt]
	}
}
