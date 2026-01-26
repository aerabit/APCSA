package FRQ;

public class Movie {
        private String title;

    private String studio;

    private int rating;

    private double length;

    private static int numMovies = 0;

    public Movie(String theTitle, String theStudio, int theRating, double theLength) {

        title = theTitle;

        studio = theStudio;

        rating = theRating;

        length = theLength;

        numMovies++;

    }

    public Movie(String theTitle) {

        title = theTitle;

        studio = "Unknown";

        length = 0;

        rating = 0;

        numMovies++;

    }

    public void setRuntime(double theLength) {

        length = theLength;

    }

    public void setStudio(String theStudio) {

         studio = theStudio;

    }

    public void setRating(int theRating) {

        rating = theRating;

    }

    public double getLength() {

        return length;

    }

    public static int getNumMovies() {

        return numMovies;

    }

    public int getRating() {

        return rating;

    }

    public String toString() {

        String output = "The movie " + title + " by " + studio + " has a rating of " + rating + " and a runtime of " + length + " hours.";

        return output;

    }
}
