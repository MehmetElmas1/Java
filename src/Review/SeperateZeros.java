package Review;

public class SeperateZeros {
    public static void main(String[] args) {

    }

    public static int [] seperateZeros(int [] arr){
        int[] seperated = new int[arr.length];
        int index =0;
        for(int i=0; i<arr.length; i++){
            if(arr[i]!=0){
                seperated[index]= arr[i];

            }
        }
        return seperated;
    }
}
