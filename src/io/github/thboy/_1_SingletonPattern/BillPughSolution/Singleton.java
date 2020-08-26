package io.github.thboy._1_SingletonPattern.BillPughSolution;

//Bill Pugh came up with a different approach using a stati nested helper class
class Singleton{
private  Singleton(){}

private static class LazySingleton{
    public static Singleton singleton = new Singleton();
}

    public static Singleton getInstance(){
        return LazySingleton.singleton;
    }
}