package Test_9_adopt_pet;

import java.util.Scanner;

/**
 * 领养宠物
 */
public class adoptTest {

    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        Dog dog = new Dog();
        Penguin penguin = new Penguin();

        System.out.println("欢迎您来到宠物店！");

        System.out.print("请输入要领养宠物的名字：");
        String petName = scanner.next();

        System.out.print("请选择要领养的宠物类型:(1.狗狗 2.企鹅)");
        String petTypeNo = scanner.next();

        switch (petTypeNo){
            case "1" :
                System.out.print("请选择狗狗的品种:(1.聪明的拉布拉多犬 2.酷酷的雪纳瑞)");
                String dogStrainNo = scanner.next();

                if(dogStrainNo.equals("1")){
                    dog.strain = "聪明的拉布拉多犬";
                }
                else if(dogStrainNo.equals("2")){
                    dog.strain = "酷酷的雪纳瑞";
                }

                System.out.println("宠物的自白：");
                dog.name = petName;
                dog.dogWord();

                break;
            case "2" :
                System.out.print("请选择企鹅的性别:(1.Q仔 2.Q妹)");
                String penguinSex = scanner.next();

                if(penguinSex.equals("1")){
                    penguin.sex = "Q仔";
                }
                else if(penguinSex.equals("2")){
                    penguin.sex = "Q妹";
                }

                System.out.println("宠物的自白：");
                penguin.name = petName;
                penguin.penguinWord();

                break;
            default:
                System.out.println("输入错误");

                break;
        }

    }

}
