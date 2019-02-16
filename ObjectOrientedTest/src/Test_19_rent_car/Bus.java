package Test_19_rent_car;

public class Bus extends MotoVehicle {

    //座位数
    private int seatCount;

    public Bus(String no,int seatCount){
        super(no);
        this.seatCount = seatCount;

    }
    public int getSeatCount() {
        return seatCount;
    }

    public void setSeatCount(int seatCount) {
        this.seatCount = seatCount;
    }

    @Override
    public double calRent(int days) {
        double pay;
        if(seatCount <= 16){
            pay = 800 * days;
        }else{
            pay = 1500 * days;
        }

        return pay;
    }
}
