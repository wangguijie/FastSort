package com.yinlib.sort.fast;

import com.yinlib.sort.IArraySort;

public class FastSort implements IArraySort{
	public void fastSort(Integer[] arr){
		if(arr == null || arr.length <2 ){
			return;
		}
		fastSort(arr, 0 , arr.length -1);
	}
	
	private <T extends Comparable<? super T>> void fastSort(T[] arr,int low ,int hight){
		if(low < 0 || hight <= low){
			return;
		}
		int l = low;
		int h = hight;
		T povit = arr[low];
		T temp;
		while(l < h){
			while (l < h && arr[h].compareTo(povit) >=0){
				--h;
			}
			if(l < h){
				temp = arr[l];
				arr[l] = arr[h]; 
				arr[h] = temp;
			}
			
			while (l < h && arr[l].compareTo(povit) <= 0){
				++l;
			}
			if(l < h){
				temp = arr[l];
				arr[l] = arr[h]; 
				arr[h] = temp;
			}
		}
		if(low < l) fastSort(arr,low,l-1);
		if(h < hight) fastSort(arr,h+1,hight);
	}

	public <T extends Comparable<T>> void sort(T[] arr) {
		if(arr == null || arr.length <2 ){
			return;
		}
		fastSort(arr, 0 , arr.length -1);
	}
	
}

