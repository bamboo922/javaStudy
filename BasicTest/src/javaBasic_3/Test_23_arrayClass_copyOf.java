package javaBasic_3;

import java.util.Arrays;

/*
 * copyOf方法
 * 把数组array复制成一个长度为length的新数组，返回类型与复制的数组一致
 * 8种数据类型所对应的数组默认值都是0(bool类型为false)
 */
public class Test_23_arrayClass_copyOf {

    public static void main(String[] args){


        int[] newNums = {1,6,7,9,8};
        System.out.println("\n" + Arrays.toString(newNums));

        //newLength为新数组的长度 可多 可少
        newNums = Arrays.copyOf(newNums,newNums.length+1);
        System.out.println(Arrays.toString(newNums));

        newNums = Arrays.copyOf(newNums,4);
        System.out.println(Arrays.toString(newNums));

    }

}
