package io.github.thboy._1_SingletonPattern.LazyInitialization;

/**
 *
 */
final class Captain {
    private static Captain captain;

    private Captain(){};

    public static synchronized Captain getCaptain(){

        //Lazy initialization
        if(captain == null){
            captain = new Captain();
            System.out.println("this is a new Captain ");
        }else{
            System.out.println("the Captain has been created");
        }
        return captain;

    }
}

public class SingletonExample{

    public static void main(String[] args) {

        Captain.getCaptain();
        Captain.getCaptain();

    }
}

