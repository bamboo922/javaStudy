package Test_18_polymorphism;

/**
 * 多态是同一个行为具有多个不同表现形式或形态的能力。
 * 同一个引用类型，使用不同的实例而执行不同操作
 *
 * 使用多态实现思路(实现多态的三个要素)
 *   编写具有继承关系的父类和子类
 *   子类重写父类方法
 *   使用父类的引用指向子类的对象
 *     向上转型
 *     Pet pet = new Dog(); 自动类型转换
 * 实现多态的两种形式
 *   使用父类作为方法形参实现多态
 *   使用父类作为方法返回值实现多态
 */
public abstract class Pet {

    private String name;

    private int health;

    private int love;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public int getLove() {
        return love;
    }

    public void setLove(int love) {
        this.love = love;
    }

    public void eat(){
        System.out.println("宠物健康值");
    }

//    public void eat1(){
//        System.out.println("pet  eat1");
//        eat2();
//    }
//
//    public void eat2(){
//        System.out.println("pet  eat2");
//    }


}
