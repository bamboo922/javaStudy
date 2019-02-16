package javaBasic_1;
/*
 * switch 语句练习
 * switch语句不会在执行判断为真后的语句之后跳出循环，而是继续执行后面所有case语句。
 * 每个case的常量都不同
 * case块的数量不限，可以是0个
 * default块最多1个
 * break表示跳出switch
 */
import java.util.Scanner;
public class Test_10_switch {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		System.out.println("请输入名次：");
		int rank = scanner.nextInt();
		
	    switch(rank){
	    	case 1:
	    		System.out.println("可参加麻省理工大学组织的1个月夏令营");
	    		break;
	    		
	    	case 2:
	    		System.out.println("奖励惠普笔记本一部");
	    		break;
	    		
	    	case 3:
	    		System.out.println("奖励移动硬盘一个");
	    		break;
	    		
	    	default:
	    		System.out.println("不给任何奖励");
	    		break;
	    }
	      	
	}

}
