package secondpackage;
import java.util.Scanner;
public class MultiplesFives {
    public static void main(String[] args) {
        Scanner myScan =new Scanner (System.in);
        System.out.println("Enter start number: ");
        int start = myScan.nextInt();
        System.out.println("Enter end number");
        int end =myScan.nextInt();

        if (start<end){
            for(int i=start ; i<=end ; i=i+5) {
                System.out.println(i);
            }
        }
        else {
            for(int i=end ; i>-start ; i=i+5) {
                System.out.println(i);
            }
        }
    }
}
