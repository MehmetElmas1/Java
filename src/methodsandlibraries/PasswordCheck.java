package methodsandlibraries;

public class PasswordCheck {
    public static void main(String[] args) {
        passCheck("abcde");
        passwordCheck2("fghl");
      isGoodPassword("");

    }
    public static void passCheck(String password){
        if(password.length()<6){
            System.out.println("Not Okay");
        }
        else {
            System.out.println("Okay");
        }
    }

    public static void passwordCheck2(String password){
        String result;
        if(password.length()<=6){
            result="okay";
        }
        else{
            result="Not okay ";

        }
    }

    public static boolean isGoodPassword(String password) {
        boolean result;
        if (password.length() < 6) {
            result = false;

        }
        else{
            result=true;
        }
        return result;
    }
}
