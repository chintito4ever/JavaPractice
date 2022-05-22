package javaInterviewQuestions;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;

public class ArraySameElements {

	public static void main(String[] args) {

		Integer arr1[] = { 1, 4, 6, 7, 2, 6 };
		Integer arr2[] = { 1, 2, 7, 4, 6, 6 };
		Integer arr3[] = { 1, 3, 5, 8, 2, 2 };
		List<Integer> list1 = new ArrayList<Integer>(Arrays.asList(arr1));
		List<Integer> list2 = new ArrayList<Integer>(Arrays.asList(arr2));
		List<Integer> list3 = new ArrayList<Integer>(Arrays.asList(arr3));

		Collections.sort(list1);
		Collections.sort(list2);
		Collections.sort(list3);

		// after sorting
		System.out.println(list1);
		System.out.println(list2);
		System.out.println(list3);

		System.out.println(list1.equals(list2));
		System.out.println(list2.equals(list3));

		// if there's no duplicate element in the arrays, use HashSet.
		boolean set1 = new HashSet<Integer>(Arrays.asList(arr1)).equals(new HashSet<Integer>(Arrays.asList(arr2)));

		System.out.println(set1);

	}

}
