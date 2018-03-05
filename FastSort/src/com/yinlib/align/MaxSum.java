package com.yinlib.align;

public class MaxSum {

	public static int getMaxSum(int[] arr) {
		if (arr == null || arr.length == 0) {
			return 0;
		}
		int length = arr.length;
		int currentSum, maxSum = Integer.MIN_VALUE;
		int i, j;

		for (i = 0; i < length; i++) {
			currentSum = 0;
			for (j = i; j < length; j++) {
				currentSum += arr[j]; // 对于相同的i，不同的j，只要在j-1次循环的基础上累加1项即可
				if (currentSum > maxSum){
					maxSum = currentSum;
				}
			}
		}
		return maxSum;
	}

}
