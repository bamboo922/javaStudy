package Test_16_object_override;

import Test_15_inheritance.Dog;
import Test_15_inheritance.Penguin;

/**
 * Object类
 * Object类被子类经常重写的方法：
 *     toString() 返回当前对象本身的有关信息，按字符串对象返回
 *     equals() 比较两个对象是否是同一个对象，是则返回true
 *     hashCode() 返回该对象的哈希代码值
 *     getClass() 获取当前对象所属的类信息，返回Class对象
 */

//所有的类隐示地继承Object类
public class objectTest {

    public static void main(String[] args){
        Dog dog1 = new Dog("欧欧",99);
        Dog dog2 = new Dog("乐乐",99);

        dog1.setStrain("拉布拉多");
        System.out.println(dog1.equals(dog2));
        System.out.println(dog1.toString());
        System.out.println(dog1);//直接打印对象 隐式地调用toString()方法

    }

}
