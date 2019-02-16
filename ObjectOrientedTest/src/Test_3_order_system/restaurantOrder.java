package Test_3_order_system;

import java.util.Arrays;
import java.util.Scanner;

/*
 * 吃货联盟订餐系统
 */
public class restaurantOrder {

    public static void main(String[] args){

        System.out.println("欢迎使用吃货联盟订餐系统");

        //创建Menu类型的数组
        Menu[] menuArray = new Menu[3];

        //实例化Menu类型的对象
        Menu dish1 = new Menu();
        dish1.foodName = "红烧带鱼";
        dish1.perPrice = 38;
        //将对象放进数组
        menuArray[0] = dish1;
        //dishes[0] = new Menu();

        Menu dish2 = new Menu();
        dish2.foodName = "鱼香肉丝";
        dish2.perPrice = 32;
        menuArray[1] = dish2;

        Menu dish3 = new Menu();
        dish3.foodName = "时令鲜蔬";
        dish3.perPrice = 10;
        menuArray[2] = dish3;

        //创建order类型数组
        Order[] orderInfo = new Order[20];

        do{
            System.out.println("********************");
            System.out.println("1.我要订餐");
            System.out.println("2.查看餐袋");
            System.out.println("3.签收订单");
            System.out.println("4.删除订单");
            System.out.println("5.我要点赞");
            System.out.println("6.退出系统");
            System.out.println("********************");

            Scanner scanner = new Scanner(System.in);
            System.out.print("请选择：");
            String sequence = scanner.next();

            switch(sequence) {
                case "1":
                    System.out.println(">>我要订餐");

                    //实例化order类型的对象
                    Order orderObject = new Order();

                    //找出数组中空出的位置
                    int index = 0;
                    for(int i = 0;i < orderInfo.length; i++){
                        if(orderInfo[i] == null){
                            index = i;
                            break;
                        }
                    }

                    System.out.print("请输入订餐人姓名：");
                    orderObject.cuscustomers = scanner.next();

                    System.out.println("序号\t菜名\t\t单价");
                    for(int i = 0; i < menuArray.length; i++){
                        System.out.print((i+1) + "\t");
                        menuArray[i].menuInfo();
                    }

                    System.out.print("请选择您要点的菜品编号：");
                    orderObject.orderNo = scanner.nextInt();

                    System.out.print("请选择您需要的份数：");
                    orderObject.dishCopies = scanner.nextInt();

                    System.out.print("请输入送餐时间(送餐时间是10点至20点间整点送餐):");
                    orderObject.sendTimes = scanner.nextInt();

                    System.out.print("请输入送餐地址：");
                    orderObject.sendAddresses = scanner.next();

                    //将对象放进数组
                    orderInfo[index] = orderObject;

                    System.out.println("订餐成功！");

                    System.out.println("您订的是：" + menuArray[orderObject.orderNo - 1].foodName +
                            orderObject.dishCopies + "份");
                    System.out.println("送餐时间："+ orderObject.sendTimes + "点");
                    System.out.println("餐费：" + (menuArray[orderObject.orderNo -1].perPrice *
                            orderObject.dishCopies) + "元");

                    break;

                case "2":
                    System.out.println(">>查看餐袋");
                    System.out.println("序号\t订餐人\t产品信息\t\t送餐时间\t送餐地址\t总金额\t订单状态");

                    for(int i = 0; i < orderInfo.length; i++) {
                        if (orderInfo[i] == null) {
                            break;
                        }

                        System.out.println((i + 1) + "\t" +
                                orderInfo[i].cuscustomers + "\t\t" +
                                menuArray[orderInfo[i].orderNo - 1].foodName + orderInfo[i].dishCopies + "份\t" +
                                orderInfo[i].sendTimes + "点\t\t" +
                                orderInfo[i].sendAddresses + "\t" +
                                menuArray[orderInfo[i].orderNo - 1].perPrice * orderInfo[i].dishCopies + "元\t" +
                                (orderInfo[i].orderStatus == 0 ? "已预订" : "已签收"));
                    }

                    break;

                case "3":
                    System.out.println(">>签收订单");
                    System.out.print("请选择要签收的订单序号：");
                    int signOrderNo = scanner.nextInt();

                    orderInfo[signOrderNo].orderStatus = 1;
                    System.out.println("订单签收成功！");


                    break;
                case "4":
                    System.out.println(">>删除订单");

                    System.out.println("请输入要删除的订单序号：");
                    int deleteNo = scanner.nextInt() - 1;
                    orderInfo[deleteNo] = null;
                    for(int i = deleteNo; i < orderInfo.length - 1; i++){
                        orderInfo[i] = orderInfo[i+1];
                        if(orderInfo[i + 1] == null){
                            break;
                        }
                    }
                    System.out.println("删除订单成功！");

                    break;
                case "5":
                    System.out.println(">>我要点赞");

                    System.out.println("序号\t菜名\t\t单价");
                    for(int i = 0; i < menuArray.length; i++){
                        System.out.print((i+1) + "\t");
                        menuArray[i].menuInfo();
                    }

                    System.out.println("请选择您要点赞的菜品序号：");
                    int likeNo = scanner.nextInt() - 1;
                    menuArray[likeNo].like++;
                    System.out.println("点赞成功！");
                    break;
                case "6":
                    System.out.println("退出系统，谢谢使用");
                    System.exit(0);//终止运行
                    break;
                default:
                    break;
            }

            System.out.println("输入0返回/输入其他数字退出系统");
            sequence = scanner.next();
            if("0".equals(sequence)){
                continue;
            }
            else{
                System.out.println("退出系统，谢谢使用");
                break;
            }

        }while(true);


    }

}
