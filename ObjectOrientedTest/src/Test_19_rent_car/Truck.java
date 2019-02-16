package Test_19_rent_car;

public class Truck extends MotoVehicle {

    private int ton;

    public int getTon() {
        return ton;
    }

    public void setTon(int ton) {
        this.ton = ton;
    }

    public Truck(String no) {
        super(no);
    }

    @Override
    public double calRent(int days) {
        return 0;
    }
}
