package methodsandlibraries;

public class ReverseString {
    public static void main(String[] args) {
        printReverse("Java");
        System.out.println(printReverseReturn("abcd"));
    }
    public static void printReverse(String str) {
        for (int i=str.length()-1; i>=0; i--){
            char letter= str.charAt(i);
            System.out.print(letter);
        }
    }
    public static String printReverseReturn(String str){
        String result= "";
        for (int i=str.length()-1; i>=0 ;i--) {
            result+=str.charAt(i);
        }
        return result;
    }

}
