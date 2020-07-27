package io.github.thboy._3_BuilderPattern.demo1;

public class Car implements Builder{
    private String brandName;
    private Product product;

    @Override
    public void insertWheels() {
        System.out.println("4 wheels are added");
    }

    @Override
    public void addHeadLights() {
        System.out.println("2 Headligts are added");
    }

    @Override
    public void startUpOperations() {
        //Nothing in this case
        product.add(String.format("Car model is :%s",this.brandName));
    }

    @Override
    public void buildBody() {
        product.add("This is a body of a car");
    }

    @Override
    public void endOperations() {
         //Nothing in this case
    }

    @Override
    public Product getVehicle() {
        return product;
    }

    public Car(String brand){
        product = new Product();
        this.brandName = brand;
    }


}
