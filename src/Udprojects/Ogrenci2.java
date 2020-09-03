package Udprojects;

public class Ogrenci2 {

    int ogrenciNo;
    String isim;
    byte sinif;
    boolean aktif;

    ///burasi constructor metodu, sitem bunu otomatik olarka da cagirir//
    public Ogrenci2(){
        System.out.println(" Ogrenci nesnesi olusturuluyor");
        aktif= true;
        ogrenciNo=0000;
        isim= "henuz isim verilmemis";
        sinif= 127;
    }
    public Ogrenci2(int ogrenciNo, String isim, byte sinif, boolean aktif){

    }

    public void derAl(){
        System.out.println("Ogenci dersi aliyor");
    }
    public void ogrenciBilgileriniYazdir(){
        if(aktif){
            System.out.println("Adi: "+ isim + " numara: " + ogrenciNo+  " sinifi: " + sinif);
        }
        else{
            System.out.println("Bu ogrenci aktif degil");
        }
    }
}
