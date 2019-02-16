package Test_24_exception;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Java的异常处理是通过5个关键字来实现的：try、catch、finally、
 * throw、throws
 * try 执行可能产生异常的代码
 * catch 捕获异常
 * finally 无论是否发生异常 代码总能执行
 * throws 声明方法可能要抛出的各种异常
 * throw 手动抛出异常
 */

/**
 * 通过try-catch块捕获异常 分为三种情况：
 * 1.正常 若try中代码运行正常 则跳过catch块 继续运行后面的代码
 * 2.出现异常
 *    若try中代码出现异常 则会抛出异常对象
 *    该对象会被catch捕获
 *    匹配异常类型 进入对应的catch块
 *    运行catch块中处理该异常的代码
 *    再继续运行后面的代码
 * 3.异常类型不匹配
 *   常见异常类型
 *   Exception 异常层次结构的父类
 *   ArithmeticException 算数错误情形，如以0作除数
 *   ArrayIndexOutOfBoundsException 数组下标越界
 *   NullPointerException 尝试访问null对象成员
 *   IllegalArgumentException 方法接收到非法参数
 *   ClassCastException 对象强制类型转换出错
 *   NumberFormatException 数字格式转换异常，如把"abc"转换成数字
 *
 * 当catch块为多个 异常类型有继承关系时 catch块要从小到大排列(先子类后父类)
 */

/**
 * try-catch-finally
 * 不管程序是否有异常 finally块始终都会执行
 * 不执行的唯一情况：catch块中程序中断 退出Java虚拟机 System.exit(0);
 */
public class Demo1 {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("被除数：");
            int number1 = scanner.nextInt();

            System.out.print("除数：");
            int number2 = scanner.nextInt();

            System.out.println("结果为：" + number1 / number2);

        } catch (ArithmeticException e){//声明一个异常类Exception
            //e.printStackTrace();//打印异常的堆栈信息
            //System.out.println(e.getMessage());//获取异常信息
            System.out.println("除数不能为0");

        } catch (InputMismatchException e){ //输入错误异常
            System.out.println("只能输入数字");
            System.exit(0);

        } catch (Exception e){
            System.out.println("未知错误");

        } finally {
            System.out.println("程序结束");
        }

    }
}
