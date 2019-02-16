package Test_1_student;

/**
 * 声明一个学生类
 */
public class Student {

    //定义类的属性 属性可以不用初始化 系统会自动地初始化
    //基本数据类型自动初始化都是0的形式
    //引用数据类型都是null
    String name;
    String sex;
    int age;
    String grade;

    public void show(){

        System.out.println("大家好，我是" + grade + "的" + name + "，我的性别是" + sex +
        "，今年" + age + "岁");

    }

}
