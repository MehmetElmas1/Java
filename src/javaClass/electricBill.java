package javaClass;

public class electricBill {
    public static void main(String[] args) {
    int consumption = 1200;
        if(consumption < 500){
        System.out.println("Your bill is : $"+consumption*0.3);
    }
        else if(consumption < 1000){
        System.out.println("Your bill is : $"+consumption*0.4);
    }
        else if(consumption < 2000){
        System.out.println("Your bill is : $"+consumption*0.5);
    }
        else {
        System.out.println("Your bill is : $"+consumption*0.6);
    }
}
}