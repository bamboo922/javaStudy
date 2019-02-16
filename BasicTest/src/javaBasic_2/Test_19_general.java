package javaBasic_2;

/*
 * 求1-10之间的所有的偶数和
 */
public class Test_19_general {

	public static void main(String args[]){
		
		int sum = 0;
		for(int i = 1;i <= 10;i++){
			if(i % 2 == 1){
				continue;
			}
			sum += i;
		}
		
		System.out.println("偶数和为：" + sum);
		
	}
	
}
