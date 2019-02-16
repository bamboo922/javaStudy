package Test_18_polymorphism;

public class Dog extends Pet {

    private String strain;

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }

    public void eat(){
        System.out.println("狗吃狗粮，健康值+3");
        super.setHealth(super.getHealth() + 3);
    }

    public void frisbee(){
        System.out.println("狗狗接住了飞盘，健康值-10");
    }
}
