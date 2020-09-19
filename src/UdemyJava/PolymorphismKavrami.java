package UdemyJava;

public class PolymorphismKavrami {

}
class Hayvan {
    private int ayakSayisi;

    public int getAyakSayisi() {
        return ayakSayisi;
    }

    public void setAyakSayisi(int ayakSayisi) {
        this.ayakSayisi = ayakSayisi;
    }

    public void adiniSoyle() {
        System.out.println("Ben hayvan sinifi nesnesiyim");
    }

    class Kopek extends Hayvan {
        private String Tur;

        public Kopek(String tur) {
            setAyakSayisi(4);
            setTur("Golden");
        }

        public String getTur() {
            return Tur;
        }

        public void setTur(String tur) {
            Tur = tur;
        }

        @Override
        public void adiniSoyle() {
            super.adiniSoyle();
            System.out.println("Ben bir kopek nesnesiyim");
        }
    }

}
class Kopek extends Hayvan{}
class Kedi extends Hayvan{
    private String cins;

    public Kedi(String cins){
        setAyakSayisi(4);
        setCinsi(cins);
    }
    public String getCins() {
        return cins;
    }

    public void setCinsi(String cins) {
        this.cins = cins;
    }
}