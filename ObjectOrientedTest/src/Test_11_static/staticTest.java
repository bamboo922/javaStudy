package Test_11_static;

public class staticTest {

    public static void main(String[] args){

        Static s1 = new Static();

        //static变量是所有对象共有的
        Static.number++;//1
        s1.numberPrint();

        Static s2 = new Static();
        Static.number++;//2
        s2.print();

        //static属性可用类名直接访问
        System.out.println(Static.SEX_MALE);
        System.out.println(Static.SEX_FEMALE);
    }
}
