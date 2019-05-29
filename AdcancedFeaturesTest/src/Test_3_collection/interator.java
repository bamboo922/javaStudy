package Test_3_collection;

import java.util.*;

public class interator {

    public static void main(String[] args){

        List<String> list = new ArrayList<>();
        list.add("张三");
        list.add("李四");
        list.add("王五");
        list.add("赵六");

        //迭代器
        Iterator<String> iterator = list.iterator();

        //判断是否有下一项
//        boolean hasNext = iterator.hasNext();
//        System.out.println(hasNext);
//
//        String next = iterator.next();

        while(iterator.hasNext()){
            String string = iterator.next();
            System.out.println(string);
        }
    }
}
