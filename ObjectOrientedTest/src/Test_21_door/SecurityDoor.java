package Test_21_door;

public class SecurityDoor extends Door implements Lock {

    public void open() {
        System.out.println("用力推，门打开了");
    }

    public void close() {
        System.out.println("轻轻拉门，门关上了");
    }

    public void lockUp() {
        System.out.println("上锁");
    }

    public void openLock() {
        System.out.println("开锁");
    }
}
