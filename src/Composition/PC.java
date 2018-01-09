package Composition;

/**
 * Created by GAGAN on 09/01/2018.
 */
public class PC {
private Monitor monitor;
private Case theCase;
private Motherboard motherboard;

    public PC(Monitor monitor, Case theCase, Motherboard motherboard) {
        this.monitor = monitor;
        this.theCase = theCase;
        this.motherboard = motherboard;
    }
public void powerUp(){
        theCase.pressPowerButton();
        drawLogo();
}
public void drawLogo(){
    monitor.drawPixel(1400,1300,"yellow");
}


}
