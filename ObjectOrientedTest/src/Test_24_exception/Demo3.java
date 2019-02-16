package Test_24_exception;

/**
 * throws关键字 抛出异常
 * 使用throws关键字声明的方法表示此方法不处理异常，而交给方法调用处进行处理
 */
public class Demo3 {

  public static void main(String[] args){

      try{
          new Demo3().calculate(10,0);
      }catch (Exception e){
          System.out.println("除数不能为0");
      }finally {
          System.out.println("程序结束");
      }

  }

  public void calculate(int num1,int num2) throws Exception{
      int result = 0;
      result = num1 / num2;
  }

}
