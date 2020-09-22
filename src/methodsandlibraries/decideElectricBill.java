package methodsandlibraries;

public class decideElectricBill {
    public static void main(String[] args) {

        System.out.println(decideElectricBill(100
        ));

    }


    public static String decideElectricBill(int consuption) {
        String decison;
        if (consuption>=500 && consuption<=1000) {
            decison ="Good job";

        }
        else if (consuption>1000 && consuption<=1500) {
            decison = " Not bad";

        }
        else if (consuption>1500){
            decison = "Start save Energy";
        }
        else {
            decison = "Consuption is Wrong, bad usage";
        }
        return decison;
    }
}
