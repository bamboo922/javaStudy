package Test_8_object_parameter;

/**
 * 以对象作为参数
 */
public class studentBusiness {

    //将学生类对象作为参数传入方法
    //添加学生方法
    public void addStudent(Student student){  //形参
        System.out.println("学号\t姓名\t性别\t年龄");
        System.out.println(student.No + "\t" + student.name + "\t" + student.sex + "\t" + student.age);
    }
}
