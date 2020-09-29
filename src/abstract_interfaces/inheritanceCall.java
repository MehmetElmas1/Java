package abstract_interfaces;

public class inheritanceCall {

    private static int additionPrivateStatic(int a, int b){
        return a+b;
    }

    public static int additionPublicStatic( int a, int b){
        return a+b;
    }
     private int additionPrivate(int a, int b){
        return a+b;
}

     public int additionPublic (int a, int b){
        return a+b;
}
}
class AdditionTest{
    public static void main(String[] args) {
        inheritanceCall adds1 = new inheritanceCall();
        inheritanceCall adds2 = new inheritanceCall();
        System.out.println(adds1.additionPublic(1,4));
        System.out.println(inheritanceCall.additionPublicStatic(5,7));
    }

}