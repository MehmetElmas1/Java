package UdemyJava;

public class ProtectedKullanimi {

    protected int number;
    protected void protectedMethod(){

    }
    protected class innerProtectedClass{

    }
}

class G extends ProtectedKullanimi{

    @Override
    protected void protectedMethod() {
        super.protectedMethod();
        System.out.println(number);
    }
}