package javaBasic_2;

import java.util.Scanner;

/*
 * continue:
 * 只能用在循环里
 * 作用：跳过循环体中剩余的语句而执行下一次循环
 * 通常与条件语句一起使用，加速循环
 */
public class Test_18_continue {

	public static void main(String args[]){
		
		Scanner scanner = new Scanner(System.in);
		
//		double num = 0;
//		for(int i = 0;i < 5;i++){
//			System.out.print("请输入第" + (i+1) + "位学生的成绩：");
//			int score = scanner.nextInt();
//			
//			if(score > 80 && score < 100){
//				num++;
//			}
//		}
//		System.out.println("80分以上的学生人数是：" + (int)num);
//		System.out.println("80分以上的学生所在比例是：" + (double)(num/5) * 100 + "%");
		
		double num = 0;
		for(int i = 0;i < 5;i++){
			System.out.print("请输入第" + (i+1) + "位学生的成绩：");
			int score = scanner.nextInt();
			
			if(score < 80){
				continue;
			}
			num++;
		}
		System.out.println("80分以上的学生人数是：" + (int)num);
		System.out.println("80分以上的学生所在比例是：" + (double)(num/5) * 100 + "%");
		
	}
	
}
