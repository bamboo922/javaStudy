package Test_19_rent_car;

public abstract class MotoVehicle {

    //车牌号
    private String no;

    //品牌
    private String brand;

    public MotoVehicle(String no){
        this.no = no;
    }

    public String getNo() {
        return no;
    }

    public void setNo(String no) {
        this.no = no;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public abstract double calRent(int days);
}
