package secondpackage;

public class NestedLoops2 {
    public static void main(String[] args) {
        int number=1;
        int counter;
        while(number<10){
            counter=0;
            while(counter<10){
                System.out.println(number+ "" +counter);
                counter++;
            }
            number++;
        }
    }
}
