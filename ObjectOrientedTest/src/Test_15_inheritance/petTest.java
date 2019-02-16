package Test_15_inheritance;

public class petTest {

    public static void main(String[] args){

        Dog dog = new Dog("欧巴",105);
        dog.setStrain("拉布拉多");
        dog.print();

        Penguin penguin = new Penguin("安安",120);
        penguin.setSex("Q妹");
        penguin.print();

        String aa = "123";
        aa.equals("1");
        //Penguin penguin = new Penguin();

//        dog.setName("欧欧");
//        dog.setHealth(80);

        //dog.print();

//        penguin.setName("可可");
//        penguin.setHealth(70);
//        penguin.print();

    }
}
