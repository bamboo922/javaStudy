package Test_2_visitor;

public class Visitor {

    String name;
    int age;

    public void ticketPriceShow(){

        if(age >= 18 && age < 60){
            System.out.println(name + "的年龄为:" + age + ",门票价格为：20元");
        }
        else{
            System.out.println(name + "的年龄为:" + age + ",门票免费");
        }

    }

}
