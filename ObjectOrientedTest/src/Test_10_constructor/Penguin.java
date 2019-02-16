package Test_10_constructor;

/**
 * 构造方法重载
 * 自定义构造方法时 系统不再提供默认无参构造方法
 *
 * 在一个类中 构造方法名相同 叫做构造方法重载
 *
 * 方法重载的条件：
 * 在一个类里 方法名相同
 * 参数数据类型或参数个数不同
 * 与返回值、访问修饰符无关
 */
public class Penguin {

    //名字
    String name;

    //健康度
    int health = 100;

    //亲密度
    int intimacy;

    //性别
    String sex;

    //带参构造方法
    public Penguin(String penguinName, String penguinSex){
        this.name = penguinName;
        this.sex = penguinSex;
    }

    //构造方法重载
    public Penguin(){}

    public void penguinWord(){
        System.out.println("我的名字叫" + name +",健康值是" + health +
                ",和主人的亲密度是" + intimacy + ",我的性别是" + sex);
    }

}
