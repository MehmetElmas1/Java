package Udprojects;

public class Ogrenci4 {
    int ogrenciNo;
    String isim;
    byte sinif;
    boolean aktif;

    ///burasi constructor metodu, sitem bunu otomatik olarka da cagirir//
    public Ogrenci4(){
        System.out.println(" Ogrenci nesnesi olusturuluyor");
        aktif= true;
        ogrenciNo=0000;
        isim= "henuz isim verilmemis";
        sinif= 127;
    }
    ///burasi overloading ornegi, sistem ayni parametleri nasil ayirt eder, ve bunun yontemi//
    public Ogrenci4(int ogrenciNo, String isim, byte sinif, boolean aktif){
        this.ogrenciNo = ogrenciNo;
        this.isim= isim;
        this.sinif= sinif;
        this.aktif= aktif;
    }
    public Ogrenci4( String isim){
        this.isim= isim;
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
