package Test_20_interface;

public class UdiskTest {

    public static void main(String args[]){

        //接口的引用指向实现类的对象
        UsbInterface udisk = new UDisk();

        udisk.service();
    }
}
