package Test_24_exception;

/**
 * 当try或catch块中有return时
 *   则会 先执行return之前的代码
 *     再执行finally块代码
 *     最后执行try或catch块中的return
 *     finally始终会在return之前执行
 *   try-catch块外的return则不会执行
 */
public class Demo2 {

    public static void main(String[] args){
        int method = new Demo2().devide(10,0);
        System.out.println(method);
        System.out.println("程序结束");
    }

    public int devide(int num1,int num2){

        int result = 0 ;
        try{
            result = num1 / num2;
        }catch (Exception e){
            System.out.println("除数不能为0");
            //return 0;
        }finally {
            System.out.println("finally");
        }
        System.out.println("最后");
        return result;
    }




}
