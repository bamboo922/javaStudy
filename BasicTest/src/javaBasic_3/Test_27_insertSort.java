package javaBasic_3;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 插入排序
 * 将原数组升序排列后 插入一个数字 仍按升序排列
 */
public class Test_27_insertSort {

    public static void main(String[] args){

        int[] nums = {99,85,82,63,60};
        Arrays.sort(nums);
        System.out.println(Arrays.toString(nums));

        //给数组增加一个位置
        nums = Arrays.copyOf(nums,nums.length + 1);
        System.out.println(Arrays.toString(nums));

        Scanner scanner = new Scanner(System.in);
        System.out.print("插入的数字为：");
        int insertNum = scanner.nextInt();

        //找出新增数字对应的位置
        int index = 0;
        for(int i = 0; i < nums.length - 1; i++){
            if(insertNum < nums[i]){
                index = i;
                break;
            }
        }
        System.out.println("该数字的位置是：" + index);

        //将该位置后面的数字依次后移
        for(int i = nums.length - 2; i >= index; i--){
            nums[i + 1] = nums[i];
        }

        System.out.println(Arrays.toString(nums));

        //将数字放进它的位置
        nums[index] = insertNum;
        System.out.println(Arrays.toString(nums));
    }

}
