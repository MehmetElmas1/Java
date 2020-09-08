package UdemyJava;

public class Televizyon {private int kanal;
    private int sesSeviyesi;
    private boolean acik;

    public void ac(){
        if(acik==false){
            System.out.println("Televizyon aciliyor");
            acik = true;
        } else{
            System.out.println("Televizyon zaten acik");
        }
    }

    public void kapat(){
        if(acik) {

            System.out.println("Televizyon Kapaniyor");
            acik = false;
        }
        else {
            System.out.println(" Televizyon zaten kapatiliyor");
        }
    }

    public void setKanal( int yeniKanal) {
        if(acik && yeniKanal >0 && yeniKanal <500 ){
            kanal = yeniKanal;
        }
        else {
            System.out.println(" TV kapali veya yanlis deger girdiniz");
        }
    }

    public int getKanal() {
        return kanal;
    }

    public int getSesSeviyesi() {
        return sesSeviyesi;
    }

    public void setSesSeviyesi(int sesSeviyesi) {
        if(acik && sesSeviyesi>0 && sesSeviyesi<20 ){
            this.sesSeviyesi = sesSeviyesi;
        } else {
            sesSeviyesi = 1;
        }
    }


    public void goster(){
        System.out.println("Tv acik :" + acik +" Kanal no" + kanal + " Ses seviyesi" + sesSeviyesi );
    }
}
