package Test_2_stringbuffer;

import java.util.Scanner;

public class GoodsAmountShow {

    public static void main(String[] args){

        Goods goods = new Goods();
        Scanner scanner = new Scanner(System.in);

        do{
            System.out.print("请输入用户名：");
            String userName = scanner.next();
            System.out.print("请输入密码：");
            String passWord = scanner.next();

            boolean result = goods.loginVerify(userName,passWord);

            if(result == true){
                break;
            }

        }while (true);

        System.out.println("*****欢迎进入商品批发城*****");
        System.out.println("编号\t\t商品\t\t价格");
        goods.showGoods();

        System.out.println("*************************");
        System.out.print("请输入您批发的商品编号：");
        int  number = scanner.nextInt();
        System.out.print("请输入批发数量：");
        int amount = scanner.nextInt();

        String totalPriceString = String.valueOf(goods.calculate(number,amount));

        System.out.println("您需要付款：" + goods.amountChange(totalPriceString));


    }
}
