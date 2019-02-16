package javaBasic_2;

import java.util.Scanner;

/*
 * for循环练习
 * for循环语法:
 *    for(参数初始化;条件判断;更新循环变量){
 *    	  循环操作;
 *    }
 * 死循环写法：
 * for(int i = 0;;i++){
 * }
 */
public class Test_15_for {

	public static void main(String[] args) {
	
		int sum = 0;
		for(int i = 0;i <= 100;i++){
			sum += i;
		}
		System.out.println(sum);

		/*
		 * 练习1.循环输入某同学S1结业考试的5门课成绩，并计算平均分
		 */
		Scanner scanner = new Scanner(System.in);
//		System.out.println("输入学生姓名：");
//		String name = scanner.next();
//		
//		int newsum = 0;
//		for(int i = 0;i < 5;i++){
//			System.out.println("请输入5门功课中第" + (i+1) + "门功课的成绩：");
//			int score = scanner.nextInt();
//			newsum += score;
//		}
//		System.out.println(name + "同学的平均分是：" + newsum/5);
		
		/*
		 * 练习2：输出加法表
		 */
		System.out.println("请输入一个值：");
		int num = scanner.nextInt();
		System.out.println("根据这个值可以输出一下加法表：");
		
		//法1
		for(int i = 0; i <= num; i++){
			System.out.println(i + "+" + (num - i) + "=" + num);
		}
		
		//法2
		for(int i = 0,j = num; i <= num; i++,j--){
			System.out.println(i + "+" + j + "=" + num);
		}
		
		/*int j = 1;
		for (System.out.println('a');j < 3;System.out.println('b'),j++){
			System.out.println('c');
		}*/
		/*
		练习1.从1循环到150并在每行打印一个值，另外在每个3的倍数上
		打印出”foo“，在每个5的倍数行上打印”biz“,
		在每个7的倍数上打印输出”baz“
		*/
		/*for (int i = 1;i <= 10;i++){
			System.out.print(i + " ");
			if (i % 3 == 0){
				System.out.print("foo ");
			}
			if (i % 5 == 0){
				System.out.print("biz ");
			}
			if (i % 7 == 0){
				System.out.print("baz ");
			}
			System.out.println();
		}*/

		/*
		练习2.输出100以内所有偶数及所有偶数的和以及偶数的个数
		*/
		/*int sum = 0;//用来记录所有偶数的和
		int count = 0;//用来记录偶数的个数
		for (int a = 1;a <= 100;a++){//100以内自然数的遍历
			if (a % 2 == 0){
				System.out.println(a);
				sum += a;
				count++;
			}
		}
		System.out.println("偶数和为" + sum);
		System.out.println("偶数个数为" + count);*/

		/*
		练习3.输出所有的水仙花数，所谓水仙花数是指一个3位数，其各个位
		     上数字立方和等于其本身。
		     例如：153 = 1*1*1 + 3*3*3 + 5*5*5
		*/
//		 for (int b = 100;b < 1000;b++){//100到999的遍历
//		 	int b1 = b / 100;//百位
//		 	int b2 = (b - b1*100) / 10;//十位
//		 	int b3 = b % 10;//个位
//
//		 	if (b == b1*b1*b1 + b2*b2*b2 + b3*b3*b3){
//		 		System.out.println(b);
//		 	}
//		 }
	}

}
