package Test_6_order_system;

import java.util.Scanner;

public class restaurantOrder {

    Scanner scanner = new Scanner(System.in);
    String sequence;

    public static void main(String[] args){
        /* 写法1
        restaurantOrder takeout = new restaurantOrder();
        takeout.initiation();
        */
        //匿名对象
        new restaurantOrder().initiation();
    }

    //程序初始化
    public void initiation(){
        System.out.println("欢迎使用吃货联盟订餐系统");
        homeMenu();
    }

    //主页列表
    public void homeMenu(){

        System.out.println("********************");
        System.out.println("1.我要订餐");
        System.out.println("2.查看餐袋");
        System.out.println("3.签收订单");
        System.out.println("4.删除订单");
        System.out.println("5.我要点赞");
        System.out.println("6.退出系统");
        System.out.println("********************");

        System.out.print("请选择：");
        sequence = scanner.next();

        switch (sequence){
            case "1":
                order();

                break;
            case "2":
                checkOrder();

                break;
            case "3":
                signOrder();

                break;
            case "4":
                deleteOrder();

                break;
            case "5":
                likeOrder();

                break;
            case "6":
                System.out.println("退出系统，谢谢使用");
                System.exit(0);//终止运行

                break;

            default:
                break;
        }

        backHome();
    }

    //我要点餐
    public void order(){
        System.out.println(">>我要点餐");
    }

    //查看餐袋
    public void checkOrder(){
        System.out.println(">>查看餐袋");
    }

    //签收订单
    public void signOrder(){
        System.out.println(">>签收订单");
    }

    //删除订单
    public void deleteOrder(){
        System.out.println(">>删除订单");
    }

    //我要点赞
    public void likeOrder(){
        System.out.println(">>我要点赞");
    }

    //返回主页列表
    public void backHome(){
        System.out.print("输入0返回/输入其他数字退出系统：");
        sequence = scanner.next();
        if("0".equals(sequence)){
            homeMenu();
        }
        else{
            System.out.println("退出系统，谢谢使用");
            System.exit(0);//终止运行
        }
    }
}
