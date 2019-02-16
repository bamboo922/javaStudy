package javaBasic_2;

import java.util.Scanner;

/*
 * 数组Array 练习
 * 数组是一个变量，存储相同数据类型的一组数据
 * 声明一个变量就是在内存空间划出一块合适的空间
 * 声明一个数组就是在内存空间划出一串连续的空间
 * 
 * 数组基本要素：
 *   标识符：数组的名称，用于区分不同的数组
 *   数组元素：向数组元素进行编号，从0开始，数组中的每个元素都可以通过下标来访问
 *   元素类型：数组元素的数据类型
 * 声明数组并分配空间：
 *   数据类型[] 数组名 = new 数据类型[大小];
 *   int[] a = new a[5];
 * 数组赋值：
 *   方法1：边声明边赋值
 *   int[] a = { 10，20 };
 *   int[] a2 = new int[] { 10, 20 };
 *   方法2：动态地从键盘录入信息并赋值
 */
public class Test_20_array {

	public static void main(String[] args) {
		
		int[] scores = new int[5];
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("请输入5个学生的java成绩：");
		
		for(int i = 0; i < 5; i++){
			System.out.println("请输入第"+ (i+1) +"个学生的成绩：");
			scores[i] = scanner.nextInt(); 
		}
		
		double sum = 0;
		for(int i = 0; i < scores.length; i++){
			//sum += scores[i];
			sum = sum + scores[i];
		}
		
		System.out.println("平均分为：" + sum/5);
	}
}
