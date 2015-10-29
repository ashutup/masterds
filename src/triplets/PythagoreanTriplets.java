package triplets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class PythagoreanTriplets {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		
		ArrayList<Integer> arr = new ArrayList<Integer>();
		for(int i=1;i<100;i++){
			arr.add(i);
		}
		Collections.sort(arr);
		
		System.out.println("Input Array : " + arr);
		
		int[] squaredArr = new int[arr.size()];
		for (int i=0;i<arr.size();i++) {
			squaredArr[i] = arr.get(i)*arr.get(i);
		}
		
		for (Integer a : squaredArr) {
			
			Set<Set<Integer>> tripletsSquaredSet =  findPairForEach(a, squaredArr);
			if(tripletsSquaredSet.size() > 0)
			{
				for (Set<Integer> set : tripletsSquaredSet) {
					System.out.println("Pythagorean Triplets : ");
					for (Integer integer : set) {
						System.out.println(Math.sqrt(integer));
					}
				}
			}
			
		}
		
		
	}
	
	
	private static Set<Set<Integer>> findPairForEach(int a , int[] sortedArr){
		int p = 0;
		int q = sortedArr.length - 1;
		Set<Set<Integer>> tripletsSquaredSet = new HashSet<Set<Integer>>();
		while(p<q){
			int sum = sortedArr[p] + sortedArr[q];
			if(a > sum){
				p++;
			}
			else if(a < sum){
				q--;
			}
			else{
				Set<Integer> squaredTriplets = new HashSet<Integer>();
				squaredTriplets.add(a);
				squaredTriplets.add(sortedArr[p]);
				squaredTriplets.add(sortedArr[q]);
				tripletsSquaredSet.add(squaredTriplets);
				
				break;
			}
		}
		return tripletsSquaredSet;
		
	}

}
