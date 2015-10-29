package triplets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Problem3Sum {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> list = new ArrayList<Integer>();
		for(int i=1;i<10;i++){
			list.add(i);
			int sum =1-i;
			if(sum != 0){
			 list.add(sum);
			}
		}
		Collections.sort(list);
		
		System.out.println("Input Array : " + list);
		
		Integer[] arr = list.toArray(new Integer[list.size()]);
		int count =0;
		for (int i=0;i<arr.length;i++) {
			for (int j=i+1;j<arr.length;j++){
				for (int k=j+1;k<arr.length;k++){
					int sum = arr[i]+arr[j]+arr[k];
					if(sum == 0){
						count++;
						System.out.println("Sum=0 triplets " + arr[i] + " " + arr[j] +  " " + arr[k]);
					}
				}
			}
			}
		
		System.out.println("Total no. of result " + count);
		
		
	}
	
	
	private static Set<Set<Integer>> findPairForEach(int a , int[] sortedArr){
		int p = 0;
		int q = sortedArr.length - 1;
		Set<Set<Integer>> resultSet = new HashSet<Set<Integer>>();
		while(p<q){
			int sum = a + sortedArr[p] + sortedArr[q];
			if(sum > 0){
				q--;
			}
			else if(sum < 0){
				p++;
			}
			else{
				Set<Integer> squaredTriplets = new HashSet<Integer>();
				squaredTriplets.add(a);
				squaredTriplets.add(sortedArr[p]);
				squaredTriplets.add(sortedArr[q]);
				resultSet.add(squaredTriplets);
				
				break;
			}
		}
		return resultSet;
		
	}

}
