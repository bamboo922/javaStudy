package javaBasic_2;

import java.util.Scanner;

public class Test_16_for2 {

	public static void main(String args[]){
		
		System.out.println("欢迎使用Myshopping管理系统");
		
		System.out.println("*************************");
		
		System.out.println("1.客户信息管理");
		System.out.println("2.购物结算");
		System.out.println("3.真情回馈");
		System.out.println("4.注销");
		
		System.out.println("请选择，输入数字：");
		Scanner scanner = new Scanner(System.in);
		//int number = scanner.nextInt();
		int number;
		//while循环方法
//		while(number > 4 || number < 1){
//			System.out.println("输入错误，请重新输入数字：");
//			number = scanner.nextInt();
//		}
//		System.out.println("执行" + number);
		
		//for循环方法
//		for(int i = 0;number > 4 || number < 1;i++){
//			System.out.println("输入错误，请重新输入数字：");
//			number = scanner.nextInt();
//		}
		
		for(number = scanner.nextInt();number > 4 || number < 1;System.out.println("输入错误，请重新输入数字："),
			number = scanner.nextInt()){
			
		}
		System.out.println("执行" + number);
		
	}
	
}
