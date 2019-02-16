package Test_15_inheritance;

//子类
public class Penguin extends Pet{

    private String sex;

    public Penguin(String penguinName,int penguinHealth){
        super(penguinName,penguinHealth);
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public void print(){
        super.print();
        System.out.println(",我的性别是" + sex);
    }
}
