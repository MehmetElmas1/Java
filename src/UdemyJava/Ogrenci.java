package UdemyJava;

public class Ogrenci {
    int ogrenciNo;
    String isim;
    byte sinif;
    boolean aktif;

    public Ogrenci(){

    }
    public Ogrenci(int ogrenciNo){
        this.ogrenciNo= ogrenciNo;
    }

    public Ogrenci(int ogrenciNo, String isim){
        this.ogrenciNo=ogrenciNo;
        this.isim=isim;
    }
    public Ogrenci( int ogrenciNo, String isim, Byte sinif, boolean aktif){
        this.ogrenciNo=ogrenciNo;
        this.isim=isim;
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
