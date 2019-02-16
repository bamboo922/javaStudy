package javaBasic_1;

import java.util.Scanner;

/*
 * 逻辑运算符 练习
 * 连接两个条件的符号
 * && 与 两个条件都为真 则为真
 * || 或 两个条件有一个为真 则为真
 * ! 非  条件为真 则结果为假；条件为假 则结果为真
 */
public class Test_06_logic {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入java成绩：");
		int java = scanner.nextInt();
		System.out.println("请输入music成绩：");
		int music = scanner.nextInt();
		
		if((java > 98 && music > 80) || (java == 100 && music > 70)){
			System.out.println("奖励一个iphone!");
		}
		else{
			System.out.println("罚写代码1万行！");
		}
		System.out.println("over");
		

	}

}
