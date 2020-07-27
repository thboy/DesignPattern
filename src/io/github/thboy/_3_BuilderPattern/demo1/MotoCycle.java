package io.github.thboy._3_BuilderPattern.demo1;

public class MotoCycle implements Builder{
    private String  brandName;
    private Product product;

    @Override
    public void insertWheels() {
        System.out.println("2 wheels are added");
    }

    @Override
    public void addHeadLights() {
        System.out.println("1 Headligts are added");
    }

    @Override
    public void startUpOperations() {
        //Nothing in this case
    }

    @Override
    public void buildBody() {
        product.add("This is a body of a MotoCycle");
    }

    @Override
    public void endOperations() {
        //Finishing up with brand name
        product.add(String.format("Motorcycle model is :%s",this.brandName));
    }

    @Override
    public Product getVehicle() {
        return product;
    }

    public MotoCycle(String brand){
        product = new Product();
        this.brandName = brand;
    }
}
