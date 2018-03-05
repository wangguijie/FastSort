package com.yinlib.sort;

public class IArrayUtil {
	public static void printArray(int[] arr){
		
		if(arr == null || arr.length == 0){
			return;
		}
		StringBuffer buffer = new StringBuffer();
		for(int i = 0; i < arr.length; i++){
			buffer.append(arr[i] + " ");
		}
		System.out.println(buffer);
	}
	
	public static <T> void printArray(T[] arr){
		if(arr == null || arr.length == 0){
			return;
		}
		StringBuffer buffer = new StringBuffer();
		for(int i = 0; i < arr.length; i++){
			buffer.append(arr[i] + " ");
		}
		System.out.println(buffer);
	}
}
