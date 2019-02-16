package Test_1_string;

import java.util.Scanner;

public class registerTest {

    public static void main(String[] args){
        Register register = new Register();

        Scanner scanner = new Scanner(System.in);

        System.out.println("***欢迎进入注册系统***");

        do{
            System.out.print("请输入用户名：");
            String userName = scanner.next();
            System.out.print("请输入密码：");
            String userPassword = scanner.next();
            System.out.print("请再次输入密码：");
            String confirmPassword = scanner.next();

            boolean result = register.verify(userName,userPassword,confirmPassword);

            if(result == true){
                break;
            }

        }while (true);

    }
}
