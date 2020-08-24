package secondpackage;

public class vowelsWhile {
    public static void main(String[] args) {
        String sentence = "Sunday is fun day";
        //System.out.println(sentence.length()); bu da cumle deki karakter sayisini verir
        //unutma boslukta bir karekter.
        int index = 0;
        while (index < sentence.length()) {
            // index++ si bursy yazarsam, yine sonsuz donguye neden olur
            System.out.println(sentence.charAt(index));
            if (sentence.charAt(index) != 'u' || sentence.charAt(index) != 'a' || sentence.charAt(index) != 'i') {
                System.out.println(sentence.charAt(index));
                index++;
            }
        }
    }
}
