package Test_23_computer;

public class Computer {
    //cpu
    private CPU cpu;

    //硬盘
    private HardDisk hardDisk;

    //内存
    private Memory memory;

    public CPU getCpu() {
        return cpu;
    }

    public void setCpu(CPU cpu) {
        this.cpu = cpu;
    }

    public HardDisk getHardDisk() {
        return hardDisk;
    }

    public void setHardDisk(HardDisk hardDisk) {
        this.hardDisk = hardDisk;
    }

    public Memory getMemory() {
        return memory;
    }

    public void setMemory(Memory memory) {
        this.memory = memory;
    }

    public void print(){
        System.out.println("CPU的品牌是：" + cpu.getBrand() + ",主频是：" + cpu.getHZ());
        System.out.println("硬盘容量是：" + hardDisk.getMemory());
        System.out.println("内存容量是：" + memory.getCapacity());
    }
}
