package secondpackage;

public class StarForWhile {
    public static void main(String[] args) {
        for(int i=1; i<=16; i++){
            for(int j=1; j<i;j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}

