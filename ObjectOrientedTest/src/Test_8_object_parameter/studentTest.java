package Test_8_object_parameter;

import java.util.Scanner;

//测试类
public class studentTest {

    public static void main(String[] args){

        //创建StudentBusiness类对象
        studentBusiness studentBusiness = new studentBusiness();

        //创建Student类对象
        Student stu = new Student();

        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入学号：");
        stu.No = scanner.nextInt();

        System.out.print("请输入姓名：");
        stu.name = scanner.next();

        System.out.print("请输入性别：");
        stu.sex = scanner.next();

        System.out.print("请输入年龄：");
        stu.age = scanner.nextInt();

        //调用添加学生方法
        studentBusiness.addStudent(stu);//实参

    }
}
