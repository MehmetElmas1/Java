package UdemyJava;

public class DefaultorPackage {

    int sayi =5;
    void metot(){

    }
}

class Yeni extends DefaultorPackage{
    @Override
    void metot() {
        super.metot();
        System.out.println(sayi);
    }
}