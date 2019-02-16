package javaBasic_3;

import java.util.Scanner;

/*
 * 吃货联盟订餐系统
 */
public class Test_26_restaurantOrder {

    public static void main(String[] args){

        System.out.println("欢迎使用吃货联盟订餐系统");

        String[] menu = {"红烧带鱼","鱼香肉丝","时令鲜蔬"};
        double[] perPrice = {38,20,10};//菜品单价
        int[] like = new int[3];//点赞数

        int[] orderNo = new int[20];//菜品编号
        String[] customers = new String[orderNo.length];//顾客姓名
        int[] dishCopies = new int[orderNo.length];//菜品份数
        int[] sendTimes = new int[orderNo.length];//送餐时间
        String[] sendAddresses = new String[orderNo.length];//送餐地址
        int[] orderStatus  = new int[orderNo.length];

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

                    //找出数组中空出的位置
                    int index = 0;
                    for(int i = 0;i < orderNo.length; i++){
                        if(orderNo[i] == 0){
                            index = i;
                            break;
                        }
                    }

                    System.out.print("请输入订餐人姓名：");
                    String customerName = scanner.next();
                    customers[index] = customerName;

                    System.out.println("序号\t菜名\t\t单价");
                    for(int i = 0; i < menu.length; i++){
                        System.out.println((i+1) + "\t" + menu[i] + "\t" + perPrice[i] + "\t");
                    }

                    System.out.print("请选择您要点的菜品编号：");
                    int menuNo = scanner.nextInt();
                    orderNo[index] = menuNo;

                    System.out.print("请选择您需要的份数：");
                    int copyNo = scanner.nextInt();
                    dishCopies[index] = copyNo;

                    System.out.print("请输入送餐时间(送餐时间是10点至20点间整点送餐):");
                    int time = scanner.nextInt();
                    sendTimes[index] = time;

                    System.out.print("请输入送餐地址：");
                    String address = scanner.next();
                    sendAddresses[index] = address;

                    System.out.println("订餐成功！");
                    System.out.println("您订的是：" + menu[orderNo[index] - 1] + dishCopies[index] + "份");
                    System.out.println("送餐时间："+ sendTimes[index] + "点");
                    System.out.println("餐费：" + (perPrice[orderNo[index] - 1]*dishCopies[index]) + "元");

                    break;

                case "2":
                    System.out.println(">>查看餐袋");
                    System.out.println("序号\t订餐人\t产品信息\t\t送餐时间\t送餐地址\t总金额\t订单状态");

                    for(int i = 0; i < orderNo.length; i++){
                        if(orderNo[i] == 0){
                            break;
                        }

                        System.out.println((i+1)+ "\t" + customers[i] + "\t\t" + menu[orderNo[i] - 1] + dishCopies[i] +
                        "份\t" + sendTimes[i] + "点\t\t" + sendAddresses[i] + "\t\t" + perPrice[orderNo[i] - 1]*dishCopies[i] +
                                "元\t" +  orderStatus[i]);

                    }

                    break;

                case "3":
                    System.out.println(">>签收订单");
                    System.out.print("请选择要签收的订单序号：");
                    int signOrderNo = scanner.nextInt();
                    orderStatus[signOrderNo] = 1;
                    System.out.println("订单签收成功！");
                    break;
                case "4":
                    System.out.println(">>删除订单");

                    System.out.println("请输入要删除的订单序号：");
                    int deleteNo = scanner.nextInt();
                    System.out.println("删除订单成功！");

                    break;
                case "5":
                    System.out.println(">>我要点赞");

                    System.out.println("序号\t菜名\t\t单价");

                    for(int i = 0; i < menu.length; i++){
                        System.out.println((i+1) + "\t" + menu[i] + "\t" + perPrice[i] + "\t" + like[i] + "赞");
                    }

                    System.out.println("请选择您要点赞的菜品序号：");
                    int likeNo = scanner.nextInt();
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
