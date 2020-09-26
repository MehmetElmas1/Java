package abstract_interfaces;

public class Encap {
    private int a;
    private int b;
    private int c;

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
}
class EncapTest{
    public static void main(String[] args) {
        Encap e = new Encap();
        e.setA(5);
        System.out.println(e.getA());
    }
}
