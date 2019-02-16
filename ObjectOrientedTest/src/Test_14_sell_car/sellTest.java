package Test_14_sell_car;

public class sellTest {

    public static void main(String[] args){

        Seller seller = new Seller();
        seller.setName("张三");

        Excelle excelle = new Excelle("鄂A88888","X9");

        seller.sell(excelle);

        Regal regal = new Regal("鄂A66666","G5");

        seller.sell(regal);

        seller.sell(excelle,10);
    }
}
