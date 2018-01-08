package com.company;

/**
 * Created by GAGAN on 06/01/2018.
 */
public class Car {
    private int doors;
    private int wheels;
    private String model;
    private String engine;
    public void setModel(String model) {
        String vaildmodel = model.toLowerCase();
        if (vaildmodel.equals("model101")) {
            this.model = model;
        }
        else
        {
            this.model="unknown";
        }
    }
    public String getModel(){

        return this.model;
    }
}
