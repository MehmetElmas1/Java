package Review;

public class CitiesNames {
    public static void main(String[] args) {
        String[][] myCities = createRandimCities(4, 3);
        PrintCitiesA(myCities);
        printCitiesReversed(myCities);
        printAtoH(myCities);
    }

    public static String[][] createRandimCities(int rows, int cols) {
        String[] cities = {"Ann Arbor", "Fort Worth", "Fairfax", "Orlando",
                "Denver", "Portland", "Phoneix", "Arlington", "Atlanta",
                "Amarillo", "Boulder", "Chicago", "Albany"};
        String[][] randomCities = new String[rows][cols];
        int index;
        for (int i = 0; i < randomCities.length; i++) {
            for (int j = 0; j < randomCities[i].length; j++) {
                randomCities[i][j] = cities[(int) (Math.random() * cities.length)];

            }
        }
        return randomCities;
    }

    public static void PrintCitiesA(String[][] cities) {
        for (String[] row : cities) {
            for (String city : row) {
                if (city.charAt(0) == 65) {
                    System.out.println(city);
                }
            }
        }
    }

    public static void printCitiesReversed(String[][] cities) {
        for (String row[] : cities) {
            for (String city : row) {
                System.out.println(reverseString(city));
            }
        }
    }

    public static String reverseString(String text) {
        String reversed = "";
        for (int i = text.length() - 1; i >= 0; i--) {
            reversed = reversed + text.charAt(i);
        }
        return reversed;
    }
    public static void printAtoH(String[][] cities){
        for(String[]citiesRow:cities){
            for(String city:citiesRow){
                if(city.charAt(0)>='A'&& city.charAt(0)<='H'){
                    System.out.println(city);
                }
            }
        }
    }
}
