package javaBasic_3;

/*
 * 输出数组中的最大值
 */
public class Test_25_maximun {

    public static void main(String[] args){

        int[] numArray = {15,34,39,90,67,56,72,84};

        int max = numArray[0];
        for (int i = 0; i < numArray.length - 1; i++){
            if(numArray[i + 1] > max){
                max = numArray[i + 1];
            }
        }

        System.out.println("最大值为：" + max);

    }

}
