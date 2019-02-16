package javaBasic_3;

import java.util.Arrays;

/*
 * 冒泡排序
 * 每次比较相邻两数 小的交换到前面 每轮结束后最大的数交换到最后
 */
public class Test_28_bubbleSort {

    public static void main(String[] args){

        int[] nums = {16,25,9,90,23};

        for(int i = 0; i < nums.length - 1; i++){
            for(int j = 0; j < nums.length - 1; j++){
                if(nums[j] > nums[j+1]){
                    int temp = nums[j + 1];
                    nums[j + 1] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(nums));

    }

}
