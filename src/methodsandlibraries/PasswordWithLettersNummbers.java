package methodsandlibraries;

public class PasswordWithLettersNummbers {
    public static void main(String[] args) {

        int count=0;
        do {
            generatePss();
            System.out.println();
            count++;

        }
        while(count<5);


    }



    public static void generatePss(){

        for (int i=0; i<3; i++) {
            System.out.print((char) (int)(Math.random()*26+97));
        }
        for(int i=0; i<3; i++) {
            System.out.print((int) (Math.random()*10));
        }
    }
}
