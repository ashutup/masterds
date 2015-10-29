package com.tree;

import java.util.ArrayList;
import java.util.List;

public class LowestCommonAncestor {
	

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		List<Integer> inorderResult = new ArrayList<Integer>();
		List<Integer> postorderResult = new ArrayList<Integer>();
		
		TreeNode n5 = new TreeNode(5, "", null, null);
		TreeNode n15 = new TreeNode(25, "", null, null);

		TreeNode n21 = new TreeNode(60, "", null, null);
		TreeNode n9 = new TreeNode(75, "", null, null);

		n9.left = new TreeNode(74, "", null, null);
		n9.right = new TreeNode(80, "", null, null);

		TreeNode n20 = new TreeNode(20, "", n5, n15);
		TreeNode n30 = new TreeNode(70, "", n21, n9);
		TreeNode T = new TreeNode(50, "", n20, n30);

		T.print(T, 0);
//		System.out.println("--------------");
		System.out.println("Recursion LCA : " + lowestCommonAncestorUsingRecursion(T, 60,80).data1);
		
		
		
		inorder(T, inorderResult);
		postorder(T, postorderResult);
		System.out.println("LCA for BST " + lcaForBST(T, 60, 80));
		
//		System.out.println("Inorder : " + inorderResult);
//		System.out.println("PostOrder : " + postorderResult);
//		lowestCommonAncestorUsingTraversals(T, 8, 100);

	}
	
	public static TreeNode lcaForBST(TreeNode root, int m, int n){
		if(root == null)
			return null;
		
		if(m < root.data1 && n < root.data1)
			return lcaForBST(root.left, m, n);
		if(m > root.data1 && n > root.data1)
			return lcaForBST(root.right, m, n);
		
		return root;
		
	}
	
	public static void lowestCommonAncestorUsingTraversals(TreeNode root, int m, int n){
		List<Integer> inorderResult = new ArrayList<Integer>();
		List<Integer> postorderResult = new ArrayList<Integer>();
		List<Integer> between = new ArrayList<Integer>();
		inorder(root, inorderResult);
		postorder(root, postorderResult);
		boolean start = false;
		boolean end = false;
		for (Integer integer : inorderResult) {
			if((m == integer || n == integer) && start){
				between.add(integer);
				break;
			}
			if(start && !end){
				between.add(integer);
				continue;
			}
			if(m == integer || n == integer){
				between.add(integer);
				start = true;
			}
		}
		
		int maxPostion = Integer.MIN_VALUE;
		Integer[] arr1 = between.toArray(new Integer[between.size()]);
		Integer[] arr2 = postorderResult.toArray(new Integer[postorderResult.size()]);
		for (int i = 0; i < arr1.length; i++) {
			for (int j = 0; j < arr2.length; j++) {
				if( arr1[i] == arr2[j]){
					maxPostion = Math.max(maxPostion, j);
				}
			}
			
			
		}
		
		System.out.println("LCA by Traversals : " + arr2[maxPostion]);
		
		
	}
	
	public static TreeNode lowestCommonAncestorUsingRecursion(TreeNode root, int m, int n){
		if(root == null)
			return null;
		
		if(root.data1 == m || root.data1 == n){
			return root;
		}
		
		TreeNode leftLCA = lowestCommonAncestorUsingRecursion(root.left, m, n);
		TreeNode rightLCA = lowestCommonAncestorUsingRecursion(root.right, m, n);
		
		if(leftLCA != null && rightLCA != null)
			return root;
		
		return leftLCA != null ? leftLCA : rightLCA;
		
	}
	
	public static void inorder(TreeNode root,List<Integer> result){
		if(root == null){
			return;
		}
		
		inorder(root.left,result);
		result.add(root.data1);
		inorder(root.right,result);
		
	}
	
	
	public static void postorder(TreeNode root,List<Integer> result){
		if(root == null){
			return;
		}
		postorder(root.left,result);
		postorder(root.right,result);
		result.add(root.data1);
		
		
		
		
	}

}
