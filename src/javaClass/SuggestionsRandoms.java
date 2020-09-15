package javaClass;
public class SuggestionsRandoms {
    public static void main(String[] args) {
        preferFoodRondomly();
        preferClothRandomly();
    }

    public static void preferFoodRondomly() {
        int choice = (int) (Math.random()*3) +1;
        if (choice ==1) {
            System.out.println("Drink Soup");
        }
        else if (choice ==2) {
            System.out.println("Eat Hamburger");
        }

        else{
            System.out.println("Enjoy Salad");
        }
    }
    public static void preferClothRandomly() {
        int selection = (int) (Math.random() *3) +1;
        if (selection ==1) {
            System.out.println("Red Shirt");
        }

        else if(selection ==2) {
            System.out.println("Blue Jean");
        }
        else {
            System.out.println("White Hat");
        }
    }
}
