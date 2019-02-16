package Test_14_sell_car;

/**
 * 君威类
 */
public class Regal {

    private String type;

    private String carId;

    public String getType() {
        return type;
    }

    public String getId() {
        return carId;
    }

    public Regal(String carId, String type){
        this.type = type;
        this.carId = carId;
    }
}
