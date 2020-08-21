package Arrays;

public class minArray {
    public static void main(String[] args) {
        int arrayNumbers[] = { -3, 1,2,3,4,5,6,7,8,9,10,12,24};

    }
    static void findMin( int[] arr) {
        int min= arr[0];

        for( int i =0; i< arr.length; i++){
            if(arr[i]>min){

                min=arr[i];
            }
        }
        return ;
    }
}