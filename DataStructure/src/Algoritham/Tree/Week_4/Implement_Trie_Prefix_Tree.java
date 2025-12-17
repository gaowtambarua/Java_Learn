package Algoritham.Tree.Week_4;

import java.util.*;

public class Implement_Trie_Prefix_Tree {
//	class TrieNode
//	{
//		TrieNode [] trie=new TrieNode [26];
//		boolean wordEnd=false;
//	}
//	class Trie {
//		TrieNode root;
//	    public Trie() {
//	    	root=new TrieNode();
//	    }
//	    
//	    public void insert(String word) {
//	    	TrieNode node=root;
//	    	for(char ch : word.toCharArray())
//	    	{
//	    		int key=ch-'a';
//	    		if(node.trie[key]==null)
//	    		{
//	    			node.trie[key]=new TrieNode();
//	    		}
//	    		node=node.trie[key];
//	    	}
//	    	node.wordEnd=true;
//	    }
//	    
//	    public boolean search(String word) {
//	    	TrieNode node=root;
//	    	for(char ch : word.toCharArray())
//	    	{
//	    		int key=ch-'a';
//	    		if(node.trie[key]==null)
//	    		{
//	    			return false;
//	    		}
//	    		node=node.trie[key];
//	    	}
//	        return node.wordEnd;
//	    }
//	    
//	    public boolean startsWith(String prefix) {
//	    	TrieNode node=root;
//	    	for(char ch : prefix.toCharArray())
//	    	{
//	    		int key=ch-'a';
//	    		if(node.trie[key]==null)
//	    		{
//	    			return false;
//	    		}
//	    		node=node.trie[key];
//	    	}
//	        return true;
//	    }
	
	/////////////////////////////////////////////////////////////////////////////////////////////////////
	
	//////////////////////////////////// Using HashMap
	
	
	class TrieNode
	{
		HashMap<Character,TrieNode> map=new HashMap();
		boolean wordEnd=false;
	}
class Trie {
		TrieNode root;
	    public Trie() {
	    	root=new TrieNode();
	    }
	    
	    public void insert(String word) {
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
	    	TrieNode node=root;
	    	for(char ch : word.toCharArray())
	    	{
	    		if(!node.map.containsKey(ch))
	    		{
	    			return false;
	    		}
	    		node=node.map.get(ch);
	    	}
	        return node.wordEnd;
	    }
	    
	    public boolean startsWith(String prefix) {
	    	TrieNode node=root;
	    	for(char ch : prefix.toCharArray())
	    	{
	    		if(!node.map.containsKey(ch))
	    		{
	    			return false;
	    		}
	    		node=node.map.get(ch);
	    	}
	        return true;
	    }
	}
	
	public Implement_Trie_Prefix_Tree()
	{
		Trie trie=new Trie();
		trie.insert("apple");
//		System.out.println(trie.search("apple"));
//		System.out.println(trie.search("app"));
		trie.insert("app");
//		System.out.println(trie.search("app"));
//		System.out.println(trie.startsWith("appd"));
		System.out.println(trie.startsWith(""));
		trie.insert("");
		System.out.println(trie.search(""));
	}
}
