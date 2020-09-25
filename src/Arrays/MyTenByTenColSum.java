package Arrays;
///print sum of cloums
public class MyTenByTenColSum {
    public static void main(String[] args) {
        int[][]numbers =TenByTenArray.generateArray(10);
        printSumOfColums(numbers);
    }

    public static void printSumOfColums(int[][] arr){
        for(int i=0; i<arr.length; i++){
            int sum=0;
            for(int j=0; j<arr.length; j++){
                sum= sum+arr[i][j];
            }
            System.out.println(sum);
        }
    }
}
