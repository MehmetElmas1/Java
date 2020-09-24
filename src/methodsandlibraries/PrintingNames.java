package methodsandlibraries;

public class PrintingNames {
    public static void main(String[] args) {
        System.out.println("My name is Mes1");
        printMyName();
        printMyName3("Meh els 3");
        System.out.println(printMyName4("So your name is mes "));
    }

    public static void printMyName() {
        System.out.println("Mes2");

    }
    public static void printMyName3( String name){
        System.out.println("Mes3");
    }

    public static String printMyName4(String name){
        return name;
    }
}