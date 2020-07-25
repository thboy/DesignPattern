package io.github.thboy._2_Prototype.demo;

public class Nano extends BasicCar{

    //A base price for Nano
    public int basePrice = 100000;
    public Nano(String m){
        modelName = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException{
        return (Nano)super.clone();
    }
}
