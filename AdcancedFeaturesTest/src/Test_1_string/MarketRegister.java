package Test_1_string;

public class MarketRegister {

    public boolean verify(String creditCard,String mobile,String phone){

        boolean judge = false;

        if(creditCard.length() == 14 || creditCard.length() == 17){
            judge = true;
            if(mobile.length() == 10){
                judge = true;

                if(phone.indexOf("-") == -1){
                    judge = false;
                    System.out.println("请填写有效座机号");
                }

                String[] phoneArray = phone.split("-");

                if(phoneArray[0].length() == 3 && phoneArray[1].length() == 6){
                    judge = true;
                    System.out.println("注册成功！");
                }else{
                    judge = false;
                    System.out.println("座机号码区号必须为4位，电话号码必须为7位！");
                }

            }else{
                judge = false;
                System.out.println("手机号码必须是11位！");
            }
        }else{
            judge = false;
            System.out.println("身份证号必须是16位或18位！");
        }

        return judge;
    }
}
