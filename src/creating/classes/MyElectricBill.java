package creating.classes;

public class MyElectricBill {
//attributies
    int memberID;
    int counter;
    String name;
    double billAmount;


    ///construtor

    public MyElectricBill( int memberID, int counter, String name, double billAmount ){
        this.memberID= memberID;
        this.counter= counter;
        this. name = name;
        this.billAmount= billAmount;


    }
///methods
    @Override
    public String toString() {
        return "MyElectricBill :  \n" +
                "memberID= \t" + memberID +
                ", counter=\t" + counter +
                ", name='\t" + name + '\'' +
                ", billAmount=\t" + billAmount;
    }
}
