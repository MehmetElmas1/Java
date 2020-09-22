package creating.classes;

public class ClassA {

    protected void printMessage(){
        System.out.println("Java is my love");
    }
}

class ClassB extends ClassA{
    protected void printMessage(){
        System.out.println("Java rocks");
    }
}

class Testclass{
    public static void main(String[] args) {
        ClassA a= new ClassA();
        ClassB b= new ClassB();
        a.printMessage();
        b.printMessage();
    }
}
