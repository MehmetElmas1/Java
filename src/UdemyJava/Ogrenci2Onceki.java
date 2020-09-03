package UdemyJava;

public class Ogrenci2Onceki {
    int ogrenciNo;
    String isim;
    byte sinif;
    boolean aktif;

    ///burasi constructor metodu, sitem bunu otomatik olarka da cagirir//
    public Ogrenci2Onceki(){
        System.out.println(" Ogrenci nesnesi olusturuluyor");
        aktif= true;
        ogrenciNo=0000;
        isim= "henuz isim verilmemis";
        sinif= 127;
    }
    ///burasi overloading ornegi, sistem ayni parametleri nasil ayirt eder, ve bunun yontemi//
    public Ogrenci2Onceki(int ogrenciNo, String isim, byte sinif, boolean aktif){
        this.ogrenciNo = ogrenciNo;
        this.isim= isim;
        this.sinif= sinif;
        this.aktif= aktif;
    }
    public Ogrenci2Onceki(String isim){
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
