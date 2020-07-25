package io.github.thboy._1_SingletonPattern.EarlyInitialization;

public class Captain {
    //EarlyInitialization
    private static final Captain captain = new Captain();

    private Captain(){};

    //global point access
    public static Captain getCaptain(){
        System.out.println("This is you captain");
        return captain;
    }
}
