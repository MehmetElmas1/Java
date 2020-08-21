package secondpackage;
import java.util.Scanner;
public class monthTotext {
    public static void main(String[] args) {
        Scanner mmScan= new Scanner(System.in);
        System.out.print("Please enter number:  ");
        int month = mmScan.nextInt();
        String monthText ="x";

        switch (month) {
            case 1:monthText :
            System.out.println("Jan");
            break;
            case 2: monthText:  System.out.println("Feb");
            break;
            case 3: monthText: System.out.println("March");
            break;
            default:
                System.out.println("only 1-3");
                break;

        }
    }
}
