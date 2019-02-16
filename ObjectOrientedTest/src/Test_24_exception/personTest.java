package Test_24_exception;

public class personTest {

    public static void main(String[] args) {

        Person person = new Person();

        person.setUserName("陈");

        try {
            person.setUserSex("male");

        } catch (GenderMisMatchException e){
            e.getMessage();
            e.printStackTrace();

        } catch (Exception e) {
            System.out.println(e.getMessage());
            e.printStackTrace();
        }

        System.out.println(person.getUserName() + "的性别是" + person.getUserSex());
        System.out.println("程序结束");

    }
}
