package com.trie;

import java.util.HashMap;

public class TryNode {
	private char value;
	private HashMap<Character, TryNode> children;
	private boolean bIsEnd;
	
	
	public TryNode(char ch)  {
	        value = ch;
	        children = new HashMap<Character, TryNode>();
	        bIsEnd = false;
	}
	
	
	
	public HashMap<Character, TryNode> getChildren() {
		return children;
	}

	public char getValue() {
		return value;
	}

	public void setIsEnd(boolean val) {
		bIsEnd = val;
	}

	public boolean isEnd() {
		return bIsEnd;
	}
}
