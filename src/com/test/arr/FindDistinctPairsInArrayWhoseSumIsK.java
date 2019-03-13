package com.test.arr;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FindDistinctPairsInArrayWhoseSumIsK {

	public static void main(String[] args) {

		List<Integer> list = Arrays.asList(1,2,3,4,5,6,4);
		System.out.println(find(list, 10));
		
	}

	public static int find(List<Integer> list, int k) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		for (Integer integer : list) {
			if (!map.containsKey(integer)) {
				map.put(integer, 1);
			}
		}
		int count = 0;
		for (Integer integer : list) {
			if (map.containsKey(k - integer)) {
				count++;
			}
		}

		return count / 2;

	}

}
