package methodsandlibraries;


public class RandomNumber2 {
    public static void main(String[] args) {
       /* int count = 0;
        while (count < 20) { //// burda diyor ki 20 den kucuk oldugu surece saydir, dondur artirarak++
            generatePass();
            count++;
        }*/

        String password= generatePassword();
        System.out.println(password);
    }





    public static void generatePass() { ///burasi metodun aciklmasi ve fonsiyonu
        for (int a=0; a<6; a++) {
            System.out.print((int)(Math.random()*10));
        }
        System.out.println();
    }
    public static String generatePassword() {
        String result="";
        for(int i=0; i<6;i++){
            result+=(int)(Math.random()*10);
        }
        return result;
    }
}