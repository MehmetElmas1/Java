package secondpackage;
import java. util.Scanner;
public class electricBill {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.print("Enter consumption: ");
        int myConsumption = myScanner.nextInt();

        if ( myConsumption < 501) {
            System.out.println("$0.3");

        } else if (myConsumption <1001 ) {System.out.println("$0.4");

        }

        else if (myConsumption <2001) {System.out.println("$0.5");

        }
        else {
            System.out.println("$0.6");
        }

    }
}
