package MyReview;
import java.util.Scanner;
public class KeyboardInput {
    public static void main(String[] args){
        Scanner myKeyboard = new Scanner(System.in);
        System.out.println("Please enter any number:");
        int userInput;
        userInput = myKeyboard.nextInt();
        System.out.println("your number is :"+userInput);
    }
}


