/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static basiclibrary.Library.tally;
import static org.junit.Assert.*;

public class LibraryTest {
    @Test public void testSomeLibraryMethod() {
        Library classUnderTest = new Library();
        assertTrue("someLibraryMethod should return 'true'", classUnderTest.someLibraryMethod());
    }

    @Test public void testRoll(){
//        ArrayList<Integer> testrollingResult = new ArrayList<Integer>();
//        System.out.println("ddddddddddddd");
        Library classUnderTest = new Library();
        ArrayList<Integer> testRoll = classUnderTest.roll(2);

        assertEquals("The length of the rolling array is equal to 2",2,testRoll.size());

    }

    @Test public void testContainsDuplicates(){
        int [] test1 = {1,2,3,4,5};
        int [] test2 = {1,2,4,3,4,5};
//        System.out.println("ddddddddddddd");
        Library classUnderTest2 = new Library();
        boolean testingResult1 = classUnderTest2.containsDuplicates(test1);
        boolean testingResult2 = classUnderTest2.containsDuplicates(test2);
        assertEquals("The testing of the test1 array is equal to ",false,testingResult1);
        assertEquals("The testing of the test2 array is equal to ",true,testingResult2);

    }

    @Test public void testAvgCalculator(){
        int [] test1 = {1,2,3,4,5};
        int [] test2 = {1,2};
        Library classUnderTest = new Library();

        double testAvgArr1 = classUnderTest.avgCalculator(test1);
        double testAvgArr2 = classUnderTest.avgCalculator(test2);
        System.out.println(testAvgArr2);
        assertEquals("The testing of the first array, the avg is equal to ", 3.0, testAvgArr1,0);
        assertEquals("The testing of the second array, the avg is equal to ",1.5,testAvgArr2,0);

    }

    @Test public void testAvgArrays(){
        int[][] testArr = {
                {66, 64, 58, 65, 71, 57, 60},
                { 1, 72, 65, 1},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}

        };
//        double[] expectTest = {63.0, 63.57142857142857, 57.0, 57.42857142857143};
        Library classUnderTest = new Library();
        int[] testAvgArrs = classUnderTest.avgArrays(testArr);
        System.out.println(testArr[1]);
        assertEquals("The testing of the first array, the avg is equal to ", testArr[1], testAvgArrs);
//        assertEquals(57.0,testAvgArrs, 0);


    }
    @Test public void testAnalyzWeather(){
        int[][] testArr = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        String[] expectedTest= {"63", "67", "68", "69"};

        Library classUnderTest = new Library();
        String testAnalyzWeatherArr = classUnderTest.analyzWeather(testArr);

        assertEquals("the max is: "+72+", the min is: "+51+", Never saw temperature: [63, 67, 68, 69]",testAnalyzWeatherArr);



    }

    @Test public void testTally(){
        List<String> votes = new ArrayList<>();
        votes.add("Malek");
        votes.add("Malek");
        votes.add("Moh");
        votes.add("Malek");
        votes.add("Moh");
        votes.add("Ahmad");

        Library classUnderTest = new Library();
        String testVotes = classUnderTest.tally(votes);

        assertEquals("The testing of the tally Function, the high votes expected is for ", "Malek", testVotes);

    }
}
