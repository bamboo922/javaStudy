package javaBasic_2;

import java.util.Scanner;

/*
 * break:
 * 改变程序控制流
 * 常用语switch结构和循环结构中
 * 作用：用于do-while、while、for中时，
 * 可跳出循环而执行循环后面的语句
 * break语句通常在循环中与条件语句一起使用
 */
public class Test_17_break {

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("输入学生姓名：");
		String name = scanner.next();
		
		int sum = 0;
		int i;
		boolean fault = false;
		for(i = 0;i < 5;i++){
			System.out.println("请输入第" + (i+1) + "门课的成绩：");
			int score = scanner.nextInt();
			
			if(score < 0 || score > 100){
				fault = true;
				System.out.println("抱歉，分数录入错误。请重新进行录入！");
				break;
			}
			sum += score;
		}
		
		if(fault == false){
			System.out.println(name + "同学的平均分是：" + sum/i);
		}
		
		
		
	}
	
}
