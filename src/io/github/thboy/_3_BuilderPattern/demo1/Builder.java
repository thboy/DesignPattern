package io.github.thboy._3_BuilderPattern.demo1;

public interface Builder {
    void startUpOperations();
    void buildBody();
    void insertWheels();
    void addHeadLights();
    void endOperations();
    /** The following methond is used to retrieve the object that is construted*
     */
    Product getVehicle();
}
