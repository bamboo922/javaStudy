package javaBasic_1;

import java.util.Scanner;

/*
 * 多重if 练习
 * 
 */

public class Test_08_ifelse3 {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		//System.out.println("请输入成绩：");
		
		//int score = scanner.nextInt();
		
		//从高到低判断
//		if(score >= 80){
//			System.out.println("优秀");
//		}
//		else if(score >= 60){
//			System.out.println("及格");
//		}
//		else{
//			System.out.println("不及格");
//		}
		
		//从低到高判断
//		if(score < 60){
//			System.out.println("不及格");
//		}
//		else if(score < 80){
//			System.out.println("及格");
//		}
//		else{
//			System.out.println("优秀");
//		}
		
		System.out.println("请输入存款金额：");
		int account = scanner.nextInt();
		
		if(account >= 500){
			System.out.println("买凯迪拉克");
		}
		else if(account >= 100){
			System.out.println("买帕萨特");
		}
		else if(account >= 50){
			System.out.println("买伊兰特");
		}
		else if(account >= 10){
			System.out.println("买奥拓");
		}
		else{
			System.out.println("买捷安特");
		}
	
	}
}
