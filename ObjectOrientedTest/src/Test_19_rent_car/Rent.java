package Test_19_rent_car;

import java.util.Scanner;

public class Rent {

    public static void main(String[] args){

        Car car = null;

        Bus bus = null;

        Scanner scanner = new Scanner(System.in);

        System.out.println("欢迎您来到汽车租赁公司！");

        System.out.print("请输入要租赁的天数：");
        int rentDays = scanner.nextInt();

        System.out.print("请输入要租赁的汽车类型(1、轿车 2、客车)：");
        int rentType = scanner.nextInt();

        if (rentType == 1){

            System.out.print("请输入要租赁的汽车品牌(1、宝马 2、别克):");
            int carBrand = scanner.nextInt();

            if(carBrand == 1){
                car = new Car("京BK5543","550i");

            }else{

                System.out.print("请输入轿车的型号(1、商务舱GLB 2、林荫大道):");
                int carType = scanner.nextInt();

                switch (carType){
                    case 1:
                        car = new Car("鄂888888","商务舱GLB");
                        break;
                    case 2:
                        car = new Car("鄂1234567","林荫大道");
                        break;
                    default:
                        break;
                }

            }

            System.out.println("分配给您的车牌号是：" + car.getNo());

            System.out.println("顾客您好！您需支付的租赁费用是" + car.calRent(rentDays));

        }else{

            System.out.print("请输入要租赁的客车品牌(1、金杯 2、金龙):");
            int busBrand = scanner.nextInt();

            System.out.print("请输入客车的座位数：");
            int busSeat = scanner.nextInt();

            bus = new Bus("京AU8769",busSeat);

            System.out.println("分配给您的车牌号是：" + bus.getNo());

            System.out.println("顾客您好！您需支付的租赁费用是" + bus.calRent(rentDays));
        }

    }

}
