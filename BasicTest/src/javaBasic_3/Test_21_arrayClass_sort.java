package javaBasic_3;

import java.util.Arrays;
import java.util.Scanner;

/*
 * sort方法
 * 数组从小到大排列
 */
public class Test_21_arrayClass_sort {

	public static void main(String[] args){

		int[] nums = {98,65,70,85,77};

		//升序排列
		Arrays.sort(nums);

		for(int i = 0; i< nums.length; i++){
			System.out.print(nums[i] + "\t");
		}

		System.out.println("\n******************");

		//倒序排列
		for (int i = nums.length - 1; i >= 0; i--){
			System.out.print(nums[i] + "\t");
		}

	}
	
}
