package io.github.thboy._1_SingletonPattern.BillPughSolution;

//Bill Pugh came up with a different approach using a stati nested helper class
public class Captain1 {

    private Captain1(){
        System.out.println("A captain is elected for your team");
    }

    //Bill Pugh solution
    private static class SingletonHelper{
        /* Nested class is referenced afer getCadptain() is called*/
        private static final Captain1 captain = new Captain1();

        public static Captain1 getCaptain(){
            return SingletonHelper.captain;
        }
    }
}
