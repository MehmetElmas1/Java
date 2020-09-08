package UdemyJava;

public class TelevizyonTest {
    public static void main(String[] args) {

        Televizyon tv= new Televizyon();
        tv.ac();
        tv.setSesSeviyesi(800);
        tv.setKanal(20);

        tv.kapat();

        tv.goster();

    }
}
