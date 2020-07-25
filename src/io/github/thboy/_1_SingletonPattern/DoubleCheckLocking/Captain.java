package io.github.thboy._1_SingletonPattern.DoubleCheckLocking;

final class Captain {
    private static Captain captain;
    static int numberOfInstance = 0;
    private Captain(){
        numberOfInstance++;
        System.out.println("Number of instances at this moment ="+numberOfInstance);
    }
    public static Captain getCaptain(){
        if(captain == null){
            synchronized(Captain.class){
                if(captain == null){
                    captain = new Captain();
                    System.out.println("New captain is elected for your team");
                }else{
                    System.out.println("You already have a captain for your team");
                    System.out.println("Send him for the toss");
                }
            }
        }
        return captain;
    }


}
