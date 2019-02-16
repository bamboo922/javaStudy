package Test_2_stringbuffer;

import java.util.Scanner;

/*
 编写一个方法，实现将一个数字字符串转换成逗号分隔的数字串，即从右边开始每三个字符用逗号分隔
 */
public class insertTest {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入一串数字：");
        String numberString = scanner.next();

        StringBuffer newString = new StringBuffer(numberString);
        for(int i = numberString.length() - 3;i > 0;i = i - 3){
            newString.insert(i,",");
        }
        System.out.println(newString);


    }
}
