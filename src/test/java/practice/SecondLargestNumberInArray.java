package practice;

import java.util.Arrays;

public class SecondLargestNumberInArray {

	public static int findSecondHighest(int[] array) {

		int highest = Integer.MIN_VALUE;
		int secondHighest = Integer.MIN_VALUE;

		for (int i : array) {
			if (i > highest) {
				secondHighest = highest;
				highest = i;
			} else if (i > secondHighest) {
				secondHighest = i;
			}

		}
		return secondHighest;
	}

	public static void main(String[] args) {

		int[] num = { 33, 22, 11, 23, 345, 43, 987, 234, 45, 32, 1235, 57786, 3456 };

		System.out.println(findSecondHighest(num));

		// Different ways
		Arrays.sort(num);

		System.out.println(num[num.length - 2]);

	}

}
