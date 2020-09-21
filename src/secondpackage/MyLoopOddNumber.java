package secondpackage;

public class MyLoopOddNumber {
    public static void main(String[] args) {
        int number =2;

        for(int i=1 ; i<5; i++){
            for(int j=1; j<10; j++){
                System.out.print(number + "\t");
                number+=2;
            }
            System.out.println();
        }

    }
}
