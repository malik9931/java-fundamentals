package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class TheaterTest {

    @Test
    public void testTheaterClass() {
        Theater theaterTest = new Theater("Irbid-Theater");
        theaterTest.addMovie("12-Angry Men");
        theaterTest.addMovie("2-Angry Men");
        theaterTest.addMovie("12-Not Angry Men");
        theaterTest.removeMovie("12-Angry Men"); // remove exist Film
        theaterTest.removeMovie("Angry Men"); // remove not exist film

        // -----------  Reviewing --------------------
        // Without Adding The Film Name
        Review theaterRev = new Review("This is a good theater","Malek",3);
        theaterTest.addReview(theaterRev);

        // With Adding The Film Name
        Review theaterRev2 = new Review("This is a good theater","Malek",3,"Attack On Titan");
        theaterTest.addReview(theaterRev2);

        System.out.println(theaterRev2);
        System.out.println(theaterTest.toString());

        assertEquals("Theater{name='Irbid-Theater', movies=[2-Angry Men, 12-Not Angry Men]}", theaterTest.toString());
        assertEquals("Malek gave 3.0 stars, and gave the following review This is a good theater", theaterRev.toString());
        assertEquals("Malek gave 3.0 stars, and gave the following review This is a good theater for the particular movie: Attack On Titan", theaterRev2.toString());

    }
}
