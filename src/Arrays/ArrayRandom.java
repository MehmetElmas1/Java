package Arrays;

public class ArrayRandom {
    public static void main(String[] args) {
        creatArrayRandoms(10);
    }


    public static void creatArrayRandoms( int n) {
        int arr [] = new int [n];
        for( int i =0; i<arr.length; i++) {
            arr[i] = 1000+ (int) (Math.random()*4000);
    }

        for( int i=0; i<arr.length;i++){
            System.out.println(arr[i]);
        }
    }

}



