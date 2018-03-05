package com.jay.test;

import com.yinlib.sort.IArrayUtil;
import com.yinlib.sort.heap.HeapSortStatic;

public class HeapSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arr[] = {3, 1, 3, 4, 2, 4, 8, 1};
		
		HeapSortStatic.heapSort(arr);

		IArrayUtil.printArray(arr);
	}
	
}
