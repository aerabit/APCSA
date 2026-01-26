package FRQ;

public class MovieTester {
       public static void main(String[] args) {

        Movie movie1 = new Movie("Star Wars", "Lucasfilms", 13, 2.5);

        Movie movie2 = new Movie("Lord of the Rings");

        Movie movie3 = new Movie("Back to the Future", "Universal", 13, 2.5);

        movie1.setRating(17);

        movie3.setRuntime(2.25);

        movie2.setStudio("New Line Cinema");

        System.out.println(movie1.getLength());

        System.out.println(movie2.getRating());

        System.out.println(movie3.getLength());

        System.out.println("Number of movie instances: "+ Movie.getNumMovies());

        System.out.println(movie1);

        System.out.println(movie2);

        System.out.println(movie3);
    }
}