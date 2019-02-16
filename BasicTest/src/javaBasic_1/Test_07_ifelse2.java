package javaBasic_1;
import java.util.Scanner;

/*
 * if..else 语句练习2
 * 幸运抽奖
 */

public class Test_07_ifelse2 {

	public static void main(String[] args){
		
		//得到0-9的随机数
		int random = (int)(Math.random()*10);
		System.out.println(random);
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入4位会员数：");
		int vipNumber = scanner.nextInt();
		
		int baiwei = vipNumber%1000/100;
		
		if(baiwei == random){
			System.out.println(vipNumber + "号用户是幸运用户，获精美mp3一个!");
		}
		else{
			System.out.println(vipNumber + "号用户，谢谢您的支持!");
		}

	}
}
