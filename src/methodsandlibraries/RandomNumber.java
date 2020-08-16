package methodsandlibraries;

public class RandomNumber {
    public static void main(String[] args) {

        generatePass();
    }




    public static void generatePass() {
        for (int a=0; a<6; a++) {
            System.out.print((int)(Math.random()*10));
        }
    }
}
