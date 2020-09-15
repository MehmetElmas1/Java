package methodsandlibraries;
import java.util.Scanner;
public class ShowMenuTest {
    public static void main(String[] args) {
        ShowMenu.showMenu();
        Scanner myScanner = new Scanner(System.in);
        System.out.println(" Please choose your Soup (1- Lentil, 2- Tomato, 3- Fish");
        int soup = myScanner.nextInt();
        System.out.println(" Chose your Meals (1-Rice, 2- Chicken 3- Beef");
        int meal= myScanner.nextInt();
        System.out.println(" Chose your Salads (1-Piyaz, 2- Side Salad");
        int salad= myScanner.nextInt();

        ShowMenu.printRecipts(soup,meal,salad);

    }


}
