package com.tree;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.TreeMap;

public class VerticalOrderTraversal {
	
	static TreeMap<Integer,List<TreeNode>> hds = new TreeMap<Integer, List<TreeNode>>();
	static int min=0, max=0,cnt=0;

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		TreeNode n2 = new TreeNode(2, "", null, null);
		TreeNode n8 = new TreeNode(8, "", null, null);
		TreeNode n50 = new TreeNode(50, "", null, null);
		TreeNode n5 = new TreeNode(5, "", n2, n8);
		TreeNode n12 = new TreeNode(12, "", null, null);
		TreeNode n15 = new TreeNode(15, "", n12, null);
		TreeNode n28 = new TreeNode(28, "", null, null);
		TreeNode n25 = new TreeNode(25, "", null, n28);
		TreeNode n40 = new TreeNode(40, "", null, n50);
		
		

		TreeNode n10 = new TreeNode(10, "", n5, n15);
		TreeNode n30 = new TreeNode(30, "", n25, n40);
		TreeNode root = new TreeNode(20, "", n10, n30);

		root.print(root, 0);
		
//		getHDs(root, 0);
//		System.out.println(hds);
//		for (Integer hd : hds.keySet()) {
//			System.out.println(hds.get(hd));
//		}
		
		findMinMax(root, 0);
		for (int i = min; i <= max; i++) {
		    if(i < 0){
		        printVerticalLine(root.left, i, -1);
		    }
		    else if(i > 0)
		    {
		        printVerticalLine(root.right, i, 1);
		    }else{
			    printVerticalLine(root, i, 0);
		    }
		}
		System.out.println("count : "+cnt);
		
	}
	
	
	public static void findMinMax(TreeNode root,int hd ){
		if(root == null)
			return ;
		
		if(hd < min)
			min = hd;
		else if(hd > max)
			max = hd;
		
		
		findMinMax(root.left, hd-1);
		findMinMax(root.right, hd+1);
	}
	
	
	public static void printVerticalLine(TreeNode root, int line_no, int hd){
		
		if(root == null)
			return;
		
		if(line_no == hd)
			System.out.println(root.data1);
			
		
		
		printVerticalLine(root.left, line_no, hd-1);
		printVerticalLine(root.right, line_no, hd+1);
		
		
	}
	
	public static void getHDs(TreeNode root , int initialHD){
		if(root == null)
			return;
		
		getHDs(root.left, initialHD - 1 );
		
	    if(hds.get(initialHD) != null){
	    	hds.get(initialHD).add(root);
	    }else{
	    	List<TreeNode> list = new ArrayList<TreeNode>();
	    	list.add(root);
	    	hds.put(initialHD, list);
	    }
		
		
		getHDs(root.right, initialHD + 1);
	}

}
