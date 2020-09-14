package secondpackage;

import java.util.Scanner;
public class ScienceSkills2 {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Please enter your skill set (Java/SQL/Cloud)");
        String answer = myScan.next();
        if(answer.equalsIgnoreCase("java")){
        }

        else if(answer.equalsIgnoreCase("SQL")){

        }
        else if(answer.equalsIgnoreCase("ClouD")){

        }
        else {
            System.out.println("Only Java/SQL/Cloud");
        }
    }
}


