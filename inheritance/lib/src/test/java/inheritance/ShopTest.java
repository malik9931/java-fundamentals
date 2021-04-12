package inheritance;

import org.junit.Test;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

public class ShopTest {
    @Test
    public void testShopClass() {
        Shop classUnderTest = new Shop("test","test",1);
        // ---------------- SHOP --------------------
        Shop newShop = new Shop("superMarket","Sale a lot of stuff",3);
        Review shopRev = new Review("This is a good shop","Malek",3);
        newShop.addReview(shopRev);
        System.out.println(shopRev);
        assertEquals("Shop{Shop Name= 'test', Shop Description= 'test', Number of the Dollar Sign= 1}", classUnderTest.toString());
        assertEquals("Malek gave 3.0 stars, and gave the following review This is a good shop", shopRev.toString());

    }
}
