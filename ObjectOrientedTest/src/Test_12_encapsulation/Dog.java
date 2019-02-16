package Test_12_encapsulation;

/**
 * 封装
 * 将类的某些信息隐藏在类内部，不允许外部程序直接访问，
 * 而是通过该类提供的方法来实现对隐藏信息的操作和访问
 *
 * 封装的好处
 * 隐藏类的实现细节 只能通过规定方法访问数据 方便加入控制语句 方便修改实现
 *
 * 封装的步骤
 * 修改属性的可见性 设为private
 * 创建公有的getter/setter方法 用于属性的读写
 * 在getter/setter方法中加入属性控制语句 对属性值的合法性进行判断
 */
public class Dog {

    //名字
    private String name;

    //健康度
    private int health = 100;

    //亲密度
    private int intimacy;

    //品种
    private String strain;

    //set方法对私有变量进行设置
    public void setHealth(int dogHealth){

        if(dogHealth < 100 && dogHealth > 0){
            this.health = dogHealth;
        }
        else{
            System.out.println("健康值的范围是(0~100)");
        }
    }

    //get方法对私有变量进行获取
    public int getHealth(){
        return health;
    }

    public void setName(String dogName){
        this.name = dogName;
    }

    public String getName(){
        return name;
    }

    public void setIntimacy(int dogIntimacy){
        this.intimacy = dogIntimacy;
    }

    public int getIntimacy(){
        return intimacy;
    }

    public void setStrain(String dogStrain){
        this.strain = dogStrain;
    }

    public String getStrain(){
        return strain;
    }

    public void dogWord(){
        System.out.println("我的名字叫" + name +",健康值是" + health +
                ",和主人的亲密度是" + intimacy + ",我是一只" + strain);
    }
}
