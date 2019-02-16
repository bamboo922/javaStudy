package Test_17_abstract;

public class Person extends Human {

    public Person(){
        super("欧阳倩","女");
    }

    @Override
    public void word() {
        System.out.println("我的名字是" + super.getName() + ",我的性别是" + super.getSex());
    }
}
