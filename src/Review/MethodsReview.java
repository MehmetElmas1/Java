package Review;

public class MethodsReview {
    public static void main(String[] args) {
        addTwoDouble(3,4);

    }

    public static void addTwoIntVoid( int number1, int number2){
        System.out.println(number1+number2);
    }
    static int addTwo( int number1, int number2){
        return number1+number2;

    }

    public static void addTwoDoubleVoid( double number1, double number2){
        System.out.println(number1+number2);
    }
    public static double addTwoDouble(double number1, double number2){
        return number1+number2;
    }
}
