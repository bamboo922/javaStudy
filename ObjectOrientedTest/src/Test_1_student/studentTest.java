package Test_1_student;

/**
 * 对象：
 * 对象同时具有属性和方法两项特性
 * 例如把投影仪当做一个对象 它的属性是：大小 形状 颜色等等
 *                     它的方法是：能投影
 * 对象的属性和方法通常被封装在一起，共同体现事物的特性，二者相辅相承，不能分割
 *
 * 类：
 * 类是模子 定义对象将会拥有的特征(属性)和行为(方法)
 *
 * 类和对象的关系
 * 类是抽象的概念 仅仅是模板 不如说人
 * 对象是一个你能够看得到、摸得着的具体实体
 *
 * 创建对象
 * 类名 对象名 = new 类名();
 */
public class studentTest {

    public static void main(String[] args){

        //创建对象实例
        Student student = new Student();

        //给对象属性赋值
        student.name = "chen";
        student.age = 22;
        student.sex = "女";
        student.grade = "3年2班";

        //调用对象方法
        student.show();

    }

}
