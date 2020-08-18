package secondpackage;

import java.util.Scanner;

public class MathVsArt {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println(" Please enter your course choice, Math or Art (M, A)");
        String choice = myScan.next();
        if (choice.equalsIgnoreCase("M")){
            System.out.println("Do you have a tutor ? Yes/No");
            String tutor = myScan.next();
            if (tutor.equalsIgnoreCase("y")) {
                System.out.println("Ok");
            } else if (tutor.equalsIgnoreCase("n")) {
                System.out.println("Study yoursef");
        }
            else {
            System.out.println("y or n");
        }
    }

        else if(choice.equalsIgnoreCase("A"))
        {
            System.out.println("Nice Choice");

        }
        else {
            System.out.println("Please only M or A");
        }

    }
}
