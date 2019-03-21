package com.tree;

public class PrintRootToLeafPathWithSumK {

	static int SUM = 140;

	public static void main(String[] args) {
		TreeNode root = TreeNode.getBinaryTree();
		root.print(root, 0);
		printPath(root, new int[root.getHeight(root)], 0);
	}

	public static boolean printPath(TreeNode root, int[] path, int index) {
		if (root == null) {
			return false;
		}

		path[index] = root.data1;
		index++;

		if (root.isLeaf()) {
			if (getSum(path, index) == SUM) {
				for (int i=0 ; i < index;i++) {
					System.out.println(path[i]);
				}
				return true;
			}

			return false;
		}

		boolean pathFoundInLeft = printPath(root.left, path, index);

		if (pathFoundInLeft) {
			return true;
		}

		return printPath(root.right, path, index);
	}

	private static int getSum(int[] arr, int indexTillSumNeedsTobeCalculated) {
		int sum = 0;
		for (int i = 0; i < indexTillSumNeedsTobeCalculated; i++) {
			sum = sum + arr[i];
		}
		return sum;
	}

}
