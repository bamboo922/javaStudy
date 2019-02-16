package Test_17_abstract;

/**
 * Java中也使用抽象类，限制实例化
 * 抽象关键字 abstract
 * abstract也可用于方法——抽象方法
 * 抽象类不能实例化
 * 抽象方法没有方法体
 * 抽象方法必须在抽象类里
 * 抽象方法必须在子类中被实现，除非子类是抽象类
 */
public abstract class Human {

    private String name;

    private String sex;

    public Human(String HumanName, String HumanSex){
        this.name = HumanName;
        this.sex = HumanSex;
    }

    public String getName() {
        return name;
    }

    public String getSex() {
        return sex;
    }

    //抽象方法
    public abstract void word();
}
