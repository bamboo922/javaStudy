package Test_11_static;

/**
 * static 关键字
 * 可修饰 属性(变量) 方法 代码块
 * 可用类名直接调用
 *
 * static属性(变量)：归类所有 是所有对象共有的
 * static方法：只能访问static属性(变量)
 * static代码块：对象初始化
 *
 * 非静态变量归对象所有
 */
public class Static {

    //final关键字表示定义常量
    //常量名字全部大写
    static final String SEX_MALE = "男";
    static final String SEX_FEMALE = "女";
    static int number;
    String common;

    public void numberPrint(){
        System.out.println("非static方法" + number);

    }

    //static方法访问static变量
    public static void print(){
        System.out.println("static方法" + number);
    }

    public Static(){
        System.out.println("构造方法");
    }

    //先于构造方法初始化 在类加载时执行
    static{
        System.out.println("static块");
    }
}
