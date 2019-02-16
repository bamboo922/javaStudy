package Test_19_rent_car;

/**
 * 计算一次租赁多辆汽车的总租金
 * 2辆宝马
 * 1辆别克商务舱
 * 1辆金龙(34)座
 * 租5天
 */
public class rentNewTest {

    public static void main(String[] args){

        MotoVehicle[] motoVehicles = new MotoVehicle[4];

        motoVehicles[0] = new Car("京BK5543","550i");
        motoVehicles[1] = new Car("京BK5544","550i");
        motoVehicles[2] = new Car("京BK5545","商务舱GLB");
        motoVehicles[3] = new Bus("京BK5546",34);

        double rentSum = 0;

        for(int i = 0;i < motoVehicles.length;i++){
            MotoVehicle motoVehicle = motoVehicles[i];

            //rentSum += motoVehicles[i].calRent(5);
            rentSum += motoVehicle.calRent(5);
        }

        System.out.println("5天总费用是" + rentSum);
    }
}
