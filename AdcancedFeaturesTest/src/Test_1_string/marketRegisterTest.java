package Test_1_string;

import java.util.Scanner;

public class marketRegisterTest {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        MarketRegister marketRegister = new MarketRegister();

        System.out.println("***欢迎进入注册系统***");

        do {
            System.out.print("请输入身份证：");
            String creditCard = scanner.next();
            System.out.print("请输入手机号：");
            String mobile = scanner.next();
            System.out.print("请输入座机号：");
            String phone = scanner.next();

            boolean result = marketRegister.verify(creditCard,mobile,phone);

            if(result == true){
                break;
            }

        }while (true);

    }
}
