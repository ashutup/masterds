package com.tree;

public class CorrectBSTWhenTwoElementsSwapped {
	
	static TreeNode f,l,m,prev;

	/**
	 * @param args
	 */
	public static void main(String[] args) {

		TreeNode n5 = new TreeNode(5, "", null, null);
		TreeNode n15 = new TreeNode(15, "", null, null);

		TreeNode n25 = new TreeNode(25, "", null, null);
		TreeNode n40 = new TreeNode(10, "", null, null);

		TreeNode n10 = new TreeNode(40, "", n5, n15);
		TreeNode n30 = new TreeNode(30, "", n25, n40);
		TreeNode root = new TreeNode(20, "", n10, n30);

		System.out.println("Before Correction : ");
		root.print(root, 0);
		
		correct(root);
		
		
		if(f != null && l != null){
			int temp;
			temp = f.data1;
			f.data1 = l.data1;
			l.data1 = temp;
		}else if(f != null && m != null){
			int temp;
			temp = f.data1;
			f.data1 = m.data1;
			m.data1 = temp;
		}
		
		System.out.println("After Correction : ");
		root.print(root, 0);
	}
	
	public static void correct(TreeNode root){
		if(root == null)
			return;
		
		correct(root.left);
		
		if(prev != null && prev.data1 > root.data1){
			System.out.println("Swapped");
			
			if(f == null){
				f = prev;
				System.out.println("--" + f.data1);
				m = root;
			}else
				l = root;
			
		}
		prev = root;
		
		correct(root.right);
		
	}

}
