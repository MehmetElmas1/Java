package javaClass;

public class seasons {
        public static void main(String[] args) {
            int temp = 35;
            if (temp >= 60){
                System.out.println("Summer");
            }
            else if ( temp >= 40){
                System.out.println("Spring");
            }
            else if (temp >= 20){
                System.out.println("Fall");
            }
            else{
                System.out.println("Winter");
            }
        }
    }