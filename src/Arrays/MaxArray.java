package Arrays;

public class MaxArray {
    public static void main(String[] args) {
      int arrayNumbers[] = {1,2,3,4,5,6,7,8,9,10,12,24};

    }
     static void findMax( int[] arr) {
        int max= arr[0];

        for( int i =0; i< arr.length; i++){
            if(arr[i]>max){

                max=arr[i];
            }
        }
        return;
    }
}
