package javaBasic_3;

import java.util.Scanner;

public class Test_29_saleTicket {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        int[] status = new int[50];

        System.out.println("***************************************屏幕" +
                "*******************************************");

        for(int i = 0; i < 10; i++){
            System.out.print("\t  "+"第"+(i+1)+"列");
        }

        System.out.println();

        for(int i = 0; i < status.length; i++){
            int row = i / 10 + 1;
            if(i % 10 == 0){
                System.out.print("第"+row+"行");
            }

            if(status[i] == 0){
                System.out.print("  可售\t");
            }
            else{
                System.out.print("  已售\t");
            }

            if(i % 10 == 9){
                System.out.println();
            }
        }

        System.out.print("请选择行：");
        int row = scanner.nextInt();
        System.out.print("请选择列：");
        int col = scanner.nextInt();

        int index = (row - 1) * 10 + (col - 1);
        status[index] = 1;

        System.out.println("***************************************屏幕" +
                "*******************************************");

        for(int i = 0; i < 10; i++){
            System.out.print("\t  "+"第"+(i+1)+"列");
        }

        System.out.println();

        for(int i = 0; i < status.length; i++){
            int r = i / 10 + 1;
            if(i % 10 == 0){
                System.out.print("第"+r+"行");
            }

            if(status[i] == 0){
                System.out.print("  可售\t");
            }
            else{
                System.out.print("  已售\t");
            }

            if(i % 10 == 9){
                System.out.println();
            }
        }
    }

}
