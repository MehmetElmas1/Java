package Arrays;

//Create Random int 2-dimensional array and print all elements
//Create Random 2-dimensional String  array and print all elements

public class ArrayNumbers {
    public static void main(String[] args) {
        int arrayNumbers[][] = {{0,0,0,0,0},{0,0,0,0},{0,0,0,0}};
        for(int i=0; i<arrayNumbers.length; i++){
            for(int j=0; j<arrayNumbers[i].length; j++) {
                arrayNumbers[i][j]= (int)(Math.random()*10);
            }
        }
        for (int numberArray[]:arrayNumbers){
            for(int number:numberArray){
                System.out.println(number);
            }
        }
        //Random String Array
        String [][] arrayWords =new String[4][7];
        for(int i=0; i<arrayWords.length; i++){
            for (int j=0; j<arrayWords[i].length; j++){
            }
        }
    }
}
