package methodsandlibraries;
import java.util.Scanner;
public class Power {
    public static void main(String[] args) {
        Scanner myScan = new Scanner(System.in);
        System.out.print("Enter base number  ");
        int base = myScan.nextInt();
        System.out.print("Enter power number  ");
        int power= myScan.nextInt();

        System.out.println(Math.pow(base,power));
    }
}
