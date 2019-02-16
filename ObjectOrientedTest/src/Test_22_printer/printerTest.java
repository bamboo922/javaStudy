package Test_22_printer;

public class printerTest {

    public static void main(String[] args){
        Printer printer = new Printer();

        Paper a4Paper = new A4Paper();
        Paper b5Paper = new B5Paper();

        InkBox blackInkBox = new BlackInkBox();
        InkBox colourInkBox = new ColourInkBox();

        printer.setPaper(a4Paper);
        printer.setInkBox(blackInkBox);
        printer.print();

        printer.setPaper(b5Paper);
        printer.setInkBox(colourInkBox);
        printer.print();

    }
}
