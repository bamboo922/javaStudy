package javaBasic_3;

import java.util.Arrays;

/*
 * equals方法
 * 比较两个数组(比较的依据：类型 长度 元素的值/顺序)
 *
 * toString方法
 * 将数组转换为字符串的形式
 */

public class Test_22_arrayClass_equals {

    public static void main(String[] args){

        int[] num1 = {12,45,23,98,04};
        int[] num2 = {12,45,23,98,04};

        num2[0] = 0;

        boolean b = Arrays.equals(num1,num2);

        System.out.println("\n" + b);

        int[] array = {1,2,3,4,5};
        String num = Arrays.toString(array);
        System.out.print(num);

    }

}
