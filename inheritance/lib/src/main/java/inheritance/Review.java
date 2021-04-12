package inheritance;

import java.util.LinkedList;

public class Review{
    String body;
    String author;
    double numOfStars;
    public String filmName;


    public Review(String body, String author,double numOfStars ) {
        this.body = body;
        this.author = author;
//        this.numOfStars = numOfStars;

        if(numOfStars >=0 && numOfStars<= 5){
//            this.setStarsNum(starsNum);
            this.numOfStars = numOfStars;

        }else {
            throw new IllegalArgumentException("Our customer: The Number of Stars should be between 0 and 5, please");
        }

    }

    public Review(String body, String author,double numOfStars, String movieName ) {
        this.body = body;
        this.author = author;
        this.filmName = movieName;

        if(numOfStars >=0 && numOfStars<= 5){
//            this.setStarsNum(starsNum);
            this.numOfStars = numOfStars;

        }else {
            throw new IllegalArgumentException("Our customer: The Number of Stars should be between 0 and 5, please");
        }

    }
//
//    public void addNewReview(){
//        rev
//
//    }


//----------------------- To String Method ------------------------------------
//    public String toStringfilm(){
//        return String.format("%s gave %s stars, and gave the following review %s for the particular %s",this.author,this.numOfStars,this.body,this.filmName);
////        return this;
//
//    }
    @Override
    public String toString() {
        String result = "";
        if(this.filmName== null){
            result+= String.format("%s gave %s stars, and gave the following review %s",this.author,this.numOfStars,this.body);
        }else {
            result+= String.format("%s gave %s stars, and gave the following review %s for the particular movie: %s",this.author,this.numOfStars,this.body,this.filmName);
        }
        return result;
    }
}
