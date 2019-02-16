package Test_2_stringbuffer;

/**
 * StringBuffer类是用于处理字符串的一个类，而且它是比String类更高效地存储字符串的一种引用数据类型
 *
 * StringBuffer类常用方法
 * toString() 转换为String类型并返回
 * append() 追加字符串
 * insert() 插入字符串
 *
 * StringBuilder类 与StringBuffer等价
 * 但StringBuilder类是单线程的，理论上效率更高
 */
public class Demo1 {

    public static void main(String[] args){
        StringBuffer stringBuffer = new StringBuffer("abc");
        stringBuffer.append("1");
        stringBuffer.insert(5,"e");

        System.out.println(stringBuffer);
    }
}
