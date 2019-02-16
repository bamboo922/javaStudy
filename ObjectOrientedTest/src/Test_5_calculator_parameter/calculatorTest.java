package Test_5_calculator_parameter;

/**
 * 变量的作用域
 * 成员变量与局部变量的区别
 * 作用域不同：局部变量的作用域仅限于定义它的方法
 *           成员变量的作用域在整个类内部都是可见的
 * 初始值不同：Java会给成员变量一个初始值
 *          Java不会给局部变量赋予初始值
 * 在同一个方法中 不允许有同名局部变量 在不同的方法中 可以有同名局部变量
 * 在同一个类中 成员变量和局部变量同名时 局部变量具有更高的优先级
 */

public class calculatorTest {

    public static void main(String[] args){

        Calcalutor calcalutor = new Calcalutor();
        int a = 13;
        int b = 14;

        double result = calcalutor.plus(a,b);
        System.out.print(result);

    }

}
