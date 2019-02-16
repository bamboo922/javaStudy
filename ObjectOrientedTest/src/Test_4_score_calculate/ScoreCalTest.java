package Test_4_score_calculate;

import java.util.Scanner;

public class ScoreCalTest {

    public static void main(String[] args){

        ScoreCal score = new ScoreCal();
        Scanner scanner = new Scanner(System.in);

        System.out.print("请输入语文成绩：");
        score.chinese = scanner.nextDouble();

        System.out.print("请输入数学成绩：");
        score.math = scanner.nextDouble();

        System.out.print("请输入英语成绩：");
        score.english = scanner.nextDouble();

        System.out.println("成绩总和为：" + score.sum());
        System.out.println("成绩平均分为：" + score.average());

    }

}
