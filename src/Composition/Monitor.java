package Composition;

/**
 * Created by GAGAN on 09/01/2018.
 */
public class Monitor {
    String model;
    String manufacturer;
    int size;
    Resolution nativeResolution;// this is composition,Monitor has resolution

    public Monitor(String model, String manufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }
    public void drawPixel(int x,int y,String color){
        System.out.println("Drawing pixel at "+x +" ,"+y +" in color"+color);
    }

    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getSize() {
        return size;
    }

    public Resolution getNativeResolution() {
        return nativeResolution;
    }
}
