package inheritance;

import java.util.LinkedList;

public class Shop implements Reviewable{
    String shopName;
    String shopDescription;
    int numDollarSign;
    double starRating;

    public LinkedList<Review> shopReviews = new LinkedList<>();


    public Shop(String shopName, String shopDescription, int numDollarSign) {
        this.shopName = shopName;
        this.shopDescription = shopDescription;
        this.numDollarSign = numDollarSign;
    }

    @Override
    public String toString() {
        return "Shop{" +
                "Shop Name= '" + shopName + '\'' +
                ", Shop Description= '" + shopDescription + '\'' +
                ", Number of the Dollar Sign= " + numDollarSign +
                '}';
    }

    @Override
    public void addReview(Review review){
        // add review to the end of the list in the constructor
        this.shopReviews.add(review);
    }


}
