package javaBasic_1;

/*
 * 关系运算符 练习
 * boolean类型 ture false
 */
import java.util.Scanner;

public class Test_04_relate {

	public static void main(String[] args){
		
		int score = 80;
		
		Scanner scan = new Scanner(System.in);
		System.out.println("请输入xxx的成绩是：");
		int score1 = scan.nextInt();
		
		boolean bigger = score > score1;
		
		System.out.println("score大于score1吗：" + bigger);
		
	}
}
