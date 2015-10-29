package com.arr.algos;

public class CountFrequencyForEachDigitIn0ToN {

	public static void main(String[] args) {
		
		int n = 10;
		
		int[] arr = CountOccurencesOfEachDigit(100);
		for (int i = 0; i < arr.length; i++) {
			System.out.println("Count["+i+"] " + arr[i]);
		}

	}

	
	public static int[] CountOccurencesOfEachDigit(int N){
		int[] arr = new int[10];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=0;
		}
		for (int i = 1; i <= N; i++) {
			int temp = i;
			while(temp > 0){
				int mod = temp % 10;
				arr[mod]++;
				temp = temp / 10;
			}
			
		}
		
		return arr;
	}
}
