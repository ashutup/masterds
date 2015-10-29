/*
    Copyright (c) 2014 Ariba, Inc.
    All rights reserved. Patents pending.

    $Id$

    Responsible: i311232
*/

package com.trie;

public class TrieNode
{
    
    boolean isWord;
    TrieNode[] childs = new TrieNode[256];
    
    public TrieNode(){
        isWord = false;
    }
    
    
    public void insert(String word){
        if(word  == null)
            return;
        
        int len = word.length();
        
        TrieNode crawl = this;
        
        for (int i = 0; i < len; i++) {
            if(crawl.childs[word.charAt(i)] == null){
                TrieNode node = new TrieNode();
                if(i == len - 1)
                    node.isWord = true;
                crawl.childs[word.charAt(i)] = node;
            }
            crawl = crawl.childs[word.charAt(i)];
        }
        
    }
    
    public boolean lookup(String word){
        if(word == null)
            return false;
        
        TrieNode crawl = this;
        
        int len = word.length();
        
        for (int i = 0; i < len; i++) {
            if(crawl.childs[word.charAt(i)] == null)
                return false;
            else{
                if(crawl.childs[word.charAt(i)].isWord && i==len-1)
                    return true;
                else
                    crawl = crawl.childs[word.charAt(i)];
            }
        }
        
        
        
        return false;
    }
    
    public static void main (String[] args)
    {
        TrieNode dict = new TrieNode();
        
        dict.insert("house");
        dict.insert("housekeeper");
        dict.insert("housemate");
        dict.insert("housefull");
        dict.insert("home");
        dict.insert("homeland");
        dict.insert("land");
        dict.insert("ashutosh");
        
        System.out.println(dict.lookup("housee"));
    }
    
    

}
