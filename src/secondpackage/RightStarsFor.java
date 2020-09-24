package secondpackage;

public class RightStarsFor {
    public static void main(String[] args) {
        for(int a=1 ; a<=10 ; a++){

            for(int b=10 ; b >=a; b--){ // for the spaces

                System.out.print("  ");
            }

            for(int c=1 ; c<=a ; c++){

                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

