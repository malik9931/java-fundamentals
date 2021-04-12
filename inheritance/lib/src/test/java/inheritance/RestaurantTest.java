package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class RestaurantTest {
    @Test
    public void testRestaurantClass() {
        Restaurant classUnderTest = new Restaurant("test",0,1);

        Restaurant malek = new Restaurant("Malek",5,10);
        malek.addReviewAndRating("goood foood","mike", 4);
//        System.out.println(malek.reviews);

        assertEquals("Restaurant{name='test', starsRate=0.0, priceCat=1}", classUnderTest.toString());
        assertEquals("[mike gave 4.0 stars, and gave the following review goood foood]", malek.reviews.toString());


    }
}
