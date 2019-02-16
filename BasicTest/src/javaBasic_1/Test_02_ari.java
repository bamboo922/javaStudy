package javaBasic_1;
/*
 * 算数运算符 练习2
 */
import java.util.Scanner;

public class Test_02_ari {

	public static void main(String[] args){
		//创建一个变量名为scan的Scanner类
		//接收用户键盘输入
	   Scanner scan = new Scanner(System.in);
	   
	   System.out.println("请输入语文成绩：");
	   int chinese = scan.nextInt();
	   
	   System.out.println("请输入数学成绩：");
	   int math = scan.nextInt();
	   
	   System.out.println("请输入英语成绩：");
	   int english = scan.nextInt();
	   
	   int diffen = chinese - math;//分数差
	   System.out.println("语文与数学的分差为：" + diffen);
	   
	   double average = (chinese + math + english)/3;//平均数
	   System.out.println("平均分数为：" + average);
	 
		
	}
}
