package creating.classes;

public class PrivateAttributes {

    private int a;
    private int b;
    private int c;

    public PrivateAttributes() {

        this.a =10;
        this.a =20;
        this.c =30;

    }

    public PrivateAttributes(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }



    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public int getC() {
        return c;
    }

    public void setC(int c) {
        this.c = c;
    }

    @Override
    public String toString() {
        return "PrivateAttributes{" +
                "a=" + a +
                ", b=" + b +
                ", c=" + c +
                '}';
    }
}
