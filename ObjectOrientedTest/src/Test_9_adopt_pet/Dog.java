package Test_9_adopt_pet;

//狗狗类
public class Dog {

    //名字
    String name;

    //健康度
    int health = 100;

    //亲密度
    int intimacy;

    //品种
    String strain;

    public void dogWord(){
        System.out.println("我的名字叫" + name +",健康值是" + health +
                ",和主人的亲密度是" + intimacy + ",我是一只" + strain);
    }
}
