package com.jay.test;

import com.yinlib.sort.IArraySort;
import com.yinlib.sort.fast.FastSort;
import com.yinlib.sort.heap.HeapSortStatic;

public class FastSortTest {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Integer arr[] = {3, 1, 3, 4, 2, 4, 8, 1};
		IArraySort sort = new FastSort(); 
		sort.sort(arr);
		for(int child : arr){
			System.out.print(child + " ");
		}

	}

}
