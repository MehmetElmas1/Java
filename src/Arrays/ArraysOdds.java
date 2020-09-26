package Arrays;


public class ArraysOdds {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 3, 4, 5, 6, 7, 8, 9, 11};
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            if (numbers[i] % 2 == 1) {
                sum = sum + numbers[i];
            }
        }
        System.out.println(" Sum of odd numbers: " + sum);


        int counterLine = 0;
        for (int i = 0; i <numbers.length; i++){
            if(numbers[i]%2==0){
                counterLine++;
            }
        }
        System.out.println("Total number of odd Numbers: " + counterLine);
    }
}

