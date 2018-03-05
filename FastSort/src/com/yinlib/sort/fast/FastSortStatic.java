package com.yinlib.sort.fast;

public class FastSortStatic{
	
	public static void fastSort(int[] arr){
		if(arr == null || arr.length <2 ){
			return;
		}
		fastSort(arr, 0 , arr.length -1);
	}
	
	private static  void fastSort(int[] arr,int low ,int hight){
		if(low < 0 || hight <= low){
			return;
		}
		int l = low;
		int h = hight;
		int povit = arr[low];
		int temp;
		while(l < h){
			while (l < h && arr[h] >= povit){
				--h;
			}
			if(l < h){
				temp = arr[l];
				arr[l] = arr[h]; 
				arr[h] = temp;
			}
			
			while (l < h && arr[l] <= povit){
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
}
