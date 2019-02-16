package Test_10_constructor;

/**
 * 构造方法
 * 方法名与类名相同
 * 没有返回值
 * 作用：对象初始化
 *
 * 创建类型对象 就是在调用构造方法
 */
public class Dog {

    //名字
    String name;

    //健康度
    int health = 100;

    //亲密度
    int intimacy;

    //品种
    String strain;

    //无参
    public Dog(){}

    //带参
    public Dog(String dogName, String dogStrain){
        this.name = dogName;
        this.strain = dogStrain;
    }

    public void dogWord(){
        System.out.println("我的名字叫" + name +",健康值是" + health +
                ",和主人的亲密度是" + intimacy + ",我是一只" + strain);
    }
}
