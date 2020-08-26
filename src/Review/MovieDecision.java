package Review;

public class MovieDecision {
    public static void main(String[] args) {
        decideMovie(7.5, 80500,200000);

    }
    public static void decideMovie ( double imdb, int totalVotes, double boxOffice) {
        if(totalVotes/boxOffice>10){
            System.out.println("Watch the movie");
        }
        else {
            System.out.println("Do not watch the movie");
        }
    }
}
