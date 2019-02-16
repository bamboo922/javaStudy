package Test_21_door;

public class securityDoorTest {

    public static void main(String args[]){

        SecurityDoor securityDoor = new SecurityDoor();
        securityDoor.close();
        securityDoor.lockUp();
        System.out.println("************************");
        securityDoor.openLock();
        securityDoor.open();
    }
}
