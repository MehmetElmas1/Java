package Review;
/// Remove space in sentence entered

public class SpaceRemoving {
    public static void main(String[] args) {
        removeSpacesVoid("Can you see that the spaces were removed by a method ?");
    }

    public static void removeSpacesVoid(String sentence){
        for(int i=0; i<sentence.length(); i++){
            if(sentence.charAt(i)!=' '){
                System.out.print(sentence.charAt(i));
            }
        }
    }
}
