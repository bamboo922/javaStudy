package Test_2_stringbuffer;

public class Goods {

    String[] goodsList = {"电风扇","洗衣机","电视机","冰 箱","空调机"};
    String[] amountList = {"123.23","4500.0","8800.9","5000.88","4456.0"};

    public boolean loginVerify(String userName,String passWord){
        boolean judge = false;
        if(userName.equals("TOM") && passWord.equals("123")){
            judge = true;
            System.out.println("登录成功！");
        }else{
            judge = false;
            System.out.println("登录失败！请重新输入");
        }

        return judge;
    }

    public void showGoods(){
        for(int i = 0;i < goodsList.length;i++){
            System.out.println((i + 1) + "\t\t" + goodsList[i] + "\t" + amountChange(amountList[i]));
        }
    }

    public StringBuffer amountChange(String amount){
        StringBuffer newAmount = new StringBuffer(amount);
        for(int i = newAmount.indexOf(".") - 3;i > 0;i = i - 3){
            newAmount.insert(i,",");
            break;
        }
        return newAmount;
    }

    public double calculate(int number,int amount){
        double totalPrice = 0;

        switch (number){
            case 1:
                totalPrice = Double.parseDouble(amountList[number-1]) * amount;
                break;
            case 2:
                totalPrice = Double.parseDouble(amountList[number-1]) * amount;
                break;
            case 3:
                totalPrice = Double.parseDouble(amountList[number-1]) * amount;
                break;
            case 4:
                totalPrice = Double.parseDouble(amountList[number-1]) * amount;
                break;
            case 5:
                totalPrice = Double.parseDouble(amountList[number-1]) * amount;
                break;
            }

        return totalPrice;
    }

}
