package inheritance;

import java.util.ArrayList;
import java.util.LinkedList;

public class Theater implements Reviewable{
    String name;
    LinkedList<String> movies = new LinkedList<String>();
    public LinkedList<Review> theaterReviews = new LinkedList<>();


    public Theater(String name) {
        this.name = name;
    }

    public void addMovie(String movieName){
        this.movies.add(movieName);
    }

    public void removeMovie(String movieName){
        this.movies.remove(movieName);
    }

    @Override
    public String toString() {
        return "Theater{" +
                "name='" + name + '\'' +
                ", movies=" + movies +
                '}';
    }

    @Override
    public void addReview(Review review) {
        // add review to the end of the list in the constructor
        this.theaterReviews.add(review);
    }
//    public void addReview(Review review, String movieName) {
//        // add review to the end of the list in the constructor
////        review = review+;
//        review = (Review) Review.toStringfilm();
//        this.theaterReviews.add(Review.toStringfilm());
//
//    }
}
