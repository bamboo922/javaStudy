package javaBasic_1;

import java.util.Scanner;
/*
 * equals 用于字符串的等值判断
 */

public class Test_09_ifelse4 {

	public static void main(String[] args){
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入成绩：");
		int score = scanner.nextInt();
		
		if(score < 10){
			
	    	System.out.println("请输入性别：");
			String gender = scanner.next();
			
			if(gender.equals("男")){
				System.out.println("进入男子组决赛");
			}
			else if(gender.equals("女")){
				System.out.println("进入女子组决赛");
			}
			
		}
		else{	
			System.out.println("淘汰");
		}
		
	}
}
