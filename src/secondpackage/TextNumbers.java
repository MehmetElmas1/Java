package secondpackage;
import java. util. Scanner;
public class TextNumbers {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.println("Please enter text as (one-ten)");
        String number= myScan.next();

        switch (number){
            case "one":
                System.out.println(1);
                break;
            case "two":
                System.out.println(2);
                break;
            case "three":
                System.out.println(3);
                break;
            default:
                System.out.println("Only 1-3");
                break;

        }
    }
}
