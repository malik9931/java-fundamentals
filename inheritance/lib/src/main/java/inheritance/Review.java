package inheritance;

public class Review{
    String body;
    String author;
    double numOfStars;


    public Review(String body, String author,double numOfStars ) {
        this.body = body;
        this.author = author;
        this.numOfStars = numOfStars;
        if(numOfStars >=0 && numOfStars<= 5){
//            this.setStarsNum(starsNum);
            this.numOfStars = numOfStars;

        }else {
            throw new IllegalArgumentException("Our customer: The Number of Stars should be between 0 and 5, please");
        }
    }


//----------------------- To String Method ------------------------------------
    @Override
    public String toString() {
        return String.format("%s gave %s stars, and gave the following review %s",this.author,this.numOfStars,this.body);
    }
}
