package Test_10_constructor;

import java.util.Scanner;

/**
 * 构造方法的调用与重载
 */
public class Pet {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("欢迎您来到宠物店！");

        System.out.print("请输入要领养宠物的名字：");
        String petName = scanner.next();

        System.out.print("请选择要领养的宠物类型:(1.狗狗 2.企鹅)");
        String petTypeNo = scanner.next();

        switch (petTypeNo){
            case "1" :
                String strain = null;
                System.out.print("请选择狗狗的品种:(1.聪明的拉布拉多犬 2.酷酷的雪纳瑞)");
                String dogStrainNo = scanner.next();

                if(dogStrainNo.equals("1")){
                    strain = "聪明的拉布拉多犬";
                }else if(dogStrainNo.equals("2")){
                    strain = "酷酷的雪纳瑞";
                }

                //调用带参构造方法
                Dog dog = new Dog(petName,strain);
                System.out.println("宠物的自白：");

                dog.dogWord();

                break;
            case "2" :
                String sex = null;
                System.out.print("请选择企鹅的性别:(1.Q仔 2.Q妹)");
                String penguinSex = scanner.next();

                if(penguinSex.equals("1")){
                    sex = "Q仔";
                }else if(penguinSex.equals("2")){
                    sex = "Q妹";
                }

                Penguin penguin = new Penguin(petName,sex);
                System.out.println("宠物的自白：");
                penguin.penguinWord();

                break;
            default:
                System.out.println("输入错误");

                break;
        }
    }
}
