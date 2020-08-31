package secondpackage;

public class MyLoopNumbersLetters {
    public static void main(String[] args) {

   for (int i =1; i<6; i++) {
       for( char letter='a'; letter<'e'; letter++) {
           System.out.print(i+"\t" +letter+ "\t");
       }

       System.out.println();
   }


    }
}
