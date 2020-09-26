package UdemyJava;

public class kisiler {
    public static void main(String[] args) {

        Ogrenci ogr1 = new Ogrenci(5, "emre");
        Ogrenci ogr2 = new Ogrenci(3, "hasan");
        Ogrenci ogr3 = new Ogrenci(7, "ayse");

        Ogrenci[] ogrenciler = {ogr1, ogr2, ogr3};
        System.out.println("Dizi siralnmadan onceki hali");
        for (Ogrenci gecici : ogrenciler)
            System.out.println(gecici);
    }



        int id;
        String ad;

       public void Ogrenci(int id, String ad) {  //edit no void
           this.id = id;
           this.ad = ad;
       }

       @Override
        public String toString() {
            return "ad:" + ad+ "id:" + id;
        }
    }
