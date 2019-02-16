package javaBasic_1;
/*
 * 赋值运算符
 * 算数运算符的使用
 */
public class Test_01_ari {
	public static void main(String[] args){
		
		int score1 = 80;
		int score2;
		score2 = score1;
		System.out.println("xxx的成绩是：" + score2);
		//int score2 = score1;
		
		//自增自减
		int a = 3;
		int a1 = a++;//后++:先做运算，后自增1 (a先赋值给a1 再+1)
		             //a1 = a; a = a + 1
		System.out.println(a);
		System.out.println(a1);

		int b = 3;
		int b1 = ++b;//前++:先自增1，后做运算 (b先+1 再赋值给b1)
		             //b = b + 1; b1 = b
		System.out.println(b);
		System.out.println(b1);

		//取模
		int c = 15;
		System.out.println(c % 6);//取12除以5的余数 
	}
}
