package io.github.thboy._3_BuilderPattern.demo1;

public class BuiderPatternExample {
    //
    public static void main(String[] args) {
        System.out.println("***Builder Pattern Demo***");
        Director director = new Director();

        Builder fordCar = new Car("Ford");
        Builder hondaMotoCycle = new MotoCycle("Honda");

        //Making car
        director.construct(fordCar);
        Product p1 = fordCar.getVehicle();
        p1.showProduct();

    }
}
