package UdemyJava;

public class YaziciSinif {
    private int privateDegisken =1;
    int defaultDegisken=2;
    protected int protectedDegisken =3;
    public int publicDegisken=4;

    private void privateMetot(){}
    void defaultMetot(){}
    protected void protectedMetot(){}
    public void publicMetot(){}

private class YazdirStringDizi{
       private void  stringDiziYazdir(String[] dizi){

           System.out.println(privateDegisken);
           System.out.println(defaultDegisken);
           System.out.println(protectedDegisken);
           System.out.println(publicDegisken);

           privateMetot();
           defaultMetot();
           protectedMetot();
           publicMetot();

           for (String gecici : dizi)
               System.out.println(gecici);
       }
}
}
