package UdemyJava;

public class OopGirisKavramlar4 {
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

        Ogrenci ayse= new Ogrenci(500, "ayse yilmaz",(byte)5, true);
        ayse.ogrenciBilgileriniYazdir();

        Ogrenci ali = new Ogrenci(123);
        ali.ogrenciBilgileriniYazdir();
        ali.aktif= true;
        ali.ogrenciBilgileriniYazdir();

        emre = hasan;
        System.out.println("Emre nin bilgilerini yazdiracak");
        emre.ogrenciBilgileriniYazdir();

        System.out.println("Hasan in bilgilerini yazdiracak");
        hasan.ogrenciBilgileriniYazdir();
//burda emreni verilerini hasana esitledi //
    }
}
