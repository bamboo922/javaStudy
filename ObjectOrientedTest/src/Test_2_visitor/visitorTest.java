package Test_2_visitor;

import java.util.Scanner;

public class visitorTest {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        Visitor visitor = new Visitor();

        while(!"n".equals(visitor.name)){
            System.out.print("请输入姓名：");
            visitor.name = scanner.next();

            if(!"n".equals(visitor.name)){
                System.out.print("请输入年龄：");
                visitor.age = scanner.nextInt();

                visitor.ticketPriceShow();

            }
        }
        System.out.print("退出程序");
    }

}
