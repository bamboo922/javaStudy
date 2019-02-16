package Test_7_array_parameter;

/**
 * 以数组作为参数
 */
public class Calculator {

    //将digit数组作为参数传入方法 计算数组元素总和
    public double digitPlus(double[] digit){
        double result = 0;
        for (int i = 0; i < digit.length; i++){
            result+=digit[i];
        }
        return result;
    }
}
