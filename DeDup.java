package com.deduppack;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class DeDup {

	public int[] randomIntegers = { 1, 2, 34, 34, 25, 1, 45, 3, 26, 85, 4, 34, 86, 25, 43, 2, 1, 10000, 11, 16, 19, 1,
			18, 4, 9, 3, 20, 17, 8, 15, 6, 2, 5, 10, 14, 12, 13, 7, 8, 9, 1, 2, 15, 12, 18, 10, 14, 20, 17, 16, 3, 6,
			19, 13, 5, 11, 4, 7, 19, 16, 5, 9, 12, 3, 20, 7, 15, 17, 10, 6, 1, 8, 18, 4, 14, 13, 2, 11 };

	public static void main(String[] args) {
		DeDup deDup = new DeDup();

		int[] uniqueInt = deDup.uniqIntegers();
		deDup.printArray(uniqueInt);

		Integer[] uniqueInteger = deDup.uniqueIntegersUsingSet();
		deDup.printArray(uniqueInteger);

		uniqueInteger = deDup.uniqueIntegersUsingList();
		deDup.printArray(uniqueInteger);

	}

	/**
	 * Method to remove duplicates without using Java Collections.
	 * 
	 * @return
	 */
	private int[] uniqIntegers() {
		int[] uniqueInt = new int[randomIntegers.length];
		boolean isDuplicate = false;
		int k = 0;
		for (int i = 0; i < randomIntegers.length; i++) {
			isDuplicate = false;
			for (int j = 0; j < k; j++) {
				if (uniqueInt[j] == randomIntegers[i]) {
					isDuplicate = true;
					break;
				}
			}
			if (!isDuplicate) {
				uniqueInt[k++] = randomIntegers[i];
			}
		}

		uniqueInt = Arrays.copyOf(uniqueInt, k);

		return uniqueInt;
	}

	/**
	 * Method to remove duplicates using Java Set
	 * 
	 * @return
	 */
	private Integer[] uniqueIntegersUsingSet() {
		Set<Integer> uniqueIntegerSet = new HashSet<Integer>();
		for (int i = 0; i < randomIntegers.length; i++) {
			uniqueIntegerSet.add(randomIntegers[i]);
		}
		return uniqueIntegerSet.toArray(new Integer[0]);
	}

	/**
	 * Method to remove duplicates using Java List
	 * 
	 * @return
	 */
	private Integer[] uniqueIntegersUsingList() {
		List<Integer> resultList = new ArrayList<Integer>();
		for (int i = 0; i < randomIntegers.length; i++) {
			if (!resultList.contains(randomIntegers[i])) {
				resultList.add(randomIntegers[i]);
			}
		}
		return resultList.toArray(new Integer[0]);
	}

	/**
	 * Utility Method to print array
	 * 
	 * @param intArray
	 */
	private void printArray(Integer[] intArray) {
		System.out.print("{");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + ",");
		}
		System.out.println("}");
	}

	/**
	 * Utility method to print array
	 * 
	 * @param intArray
	 */
	private void printArray(int[] intArray) {
		System.out.print("{");
		for (int i = 0; i < intArray.length; i++) {
			System.out.print(intArray[i] + ",");
		}
		System.out.println("}");
	}
}