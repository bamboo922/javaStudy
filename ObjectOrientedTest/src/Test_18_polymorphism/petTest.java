package Test_18_polymorphism;

public class petTest {

    public static void main(String[] args){

        Master master = new Master();

        //Dog dog = new Dog();
        //父类的引用指向子类的对象 向上转型
        /*
        (分解代码)
        Pet pet;
        Dog dog = new Dog();
        pet = dog;
         */

        Pet pet = new Dog();
        master.feed(pet);

        //Penguin penguin = new Penguin();
        Pet pet2 = new Penguin();
        master.feed(pet2);

        Pet pet4 = new Cat();
        master.feed(pet4);

        //获取Pet类型对象
        Pet pet3 = master.getPet("penguin");
        pet3.eat();

        master.play(pet3);

    }
}
