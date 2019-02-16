package Test_15_inheritance;

import java.util.Objects;

//子类
public class Dog extends Pet {

    private String strain;

    public Dog(String dogName,int dogHealth){
        super(dogName,dogHealth);
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public void print(){
        super.print();
        System.out.println(",我是一只" + strain);
    }

    //重写equals方法
    public boolean equals(Object obj){

        //判断 对象的两个属性是否都相等
        boolean nameEqual = this.getName() == ((Dog)obj).getName();
        boolean healthEqual = this.getHealth() == ((Dog)obj).getHealth();

        if(nameEqual){
            return false; //返回值出现一次 后面的便不会执行
        }

        if(healthEqual){
            return false;
        }

        return true;
    }


    public String toString(){
        return "strain:" + strain;
    }
}
