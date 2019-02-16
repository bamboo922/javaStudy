package Test_12_encapsulation;

public class dogTest {

   public static void main(String[] args){

       Dog dog = new Dog();
       dog.setName("欧欧");
       dog.setHealth(80);
       dog.setStrain("拉布拉多犬");
       dog.dogWord();
       System.out.println("我的名字叫" + dog.getName() +",健康值是" + dog.getHealth() +
               ",和主人的亲密度是" + dog.getIntimacy() + ",我是一只" + dog.getStrain());

   }

}
