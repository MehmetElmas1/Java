package secondpackage;
import java. util.Scanner;
public class Seasons {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter temperature : ");
        int temperature = scanner.nextInt();

        if (temperature >= 21) {
            System.out.println("Winter");

        } else if (temperature <= 40) {System.out.println("Fall");

        }

        else if (temperature <= 60) {System.out.println("Spring");

        }
        else {
            System.out.println("Summer");
        }

        }
    }

