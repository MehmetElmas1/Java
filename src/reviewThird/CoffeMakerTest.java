package reviewThird;

public class CoffeMakerTest {
    public static void main(String[] args) {
        CoffeMaker myMaker = new CoffeMaker(6);
        System.out.println(myMaker.toString());
        myMaker.setTimer(20);
        System.out.println(myMaker.getTimer());

        myMaker.brewCoffee();

        myMaker.brewCoffee();


    }
}
