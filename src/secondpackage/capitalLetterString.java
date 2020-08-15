package secondpackage;

public class capitalLetterString {
    public static void main(String[] args) {
       String sentence= " I never Forger to push my Codes to GitHub";
       char letter;

       for(int i=0; i< sentence.length(); i++) {
           if(sentence.charAt(i)>=97 && sentence.charAt(i)<+122) {
               System.out.print(sentence.charAt(i));

           }
       }

    }
}
