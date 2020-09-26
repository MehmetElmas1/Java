package UdemyJava;

public class OopGirisKavramlar {
    public static void main(String[] args) {
        int sayi = 1;
        Ogrenci emre = new Ogrenci();
        int[] sayilar=new int[50];
        sayilar[0] =1;
        int[] sayilarinHepsi = {5,6,9,7};

        emre.isim = "Emre altunbilek";
        emre.sinif =9;
        emre.ogrenciNo = 292;
        emre.aktif = true;

        emre.ogrenciBilgileriniYazdir();

        Ogrenci hasan = new Ogrenci();
        hasan.isim = "hasan ziya";
        hasan.sinif= 12;
        hasan.ogrenciNo=185;

        hasan.ogrenciBilgileriniYazdir();

        Ogrenci bos= new Ogrenci();
        bos.ogrenciBilgileriniYazdir();

        emre = hasan;
        System.out.println("Emre nin bilgilerini yazdiracak");
        emre.ogrenciBilgileriniYazdir();

        System.out.println("Hasan in bilgilerini yazdiracak");
        hasan.ogrenciBilgileriniYazdir();
//burda emreni verilerini hasana esitledi //

        Ogrenci ogr1 = new Ogrenci();
        Ogrenci ogr2 = new Ogrenci(5);
        Ogrenci ogr3 = new Ogrenci(5,"ogr3");
        Ogrenci ogr4 = new Ogrenci(5,"ogr3");


    }
}
