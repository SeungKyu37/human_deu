package human07;

import java.util.Scanner;

public class HumanExam08 {

	public static void main(String[] args) {
		// 최대, 최소, 합계를 구하는 프로그램(함수를 이용)
		int max, min, sum;
		int [] arr1 = {1,5,3,8,2};
		max = searchMax(arr1);
		min = searchMin(arr1);
		sum = doSum(arr1);
		System.out.printf("MAX = %d\n", max);
		System.out.printf("MIN = %d\n", min);
		System.out.printf("SUM = %d\n", sum);
		
		int [] arr2 = {10,20,5,30,1,-99,100};
		max = searchMax(arr2);
		min = searchMin(arr2);
		sum = doSum(arr2);
		System.out.printf("MAX = %d\n", max);
		System.out.printf("MIN = %d\n", min);
		System.out.printf("SUM = %d\n", sum);
		
	}
		
	private static int searchMax(int[] arr) {
		// 첫번째로는 arr = {1,5,3,8,2};
		// 두번째로는 arr = {10,20,5,30,1,-99,100};
		int max = -9999;		//MAX 값을 구할 때는 작을 수를 설정해야함.
		for(int a=0;a<arr.length;a++) {
			if(max<arr[a]) {
				max = arr[a];
			}
		}
		return max;
	}
	private static int searchMin(int[] arr) {
		int min = +9999;	
		for(int a=0;a<arr.length;a++) {
			if(min>arr[a]) {
			min = arr[a];
			}
		}
		return min;
	}
	private static int doSum(int[] arr) {
		int sum = 0;
//		for(int a =0; a<arr.length; a++) {
//			sum = sum + arr[a];
//		}
		for(int arrValue : arr) {
			sum = sum + arrValue;
		}
		return sum;
	}
}
