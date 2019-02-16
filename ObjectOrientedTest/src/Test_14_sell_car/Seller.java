package Test_14_sell_car;

/**
 * 销售员类
 */
public class Seller {

    private String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void sell(Excelle excelle){
        System.out.println(name + "卖出一台凯越" + excelle.getType() + excelle.getId());
    }

    public void sell(Regal regal){
        System.out.println(name + "卖出一台君威" + regal.getType() + regal.getId());
    }

    public void sell(Excelle excelle,int num){
        System.out.println(name + "卖出"+ num + "台凯越" + excelle.getType() + excelle.getId());
    }
}
