package javaBasic_3;

import java.util.Scanner;

/*
 * 二维数组
 * 语法：数据类型[][] 数组名;
 *      数据类型 数组名[][];
 *
 */
public class Test_30_dyadicArray {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        int[][] seat = new int[5][10];

        for(int i = 0; i < seat[0].length; i++){
            System.out.print("\t  " + "第"+(i+1)+"列");
        }

        System.out.println();

        for (int i = 0; i < seat.length; i++){
            System.out.print("第"+(i+1)+"行");
            for(int j = 0; j < seat[i].length; j++){
                if(seat[i][j] == 0){
                    System.out.print("  可售\t");
                }
                else{
                    System.out.print("  已售\t");
                }
            }
            System.out.println();
        }

        System.out.print("请选择行：");
        int row = scanner.nextInt();
        System.out.print("请选择列：");
        int col = scanner.nextInt();

        seat[row - 1][col - 1] = 1;

        for(int i = 0; i < seat[0].length; i++){
            System.out.print("\t  " + "第"+(i+1)+"列");
        }

        System.out.println();

        for (int i = 0; i < seat.length; i++){
            System.out.print("第"+(i+1)+"行");
            for(int j = 0; j < seat[i].length; j++){
                if(seat[i][j] == 0){
                    System.out.print("  可售\t");
                }
                else{
                    System.out.print("  已售\t");
                }
            }
            System.out.println();
        }

    }

}
