package Test_3_collection.arraylist;

import java.util.ArrayList;
import java.util.List;

/**
 * List接口的常用方法(也是ArrayList的常用方法)
 * add() 添加元素
 *       向集合中指定位置添加元素，位置不能超过集合的长度
 * size() 获取集合长度
 * get() 获取对应位置的元素
 * contains() 判断集合中是否包含指定元素
 * remove(int index) 从集合中删除指定下标的元素，返回被删除的元素
 * remove(Object O) 从集合中移除指定元素 只移除第一次出现的这个元素 返回true/false(是否移除)
 *
 * 泛型
 * 可指定集合存储类型 写在集合后面 用<>括起来 如List<String> 则List存储类型为String
 * 泛型不能用基本数据类型 要用包装类型(与基本数据类型对应)
 * 泛型可用自定义类型
 *
 * 基本数据类型 包装类型
 * int        Integer
 * byte       Byte
 * short      Short
 * long       Long
 * char       Character
 * boolean    Boolean
 * float      Float
 * double     Double
 */

public class dogTest {

    public static void main(String[] args){

        List<Dog> dogList  = new ArrayList<Dog>();

        Dog ouOu = new Dog("欧欧","雪纳瑞");
        Dog yaYa = new Dog("亚亚","拉布拉多");
        Dog feiFei = new Dog("菲菲","拉布拉多");
        Dog meiMei = new Dog("美美","雪纳瑞");

        dogList.add(ouOu);
        dogList.add(yaYa);
        dogList.add(feiFei);
        dogList.add(meiMei);

        System.out.println("共有" + dogList.size() + "条狗狗。");
        System.out.println("分别是：");
        for(int i = 0;i < dogList.size();i++){
            Dog dog = dogList.get(i);
            System.out.println(dog.getName() + "\t\t" + dog.getStrain());
        }

        //System.out.println(dogList);
        System.out.println("删除之前共计有" + dogList.size() +"条狗狗。");

        dogList.remove(0);
        dogList.remove(1);
        System.out.println("删除之后还有" + dogList.size() +"条狗狗。");
        System.out.println("分别是：");
        for(int i = 0;i < dogList.size();i++){
            Dog dog = dogList.get(i);
            System.out.println(dog.getName() + "\t\t" + dog.getStrain());
        }

    }
}
