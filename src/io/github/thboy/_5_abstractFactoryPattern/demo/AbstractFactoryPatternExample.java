package io.github.thboy._5_abstractFactoryPattern.demo;

interface Dog{
    void speak();
    void preferredAction();
}

interface Tiger{
    void speak();
    void preferredAction();
}

//Types of Dogs-wild dogs and pet dogs
class WildDog implements Dog{
    @Override
    public void speak(){
        System.out.println("wild dog says loudly: Bow-Wow.");
    }

    @Override
    public void preferredAction(){
        System.out.println("Wild Dogs prefer to roam freely in jungles.\n");
    }
}

class PetDog implements Dog{
    @Override
    public void speak(){
        System.out.println("Pet Dog says softly : Bow - Wow");
    }

    @Override
    public void preferredAction(){
        System.out.println("Pet Dogs prefer to stay at home.\n");
    }
}

//Types of Tigers-wild tigers and pet tigers
class WildTiger implements Tiger{
    @Override
    public void speak(){
        System.out.println("Wild Tiger says loudly:halum");
    }
    @Override
    public void preferredAction(){
        System.out.println("wild Tigers prefer hunting in jungles.\n");

    }
}

class PetTiger implements Tiger{
    @Override
    public void speak(){
        System.out.println("Pet Tiger says softly: Halum");
    }
    @Override
    public void preferredAction(){
        System.out.println("Pet Tigers play in the animal circus.\n");
    }
}

//AbstractFactory
interface AnimalFactory{
    Dog createDog();
    Tiger createTiger();
}

//Contrete Factory-wild Animal Factory
class WildAnimalFactory implements AnimalFactory{
    @Override
    public Dog createDog(){
        return new WildDog();
    }
    @Override
    public Tiger createTiger(){
        return new WildTiger();
    }
}

//Concrete Factory-Pet Animal Factory
class PetaAnimalFactory implements AnimalFactory{
    @Override
    public Dog createDog(){
        return new PetDog();
    }

    @Override
    public Tiger createTiger(){
        return new PetTiger();
    }
}

//Client
public class AbstractFactoryPatternExample {

    public static void main(String[] args) {
        AnimalFactory myAnimalFactory;
        Dog myDog;
        Tiger myTiger;
        System.out.println("***Abstract Factory Pattern Demo***\n");
        //Making a wild dog through WildAnimalFactory();
        myAnimalFactory = new WildAnimalFactory();
        myDog = myAnimalFactory.createDog();
        myDog.speak();
        myDog.preferredAction();
        //making a wild Tiger through WildAnimalFactory
        myTiger = myAnimalFactory.createTiger();
        myTiger.speak();
        myTiger.preferredAction();
        System.out.println("****************");
        //making a pet dog through PetAnimalFactory
        myAnimalFactory = new PetaAnimalFactory();
        myDog = myAnimalFactory.createDog();
        myDog.speak();
        myDog.preferredAction();
        //making a pet tiger through PetAnimalFactory
        myTiger  = myAnimalFactory.createTiger();
        myTiger.speak();
        myTiger.preferredAction();
    }

}
