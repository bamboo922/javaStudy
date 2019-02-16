package Test_24_exception;

/**
 * throw关键字 程序员自行抛出异常
 */
public class Person {

    private String userName;

    private String userSex;

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserSex() {
        return userSex;
    }

    public void setUserSex(String userSex) throws Exception {
        if(userSex.equals("男") || userSex.equals("女")){
            this.userSex = userSex;
        }else{
            throw new GenderMisMatchException("性别只能是男或女"); //创建异常对象抛出
        }
    }


}
