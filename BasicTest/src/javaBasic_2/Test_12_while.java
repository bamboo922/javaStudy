package javaBasic_2;

/*
 * while循环结构
 * 先判断执行条件 再执行循环操作
 */

import java.util.Scanner;

public class Test_12_while {
	
	public static void main(String[] args){
		
//		int i = 0;
//		while (i<100) {
//			i++;
//			System.out.println("第" + i + "遍：好好学习，天天向上");
//		}
		
//		Scanner scanner = new Scanner(System.in);
//		System.out.println("学习是否合格？(y/n)");
//		String answer = scanner.next();
//		
//		while(!"y".equals(answer)){
//			System.out.println("继续学习");
//			System.out.println("学习是否合格？(y/n)");
//			answer = scanner.next();
//		}
		
		int year = 2012;
		int people = 250000;
		
		while(people < 1000000){
			year++;
			people = (int) (people*1.25);
		}
		System.out.println(year);
		
	}

}
