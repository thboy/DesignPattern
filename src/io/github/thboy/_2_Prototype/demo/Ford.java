package io.github.thboy._2_Prototype.demo;

public class Ford extends BasicCar{

    //A base price for Ford
    public int basePrice = 100000;
    public Ford(String m){
        modelName = m;
    }

    @Override
    public BasicCar clone() throws CloneNotSupportedException{
        return (Ford)super.clone();
    }


}
