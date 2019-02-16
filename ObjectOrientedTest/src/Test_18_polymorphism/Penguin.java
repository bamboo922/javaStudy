package Test_18_polymorphism;

public class Penguin extends Pet {

    private String sex;

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void eat(){
        System.out.println("企鹅吃鱼，健康值+5");
        super.setHealth(super.getHealth() + 5);
    }

    public void swimming(){
        System.out.println("企鹅游泳，健康值-10");
    }
}
