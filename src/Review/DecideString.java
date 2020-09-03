package Review;


public class DecideString {
    public static void main(String[] args) {
        String personalStentence= "This is my Java Class Activities, Do not lose your Hope, You will Learn";
        decideString(personalStentence);

    }


public static void decideString (String sentence){
        int numCapitals = CapitalLetters.countAllCapitals(sentence);
        if( numCapitals>4){
            System.out.println("Okay");
        }
        else{
            System.out.println(" Not Okay");
        }
}

}
