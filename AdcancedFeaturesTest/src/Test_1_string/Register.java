package Test_1_string;

public class Register {

    public boolean verify(String userName,String password,String confirmPassword){
        boolean judge = false;
        if(userName.length() >= 3 && password.length() >= 6){

            judge = true;
            if(confirmPassword.equals(password)){
                judge = true;
                System.out.println("注册成功！请牢记用户名和密码。");
            }else {
                judge = false;
                System.out.println("两次输入的密码不相同！");
            }

        }else {
            judge = false;
            System.out.println("用户名长度不能小于3，密码长度不能小于6！");
        }
        return judge;
    }
}
