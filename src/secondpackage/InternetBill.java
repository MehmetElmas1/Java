package secondpackage;
import java.util.Scanner;
public class InternetBill {
    public static void main(String[] args) {
        Scanner iScan = new Scanner(System.in);
        System.out.println("Please enter skill name (Java, SQ,Cloud");
        String answer = iScan.next();
        if (answer.equalsIgnoreCase("java")) {
            System.out.println("Whst is your java score? (0-100)");
            int javascore = iScan.nextInt();

        }
        else if (answer.equalsIgnoreCase("SQL")) {

        }
    }
}

