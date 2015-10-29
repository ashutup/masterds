package com.test.arr;

//Program:     Heap Class
//Date:	4/27/2002; 11/13/02
//
//heap.java
//		Let A be heap with n nodes
//		stored in Array A[0..n-1]
//		left child of A[i] stored at A[2i+1]
//		right child of A[i] stored at A[2i+2]
//Note: 	The heap class takes an array as an input parameter.
//to run this program: > Call the class from another program.
//			  Example:  heap a = new heap(array);
import java.io.*; //for I/O
///////////////////////////////////////////////////////////////////////////

public class Heap2 {
	
	public int n; // number of nodes

	public void heap(int B[]) throws IOException
	{
		

		n = B.length; 

		for (int i = n / 2 - 1; i >= 0; i--) // from n/2 downto 1
		{
			Heapify(B,i); 

		}

	}

	
	public void Heapify(int B[],int i) 
	{
		int left, right, min, tmp;

		left = 2 * i + 1; // left child
		right = 2 * i + 2; // right child

		if (left < n && B[left] < B[i]) // find smallest child
			min = left; // save index of smaller child
		else
			min = i;

		if (right < n && B[right] < B[min])
			min = right; // save index of smaller child

		if (min != i) // swap and percolate, if necessary
		{
			tmp =B[i]; // exchange values at two indices
			B[i] =B[min];
			B[min] = tmp;
			Heapify(B,min); // call Heapify
		}

	}

	// ------------------------------------------------------------------------
//	public void Insert(int key) // insert new node with key value = key
//	{ // Parent of node i is at node i/2 ... assume i/2 = floor(i/2)
//
//		int i; // declare variables
//
//		n++; // increment # nodes
//		i = n - 1;
//
//		while (i > 0 && B[(i - 1) / 2] > key) // percolate up
//		{
//			A[i] = A[(i - 1) / 2];
//			i = (i - 1) / 2;
//
//		}// end while
//
//		A[i] = key; // set A[i] equal to key
//
//	}// end method Insert()
//
//	// ------------------------------------------------------------------------
//	public int Delete_root() // remove node with minimum value
//	{
//		int min; // declare variables
//
//		if (n < 1) // if n is less than 1
//		{
//			System.out.println("error"); // display error
//			return -1; // return -1
//		} else {
//			min = A[0];
//			A[0] = A[n - 1]; // replace root with last element in heap
//			n--; // reduce heap size
//			Heapify(0); // percolate new root downwards
//			return min; // return min
//
//		}// end if
//
//	}// end method Delete_root()

	// ------------------------------------------------------------------------
	public int Empty() // return if heap is empty or not
	{
		if (n == 0) // if it's empty
			return 1;
		else
			return 0; // not empty

	}// end method Update()

	// ------------------------------------------------------------------------
}// end heap class
// //////////////////////////////////////////////////////////////////////////

