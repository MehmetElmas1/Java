package Arrays;

public class Commons {
    public static void main(String[] args) {
        int[] array1 ={1,2,3,4,5,6,1,2,3,4,5,6};
        int[] array2 ={4,9,3,55,11,9,4,4,66,1,4,6,9};
        findCommons(array1,array2);
    }

    public static void findCommons (int a[], int b[]) {
    for (int i=0; i<a.length; i++) {
        for(int j=0; j<b.length; j++){
            if(a[i]==b[j]){
                System.out.println(a[i]);
            }
        }
    }
    }
}
