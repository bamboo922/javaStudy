package Test_7_array_parameter;

import java.util.Scanner;

public class calculatorTest {

    public static void main(String[] args){

        Calculator calculator = new Calculator();

        double numArray[] = new double[3];

        Scanner scanner = new Scanner(System.in);

        for(int i = 0; i < numArray.length; i++){
            System.out.print("请输入第" +(i+1)+ "个数字：");
            numArray[i] = scanner.nextDouble();
        }

        double result = calculator.digitPlus(numArray);

        System.out.println("总和为：" + result);
    }
}
