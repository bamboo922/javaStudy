package Test_14_sell_car;

/**
 * 凯越类
 */
public class Excelle {

    private String type;

    private String carId;

    public String getType() {
        return type;
    }

    public String getId() {
        return carId;
    }

    public Excelle(String carId, String type){
        this.type = type;
        this.carId = carId;
    }
}
