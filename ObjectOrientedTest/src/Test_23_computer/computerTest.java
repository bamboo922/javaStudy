package Test_23_computer;

public class computerTest {
    public static void main(String[] args){

        Computer computer = new Computer();

        CPU computerCpu = new IntelCPU();
        HardDisk computerDisk = new HardDiskCapacity();
        Memory computerMemory = new MemoryCapacity();

        computer.setCpu(computerCpu);
        computer.setHardDisk(computerDisk);
        computer.setMemory(computerMemory);
        computer.print();
    }
}
