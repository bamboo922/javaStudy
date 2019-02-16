package javaBasic_3;
/*
 * 二维数组练习： 杨辉三角
 */
public class TestArrayYangHui {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[][] yanghui = new int[10][];
		//初始化二维数组
		for(int i = 0;i < yanghui.length;i++){
			yanghui[i] = new int[i + 1];
		}
		
		//显示的为二维数组的每个元素赋值
		for(int i = 0;i < yanghui.length;i++){
			for(int j = 0;j < yanghui.length;j++){
				yanghui[i][0] = yanghui[i][i] = 1;
				if(i > 1 && j > 0 && j < i){
					yanghui[i][j] = yanghui[i-1][j] + yanghui[i-1][j-1];
				}
			}
		}
		
		//遍历二维数组
		for(int i = 0;i < yanghui.length;i++){
			for(int j = 0;j < yanghui[i].length;j++){
				System.out.print(yanghui[i][j] + "\t");
			}
			System.out.println();
		}
	}
}
