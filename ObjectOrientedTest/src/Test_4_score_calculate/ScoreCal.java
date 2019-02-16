package Test_4_score_calculate;

/**
 * 如何定义类的方法
 * 方法名称 方法返回的数据类型 方法的主体
 *
 * 方法的返回值有两种情况
 * 1.如果方法具有返回值 方法中必须使用关键字
 * return返回该值，返回值类型为该返回值的类型
 * 以下面的sum()方法为例 return的sum的类型是该方法返回值的double类型
 * 2.如果方法没有返回值，返回值类型为void(不用return返回值的返回值类型)
 *   不需要return
 */

public class ScoreCal {

    double chinese;

    double math;

    double english;

    //计算总数
    //double为方法的返回值类型
    public double sum(){
        double sum = chinese + math + english;
        return sum;
    }

    //计算平均数
    public double average(){
        double average = sum()/3;
        return average;
    }

}

