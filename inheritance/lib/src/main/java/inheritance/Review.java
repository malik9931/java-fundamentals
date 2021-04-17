package inheritance;

import java.util.LinkedList;

public class Review{
    private String body;
    private String author;
    private double numOfStars;


    public Review(String body, String author,double numOfStars ) {
        this.body = body;
        this.author = author;

        if(numOfStars >=0 && numOfStars<= 5){
            this.numOfStars = numOfStars;

        }else {
            throw new IllegalArgumentException("Our customer: The Number of Stars should be between 0 and 5, please");
        }

    }

//------------------Getter and Setter-------------------------------------


    public String getBody() {
        return body;
    }

    public void setBody(String body) {
        this.body = body;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getNumOfStars() {
        return numOfStars;
    }

    public void setNumOfStars(double numOfStars) {
        this.numOfStars = numOfStars;
    }

    //----------------------- To String Method ------------------------------------
    @Override
    public String toString() {
        return String.format("%s gave %s stars, and gave the following review %s",this.author,this.numOfStars,this.body);
    }
}
