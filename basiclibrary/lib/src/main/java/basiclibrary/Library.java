/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package basiclibrary;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.Random;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }
//Rolling Dice Function
    public static ArrayList<Integer> roll(int n){
            ArrayList<Integer> rollingResult = new ArrayList<Integer>();
        for (int i = 1 ; i<= n ; i++){
            Random r = new Random();
            int low = 1;
            int high = 7;
            int result = r.nextInt(high-low) + low;
            rollingResult.add(result);
        }
            System.out.println(rollingResult);

        return rollingResult;
    }

    // Contains Duplicates Function
    public static boolean containsDuplicates(int[] arr) {
        boolean result = false;
        for (int i =0 ;i< arr.length ; i++ ){
            for (int j = i+1 ; j < arr.length; j++){
                if(arr[i] == arr[j]){
                    result= true;
                    return result;
                }else {
                    result= false;
                }
            }

        }
        return result;
    }

    //Calculating Averages Function
    public static double avgCalculator(int[] arr){
//        int result = 0;
//        for (int i : arr){
//            int sum = Arrays.stream(arr).sum();
            OptionalDouble avg = Arrays.stream(arr).average();

            return avg.getAsDouble();

    }

// Arrays of Arrays
    public static ArrayList<Double> avgArrays (int [][] arr){
        ArrayList<Double> avgsOfArr = new ArrayList<>(); // Create an ArrayList object

        for (int i = 0 ; i<arr.length ; i++){
            Double avg = Arrays.stream(arr[i]).average().getAsDouble();
//            avg.getAsDouble();
            avgsOfArr.add(avg);
//            avgsOfArr.getAsDouble();
        }
        double leastValue = avgsOfArr.get(0);
        for (double num : avgsOfArr){
            if(num < leastValue){
                leastValue = num;
            }
        }

//        System.out.println(leastValue);
        return avgsOfArr;

    }

    public static void main(String[] args) {
        int [] test = {1,4,5,9,9,6};
        System.out.println(containsDuplicates(test));
        System.out.println(avgCalculator(test));

        roll(4);

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}

        };

        System.out.println(avgArrays(weeklyMonthTemperatures));

    }
//    public ArrayList
}