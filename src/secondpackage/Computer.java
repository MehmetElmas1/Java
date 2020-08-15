package secondpackage;

import java.util.Scanner;

public class Computer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner ( System.in);
        System.out.print(" What size do you prefer? (S,M,L) : ");
        String size = scanner.next();

        if (size.equals("S")) {
            System.out.println("9.99");

        }
 else if (size.equals("M")) {
            System.out.println("10");
        }
 else {
            System.out.println("11");
        }
    }
}
