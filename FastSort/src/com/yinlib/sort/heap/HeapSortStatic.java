package com.yinlib.sort.heap;

import com.yinlib.sort.IArraySort;
import com.yinlib.sort.IArrayUtil;

public class HeapSortStatic {
	public static void heapSort(int[] arr){
		if(arr == null || arr.length <2 ){
			return;
		}
		buildMaxHeap(arr, arr.length);
		sort(arr, arr.length);
	}
	
	private static void buildMaxHeap(int[] arr,int len){
		for(int i = (int) Math.floor(len)/2; i >= 0; i--){
			heapify(arr,i,len);
//			IArrayUtil.printArray(arr);
		}
	}
	
	private static void sort(int[] arr,int len){
		for (int i = len - 1; i > 0; i--) {
            swap(arr, 0, i);
            len--;
            heapify(arr, 0, len);
        }
	}

	private static void heapify(int[] arr, int i, int len) {
		int left = 2 * i + 1;
		int right = 2 * i + 2;
		int largest = i;

		if (left < len && arr[left] > arr[largest]) {
			largest = left;
		}

		if (right < len && arr[right] > arr[largest]) {
			largest = right;
		}
		
		if (largest != i) {
			swap(arr, i, largest);
			heapify(arr, largest, len);
		}
	}

	private static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
}
