package Test_3_collection.arraylist;

public class Dog {

    private String name;

    private String strain;

    public Dog(String dogName,String dogStrain){
        this.name = dogName;
        this.strain = dogStrain;
    }

    public String toString(){
        return "Dog [name = " + name + ",strain = " + strain +"]";
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getStrain() {
        return strain;
    }

    public void setStrain(String strain) {
        this.strain = strain;
    }
}
