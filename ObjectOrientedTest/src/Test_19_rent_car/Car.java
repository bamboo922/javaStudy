package Test_19_rent_car;

public class Car extends MotoVehicle {

    //型号
    private String type;

    public Car(String no,String type){
        super(no);
        this.type = type;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public double calRent(int days) {

        double pay = 0;

        switch (type){
            case "550i" :
                pay = 500 * days;
                break;
            case "商务舱GLB":
                pay = 600 * days;
                break;
            case "林荫大道":
                pay = 300 * days;
                break;
            default:
                break;
        }

        return pay;
    }
}
