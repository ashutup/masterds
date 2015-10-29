package triplets;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

public class Problem3SumHashTable {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		ArrayList<Integer> list = new ArrayList<Integer>();
		for (int i = 1; i < 10; i++) {
			list.add(i);
			int sum = 1 - i;
			if (sum != 0) {
				list.add(sum);
			}
		}
		Collections.sort(list);

		System.out.println("Input Array : " + list);

		Integer[] arr = list.toArray(new Integer[list.size()]);

		HashSet<Integer> hash = new HashSet<Integer>();
		for (Integer element : arr) {
			hash.add(element);
		}
		Set<Set<Integer>> result = new HashSet<Set<Integer>>();
		System.out.println(hash);
		for (int i = 0; i < arr.length; i++) {
			for (int j = i + 1; j < arr.length; j++) {
				int lookup = -(arr[i]+arr[j]);
				if(hash.contains(lookup)){
					if(arr[i] != lookup && arr[j] != lookup){
						Set set = new HashSet<Integer>();
						set.add(arr[i]);
						set.add(arr[j]);
						set.add(lookup);
						result.add(set);
					}
				}
			}
		}
		
		
		for (Set<Integer> set : result) {
			System.out.println(set);
		}
		System.out.println(result.size());
	}
}
