package Test_13_this;

/**
 * this关键字
 * 调用属性
 * 调用方法
 * 调用构造方法(如果使用，必须是构造方法中的第一条语句)
 *
 */
public class This {

    String name;
    String strain;

    public This(){
        this("王可可","二哈");
        this.print();

    }
    public This(String name, String strain){
        this.name = name;
        this.strain = strain;
    }

    public void print(){
        System.out.println("姓名：" + name + "\t品种：" + strain);

    }
}
