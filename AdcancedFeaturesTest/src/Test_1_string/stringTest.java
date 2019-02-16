package Test_1_string;

import java.util.Arrays;
import java.util.Scanner;

/**
 * String类 字符串处理常用方法
 * length() 获取字符串长度
 * equals() 比较两个字符串
 * equalsIgnoreCase() 比较两个字符串 忽略大小写
 * toLowerCase() 将大写字符转化成小写
 * toUpperCase() 将小写字符转化成大写
 * concat() 拼接字符串
 * indexOf(int ch)/indexOf(String value)
 * 搜索第一个出现的字符ch或者字符串value 如果没有找到 返回-1
 * lastIndexOf(int ch)/lastIndexOf(String value)
 * 搜索最后一个出现的字符ch或者字符串value 如果没有找到 返回-1
 * substring(int index) 提取从位置索引开始的字符串部分
 * substring(int beginindex,int endindex) 提取两个索引号之间的字符串部分
 * trim() 返回一个前后不含任何空格的调用字符串的副本
 * split() 将一个字符串分割为子字符串，结果作为字符串数组返回
 */
public class stringTest {

    public static void main(String[] args){
        new stringTest().toggleString();
        new stringTest().jointString();
        new stringTest().findString();
        new stringTest().splitString();
        new stringTest().deleteSpaces();
        new stringTest().Method1();
        new stringTest().Method2();
    }

    //字符串长度、比较以及大小写转换
    public void toggleString(){
        String string = "Hello";
        System.out.println("string的长度为：" + string.length());
        System.out.println(string.equals("hello"));
        System.out.println(string.equalsIgnoreCase("hello"));
        System.out.println(string.toLowerCase());
        System.out.println(string.toUpperCase());
    }

    //字符串拼接
    public void jointString(){
        String string = "hello";
        System.out.println(string.concat(" world"));
    }

    //字符串查找与截取
    public void findString(){
        String string = "substring";
        System.out.println(string.indexOf('t'));
        System.out.println(string.indexOf("string"));
        System.out.println(string.indexOf("ab"));
        System.out.println(string.substring(6,8));
    }

    //字符串分割成字符数组
    public void splitString(){
        String string = "helloworld";
        String[] stringArray = string.split("o");
        System.out.println(Arrays.toString(stringArray));
    }

    //去掉空格
    public void deleteSpaces(){
        String string = "   hello   ";
        System.out.println(string.trim());
    }

    /*
    输入一个字符串，再输入要查找的字符，判断该字符在字符串中出现的次数
     */
    public void Method1(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String string = scanner.next();

        System.out.println("请输入要查找的字符：");
        char seek = scanner.next().charAt(0);

        int seekNum = 0;

        do{
            int index = string.indexOf(seek);
            if(index == -1){
                break;
            }
            seekNum++;
            string = string.substring(index + 1);

        }while (true);

        System.out.println(seekNum);
    }

    public void Method2(){
        Scanner scanner = new Scanner(System.in);

        System.out.println("请输入一个字符串：");
        String string = scanner.next();

        System.out.println("请输入要查找的字符：");
        char seek = scanner.next().charAt(0);

        char stringArray[] = string.toCharArray();

        int seekNum = 0;
        for(int i = 0;i < stringArray.length;i++){
            if(stringArray[i] == seek){
                seekNum++;
            }
        }
        System.out.println(seekNum);
    }

}