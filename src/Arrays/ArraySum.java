package Arrays;



public class ArraySum {
    public static void main(String[] args) {
        int[] myNumbers = {1000, 2000, 3000, 4000, 5000, 6000, 7000, 8, 9, 1};
        int sum = 0;

        for (int i = 0; i < myNumbers.length; i++) {
            sum += myNumbers[i];
        }
        System.out.println(sum);
    }


}

