package MyReview;

import java.util.Scanner;

public class MixInoutQuestions {
    public static void main(String[] args) {
        System.out.println("What is your age?");
        int age;
        Scanner MyScanner = new Scanner(System.in);
        age =MyScanner.nextInt();
        System.out.println(" What is your Name:");
        String name;
        name=MyScanner.next();
        System.out.println("What is your Weight?");
        float weight;
        weight=MyScanner.nextFloat();
        System.out.println("Your age is"+age+"your name is: "+name+"your weight is : "+weight);
    }


}
