package secondpackage;

import java.util.Scanner;
public class ScienceSkills {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Please enter your skill set (Java/SQL/Cloud)");
        String answer = myScan.next();
        if(answer.equalsIgnoreCase("java")) {
            System.out.println("Please enter QA score");
            int javascore = myScan.nextInt();
            if (javascore >= 80) {
                System.out.println("GOOD score");

            } else {
                System.out.println("You should improve your score");
            }
        }

        else if(answer.equalsIgnoreCase("SQL")) {
            System.out.println("What is your hrank score?");
            int hackerrankScore = myScan.nextInt();
            if (hackerrankScore < 50)
            {
                System.out.println("resolve your issues");
            }
            else if(hackerrankScore<80) {
                System.out.println("Nice");


            }
            else {
                System.out.println("Perfect");
            }

        }
        else if(answer.equalsIgnoreCase("ClouD")){
            System.out.println("Do your have certification Y/N");
            String certification = myScan.next();
            if(certification.equalsIgnoreCase("Y")) {
            System.out.println("Ok");
            }
            else if (certification.equalsIgnoreCase("N")) {
                System.out.println("Not Okay");
            }
            else {
                System.out.println("apply for certification");
            }
        }

        else {
            System.out.println("Only Java/SQL/Cloud");
        }
    }
}
