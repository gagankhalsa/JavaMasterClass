package Encapsulation;

/**
 * Created by GAGAN on 10/01/2018.
 */
public class Main {
    public static void main(String args[])
    {
Printer printer=new Printer(50,true);
        System.out.println("initial page count is "+printer.getPagesPrinted());
      int pagesPrinted=printer.printPages(4);
        System.out.println("pages printed was "+pagesPrinted+" new total print count for printer "
                +printer.getPagesPrinted());
        pagesPrinted=printer.printPages(4);
        System.out.println("pages printed was "+pagesPrinted+" new total print count for printer "
                +printer.getPagesPrinted());
        printer.addToner(50);
        System.out.println("Total amount "+printer.getTonerLevel());
    }
}
