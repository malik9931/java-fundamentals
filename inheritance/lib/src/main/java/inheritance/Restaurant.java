package inheritance;

import java.util.ArrayList;

public class Restaurant {
    private String name;
    private double starRating;
    private int priceCat;
    public ArrayList<Review> reviews = new ArrayList<>();;


    public Restaurant(String name  , int priceCat ){
        this.setName(name);
        this.setPriceCat(priceCat);

    }

    //----------------- Methods ---------------------------

    public void addReview(Review review){
        //To make sure the you are adding new review and not a duplicate.
        for (Review revInList:reviews){
            if(review.getBody() == revInList.getBody()){
                System.out.println("You made this Review before, Thank U");
                return;
            }

        }
        // add review to the end of the list in the constructor
        this.reviews.add(review);
        // update the restaurant review with getStarRating method.
        getStarsRating();

    }


//------------------------- Getter and Setter ------------------------
    // Name
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    //Stars
    public double getStarsRating() {
        int starSum = 0;
        // start at the head of the restaurant list and add up the stars
        for(Review r : this.reviews) {
            starSum += r.getNumOfStars();
        }
        // get the average rating: divide the number of stars by the number of reviews, and update constructor
        this.starRating = starSum / this.reviews.size();
        return starRating;
    }


    public void setPriceCat(int priceCat) {
        this.priceCat = priceCat;
    }

//----------------------- To String Method ------------------------------------

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", starsRate=" + starRating +
                ", priceCat=" + priceCat +
                '}';
    }

}
