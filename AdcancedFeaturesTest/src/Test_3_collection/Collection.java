package Test_3_collection;

import java.util.ArrayList;
import java.util.List;

/**
 * Java集合框架
 * 如果并不知道程序运行时会需要多少对象，或者需要更复杂方式存储对象———可以使用Java集合框架
 * Java集合框架提供了一套性能优良、使用方便的接口和类，它们位于java.util包中
 * 集合框架包含三大块内容：对外的接口、接口的实现和对集合运算的算法
 * Collection接口包括List、Set
 * Collection接口存储一组不唯一、无序的对象
 * List接口存储一组不唯一、有序(插入顺序)的对象
 * Set接口存储一组唯一、无序的对象
 * Map接口存储一组键值对象，提供key到value的映射
 *
 * List接口的实现类有：ArrayList、LinkedList
 * ArrayList实现了长度可变的数组，在内存中分配连续的空间。遍历元素和随机访问元素的效率比较高
 * LinkedList采用链表存储方式。插入、删除元素使效率比较高
 */
public class Collection {

    public static void main(String[] args){

        List<String> list = new ArrayList<String>();
        list.add("a");
        System.out.println(list);
        list.get(0);

        list.add("b");
        list.add("c");
        list.add("d");
        list.add("e");
        list.add("f");

        int size = list.size();
        System.out.println(size);

        //遍历集合
        for(int i = 0;i < list.size();i++){
            System.out.println(list.get(i));
        }

        boolean contain = list.contains("c");
        System.out.println(contain);
        boolean remove = list.remove("a");
        String remove1 = list.remove(5);
        System.out.println(remove);
    }
}
