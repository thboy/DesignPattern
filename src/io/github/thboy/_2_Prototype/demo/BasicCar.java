package io.github.thboy._2_Prototype.demo;

import java.util.Random;

public abstract class BasicCar implements Cloneable{
    public String modelName;
    public int basePrice,onRoadPrice;

    public String getModelName(){
        return modelName;
    }
    public void setModelName(String modelName){
        this.modelName = modelName;
    }

    public static int setAdditionalPrice(){
        int price = 0;
        Random r = new Random();
        //we will get an integer value in the range 0 to 100000
        int p = r.nextInt(100000);
        price = p;
        return price;
    }

    public BasicCar clone() throws CloneNotSupportedException{
        return (BasicCar)super.clone();
    }


}
