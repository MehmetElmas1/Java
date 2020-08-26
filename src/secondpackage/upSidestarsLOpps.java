package secondpackage;

public class upSidestarsLOpps {

    public static void main(String[] args) {
        for (int a = 0; a < 10; a++) { //bu dis loop yapisi icin, ve boslugu


            for (int b = 0; b < 10-a; b++) { // bu ic loopta her iki yanda olan boslukklar icin (stalarin yaninda) ic loopta
                System.out.print(" ");
            }

            for (int c = 0; c <=2*a-1; c++) { /// bu da ic loopta starlar icin olan looop
                System.out.print("*");

            }
            System.out.println();
        }
    }
}
