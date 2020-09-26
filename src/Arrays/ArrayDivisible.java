package Arrays;

public class ArrayDivisible {
    public static void main(String[] args) {
     int[][] numbers = TenByTenArray.generateArray(10);
        printDivisible(numbers);
    }

    public static void printDivisible (int [][] myarrays) {
        for(int a =0; a< myarrays.length; a++){
            int divisibleValue=0;
            for(int b=0; b<myarrays.length; b++) {
                divisibleValue= myarrays[a][b]%2;
            }
            System.out.println(divisibleValue);
        }
    }
}

