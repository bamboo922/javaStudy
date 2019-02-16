package Test_18_polymorphism;

import sun.jvm.hotspot.oops.Instance;

public class Master {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

//    public void feed(Dog dog){
//        dog.eat();
//    }
//
//    public void feed(Penguin penguin){
//        penguin.eat();
//    }


    /**
     * 使用父类作为方法形参实现多态
     */
    public void feed(Pet pet){
        pet.eat();
    }

    /**
     * 使用父类作为方法返回值实现多态
     */
    public Pet getPet(String petType){

        Pet pet = null;

        switch (petType){
            case "dog":
                pet = new Dog();
                break;
            case "penguin":
                pet = new Penguin();
                break;
            default:
                break;
        }

        return pet;
    }

    /**
     * 父类向子类转换 向下转型（强制类型转换）instanceof运算符
     * 对象 instanceof 类或接口
     * instanceof通常和强制类型转换结合使用
     */
    public void play(Pet pet){

        if(pet instanceof Dog){
            Dog dog = (Dog) pet;
            dog.frisbee();

        }else if(pet instanceof Penguin){
            Penguin penguin = (Penguin) pet;
            penguin.swimming();
        }
    }
}
