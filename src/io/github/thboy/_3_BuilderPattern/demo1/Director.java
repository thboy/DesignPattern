package io.github.thboy._3_BuilderPattern.demo1;

public class Director {
    Builder builder;
    //Director knows how to use the builder and swquence of steps.
    public void construct(Builder builder){
        this.builder = builder;
        builder.startUpOperations();
        builder.buildBody();
        builder.insertWheels();
        builder.addHeadLights();
        builder.endOperations();
    }
}
