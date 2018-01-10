package Encapsulation;

/**
 * Created by GAGAN on 10/01/2018.
 */
public class Printer {
    private int tonerLevel;
    private int pagesPrinted;
    private boolean isDuplex;

    public Printer(int tonerLevel, boolean isDuplex) {
        if (tonerLevel>-1&&tonerLevel<=100) {
            this.tonerLevel = tonerLevel;
        }
        else
        {
            this.tonerLevel=-1;
        }
        this.isDuplex = isDuplex;
        this.pagesPrinted=0;
    }
    public int addToner(int tonerAmount)
    {
        if (tonerAmount>0&&tonerAmount<=100)
        {
            if (this.tonerLevel+tonerAmount>100)
            {
                return -1;
            }
            this.tonerLevel+=tonerAmount;
            return this.tonerLevel;
        }else {
            return -1;
        }
    }

    public int getTonerLevel() {
        return tonerLevel;
    }

    public int printPages(int pages)
    {
        int pagesToPrint=pages;
        if (this.isDuplex){
            pagesToPrint/=2;
            System.out.println("printing in duplex mode");
        }
        this.pagesPrinted+=pagesToPrint;
        return pagesToPrint;
    }

    public int getPagesPrinted() {
        return pagesPrinted;
    }
}
