package javaBasic_1;
/*
 * 数据类型转换 练习
 * 
 * 自动类型转换条件
 *   1.两种类型要兼容 数据类型(整型和浮点型)互相兼容
 *   2.目标类型大于原类型 例如: double型大于int型
 * 强制类型转换
 *   (类型名)表达式
 * 
 * 
 */
public class Test_03_trans {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		double first = 81.29;
		double second;
		int rise = 2;
		
		//运算的时候要相同的数据类型
		//所有的操作数的类型会自动转为操作数中精度最高的类型
		second = first + rise;//int会自动转为double
		//       double   int  
		System.out.println(second);
		
		char xinhao = '*';
		char space = '\t';
		char jiahao = '+';
		char jianhao = '-';
		char chuhao = '/';

		String chenghao1 = "*";
		String zifuchuan = "\t";
		String chuhao2 = "/";

		System.out.println((int)xinhao);
		System.out.println((int)space);
		System.out.println((int)jianhao);
		System.out.println((int)chuhao);

		System.out.println(chenghao1 + zifuchuan + chuhao2);
	}

}
