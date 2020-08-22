package Arrays;
// create random int  array and print all elements using for each loop
//// create random String array and print all elements using for each loop

public class RandomArrayForEach {

    public static void main ( String[] args ) {
        int[] arrayNumbers= new int[10];
        for( int i=0; i<arrayNumbers.length; i++){
            arrayNumbers[i]= (int)(Math.random()*10);

        }
        for (int number: arrayNumbers) {
            System.out.println(number);
        }

    }
}

