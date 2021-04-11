package inheritance;

import java.util.LinkedList;

public class Restaurant {
    String name;
    double starRating;
    int priceCat;
    LinkedList<Review> reviews;



    public Restaurant(String name , double starsNum ,int priceCat ){
        this.setName(name);
        if(starsNum >=0.0 && starsNum<= 5.0){
            this.setStarsNum(starsNum);
        }else {
            throw new IllegalArgumentException("Error starsNumber should be between 0 and 5");
        }
//        this.setStarsNum(starsNum);
        this.setPriceCat(priceCat);
        this.starRating = starRating;
        this.reviews = new LinkedList<>();

    }

    //----------------- Methods ---------------------------
    public void addReviewAndRating( String body ,String author ,double stars){
        //create a new instance of Review Class
        Review newReview = new Review(body,author,stars);
        // add the new review to the list, using the addReview method
        addReview(newReview);
        // update the restaurant review with getStarRating method.
        getStarsRating();
    }

    public void addReview(Review review){
        // add review to the end of the list in the constructor
        this.reviews.add(review);

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
    public void getStarsRating() {
        int starSum = 0;
        // start at the head of the restaurant list and add up the stars
        for(Review r : this.reviews) {
            starSum += r.starRating;
        }
        // get the average rating: divide the number of stars by the number of reviews, and update constructor
        this.starRating = starSum / this.reviews.size();
        return starsNum;
    }

    public void setStarsNum(double starsNum) {
            this.starsNum = starsNum;
    }
    //Price Category

    public int getPriceCat() {
        return priceCat;
    }

    public void setPriceCat(int priceCat) {
        this.priceCat = priceCat;
    }

//----------------------- To String Method ------------------------------------

    @Override
    public String toString() {
        return "Restaurant{" +
                "name='" + name + '\'' +
                ", starsNum=" + starsNum +
                ", priceCat=" + priceCat +
                '}';
    }
}
