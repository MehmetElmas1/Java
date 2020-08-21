package secondpackage;

public class MyForWhileLoop {
    public static void main(String[] args) {
        int number =1;
        int counter;

        for (int i=1; i<4 ; i++) {
counter=1;
            while(counter<6
            ){
                System.out.print(number + "\t");
                counter++;
                number++;
            }
            System.out.println();
        }
    }
}
