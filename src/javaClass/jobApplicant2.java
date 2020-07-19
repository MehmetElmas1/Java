package javaClass;

public class jobApplicant2 {
    public static void main(String[] args){
        int age = 35;
        int javaPoint = 90;
        if((age >= 20 && age <= 30) && javaPoint >=80){
            System.out.println("Your score is : " + (age * 1.5 + javaPoint * 4.5) );
        }
        else if((age >= 20 && age <= 30) && javaPoint < 80){
            System.out.println("Your score is : " + (age * 1.5 + javaPoint * 3.5));
        }
        else if(age > 30 && javaPoint >= 80){
            System.out.println("Your score is : " + (age * 1.1 + javaPoint * 4.5) );
        }
        else if (age > 30 && javaPoint < 80){
            System.out.println("Your score is : "+ (age * 1.1 + javaPoint * 3.5));
        }
        else {
            System.out.println("Wrong parameter");
        }


    }
}
