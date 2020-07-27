package io.github.thboy._4_FactoryPattern;

/**
 * GoF Definition : Define an interface for creating an object,but let subclasseds decide which class to
 * instantiate. Factory method lets a class defer instantiation to subclassed.
 * 工厂模式使其创建过程延迟到子类进行
 */
interface Animal{
    void speak();
    void preferredAction();
}

class Dog implements Animal{
    public void speak(){
        System.out.println("Dog says: Bow-Wow");
    }
    public void preferredAction(){
        System.out.println("Dogs prefer barking ..." +
                "n");
    }
}

class Tiger implements Animal{
    public void speak(){
        System.out.println("Tiger says : halum");
    }
    public void preferredAction(){
        System.out.println("Tiger prefer hunting...\n");
    }
}

abstract class AnimalFactory{
    public abstract  Animal createAnimal();
}

class DogFactory extends AnimalFactory{
    public Animal createAnimal(){
        //creating a Dog
        return new Dog();
    }
}

class TigerFactory extends AnimalFactory{
    public Animal createAnimal(){
        //creating a Tiger
        return new Tiger();
    }
}

public class FactoryMethodPatternExample {

    public static void main(String[] args) {
        System.out.println("***Factory patter demo***\n");
        //creating a tiger Factory
        AnimalFactory tigerFactory = new TigerFactory();
        //Cretating a tiger using the Factory method
        Animal aTiger = tigerFactory.createAnimal();
        aTiger.speak();
        aTiger.preferredAction();


        //creating a dog
        DogFactory dogFactory = new DogFactory();
        Animal aDog = dogFactory.createAnimal();
        aDog.speak();
        aDog.preferredAction();
    }

}
