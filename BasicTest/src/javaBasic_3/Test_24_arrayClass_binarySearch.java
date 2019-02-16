package javaBasic_3;

import java.util.Arrays;
import java.util.Scanner;

/*
 * binarySearch方法
 * 查询元素值val在数组array中的下标(要求数组中元素已经按升序排列)
 */
public class Test_24_arrayClass_binarySearch {

    public static void main(String[] args){

        int[] array1 = {1,6,9,3,6,13};
        Arrays.sort(array1);
        System.out.println(Arrays.toString(array1));
        Scanner scanner = new Scanner(System.in);
        System.out.print("数组元素值为：");
        int num3 = scanner.nextInt();

        //元素存在则返回下标，不存在则返回负数
        int index = Arrays.binarySearch(array1,num3);
        System.out.println("元素下标为：" + index);

    }

}
