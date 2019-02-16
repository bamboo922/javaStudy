package Test_22_printer;

public class Printer {

    private InkBox inkBox;

    private Paper paper;

    public InkBox getInkBox() {
        return inkBox;
    }

    public void setInkBox(InkBox inkBox) {
        this.inkBox = inkBox;
    }

    public Paper getPaper() {
        return paper;
    }

    public void setPaper(Paper paper) {
        this.paper = paper;
    }

    public void print(){
        System.out.println("使用" + inkBox.getInkBox() + "在" + paper.getPaper() + "上打印");
    }
}
