package javaClass;
import java.util.Scanner;
public class userInput {
    public static void main(String[] args){
        Scanner myScan = new Scanner(System.in); //object creation
        System.out.print("Enter a number : "); // inform user
        int number = myScan.nextInt(); // reading int data
        System.out.println("Your number is " + number );
    }
}
