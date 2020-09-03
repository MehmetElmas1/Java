package Review;


public class CapitalLetters {
    public static void main(String[] args) {

        String mysentence = " It is Time To Begin Working For Life";
        FindCapital(mysentence);
    }


    public static void FindCapital (String sentence) {
        int counter = 0;

        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i)>64 && sentence.charAt(i)<92){
                counter++;
            }
        }
        System.out.println(" Total there are " + counter+ "  capital letters");
    }

    public static int countAllCapitals (String sentence){
        int numberofCapitals =0;
        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i)>64 && sentence.charAt(i)<92){
            }
        }
        return numberofCapitals;
    }
}
