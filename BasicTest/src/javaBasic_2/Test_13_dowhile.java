package javaBasic_2;

import java.util.Scanner;

/*
 * do...while循环结构
 * 先执行循环操作 再判断执行条件 
 * 
 * do...while 与 while 的区别
 * 1 语法不同
 * 2 执行顺序不同
 * 3 初始情况不满足条件时
 *    while循环一次都不会执行
 *    do...while循环 不管任何情况都至少执行一次
 */

public class Test_13_dowhile {
	
	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		String answer;
		do{
			System.out.println("学习是否合格？(y/n)");
			answer = scanner.next();
			
		}while(!"y".equals(answer));
		
		System.out.println("结束");
		
		int item = 0;
		int temperature = 0;
		int fahrenheit;
		
		do{
			fahrenheit = (int) (temperature * 9 /5.0 + 32);
			System.out.println("温室温度：" + temperature + ";华氏温度：" + fahrenheit);
			item++;
			temperature += 20;
		}while(item <= 10 && temperature <= 250);
		
		
	}

}
