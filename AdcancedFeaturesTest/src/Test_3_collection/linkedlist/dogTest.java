package Test_3_collection.linkedlist;

import java.util.LinkedList;
import Test_3_collection.arraylist.Dog;

/**
 * LinkedList的特殊方法
 * addFirst() 在列表的首部添加元素
 * addLast() 在列表的末尾添加元素
 * getFirst() 返回列表中的第一个元素
 * getLast() 返回列表总的最后一个元素
 * removeFirst() 删除并返回列表中的第一个元素
 * removeLast() 删除并返回列表中的最后一个元素
 */
public class dogTest {

    public static void main(String[] args){

        LinkedList<Dog> dogList = new LinkedList<Dog>();

        Dog ouOu = new Dog("欧欧","雪纳瑞");
        Dog yaYa = new Dog("亚亚","拉布拉多");
        Dog feiFei = new Dog("菲菲","拉布拉多");
        Dog meiMei = new Dog("美美","雪纳瑞");

        dogList.addFirst(feiFei);
        dogList.add(ouOu);
        dogList.add(yaYa);
        dogList.addLast(meiMei);

        Dog firstDog = dogList.getFirst();
        Dog lastDog = dogList.getLast();

        System.out.println("第一条狗狗的昵称是" + firstDog.getName());
        System.out.println("最后一条狗狗的昵称是" + lastDog.getName());

        dogList.removeFirst();
        dogList.removeLast();

        System.out.println("删除部分狗狗后还有" + dogList.size() + "条狗狗");
        System.out.println("分别是：");
        for(int i = 0;i < dogList.size();i++){
            Dog dog = dogList.get(i);
            System.out.println(dog.getName() + "\t" + dog.getStrain());
        }

    }

}
