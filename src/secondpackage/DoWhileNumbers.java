package secondpackage;

public class DoWhileNumbers {
    public static void main(String[] args) {
        int number=1; // burada degiskeni tanimladik
        do{   // burda, once do while ile islme yaptik, sonra while ile dongu kosul surecini koyduk.
            System.out.println("number :" + number + " \tNumber *2 :" + number*2);
            number++;
        } while(number<21);
    } // bu }, do while dongsunun kapatmak icin
}

