package Udprojects;

public class Televizyon1{
    int kanal;
    int sesSeviyesi;
    boolean acik;

    public void ac(){
        System.out.println("Televizyon aciliyor");
        acik = true;
    }

    public void kapat(){
        System.out.println("Televizyon Kapaniyor");
        acik = false;
    }

    public void goster(){
        System.out.println("Tv acik :" + acik +" Kanal no" + kanal + " Ses seviyesi" + sesSeviyesi );
    }
}

