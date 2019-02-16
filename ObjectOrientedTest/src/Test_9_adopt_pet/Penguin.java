package Test_9_adopt_pet;

//企鹅类
public class Penguin {

    //名字
    String name;

    //健康度
    int health = 100;

    //亲密度
    int intimacy;

    //性别
    String sex;

    public void penguinWord(){
        System.out.println("我的名字叫" + name +",健康值是" + health +
                ",和主人的亲密度是" + intimacy + ",性别是" + sex);
    }
}
