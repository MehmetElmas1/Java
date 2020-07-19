package javaClass;

public class seasons3 {
    public static void main(String[] args){
        int temperature = 15;
        if(temperature > 60){
            System.out.println("Summer");
        }
        else if(temperature > 40){
            System.out.println("Spring");
        }
        else if(temperature > 20){
            System.out.println("Fall");
        }
        else {
            System.out.println("Winter");
        }
    }
}
