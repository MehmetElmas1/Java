package methodsandlibraries;

public class ShowMenu {
    public static void main(String[] args) {
        showMenu();

    }

    public static void showMenu() {

        System.out.println("\t\tMENU\n                 ");
        System.out.println("\tSoups\n                ");
        System.out.println("Lentil\t\t$3.99");
        System.out.println("Tomato\t\t$4.99");
        System.out.println("Fish\t\t$8.99");
        System.out.println("\tMeals\n_________________");
        System.out.println("Rice\t\t$3.99");
        System.out.println("Chicken\t5.99");
        System.out.println("Beef\t\t$7.99");
        System.out.println("\tSalads\n_________________");
        System.out.println("Piyaz\t\t$2.99");
        System.out.println("Side\t$3.99");
    }

    public static void printRecipts(int soup, int meal, int salad) {
        double total = 0;
        System.out.println("\t\t-----RECIEPT----");
        if (soup == 1) {
            System.out.println(" Lentil :\t\t$3.99 ");
            total += 3.99;
        }
        else if (soup == 2) {
            System.out.println(" Tomato:\t\t$4.99");
            total += 4.99;
        }
        else {
            System.out.println("Fish:\t\t$8.99");
            total += 8.99;
        }

        if (meal == 1) {
            System.out.println("Rice :\t\t$3.99");
            total += 3.99;
        }
        else if (meal == 2) {
            System.out.println("Chicken :\t\t\t$5.99");
            total += 5.99;
        }
        else {
            System.out.println("Beef :\t\t$7.99");
            total += 7.99;
        }
        if (salad == 1) {
            System.out.println("Piyaz :\t\t$2.99");
            total += 2.99;
        }
        else {
            System.out.println("Side :\t\t$3.99");
            total += 3.99;

        }
        System.out.println(" ____________\n" +"\t\t\t$"+ total);
    }
}

