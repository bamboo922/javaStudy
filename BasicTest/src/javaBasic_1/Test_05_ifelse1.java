package javaBasic_1;
import java.util.*;
/*
 * if..else 语句练习1
 */
public class Test_05_ifelse1 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("请输入xxx的成绩：");
		int score = scan.nextInt();
		
		if (score > 90){
			System.out.println("奖励一台iphone!");
		}
		System.out.println("over");
	
	}

}
