/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package inheritance;

public class Library {
    public boolean someLibraryMethod() {
        return true;
    }

    public static void main(String[] args) {
        try {

        Restaurant malek = new Restaurant("Malek",10);
        System.out.println(malek.toString());
            Review rev1 = new Review("goood foood","mike", 4);
            Review rev11 = new Review("goood foood","mike", 4);

            Review rev2 = new Review("bad food","johne", 1);
            Review rev3 = new Review("bad fdsood","s", 5);
            Review rev4 = new Review("Healloe Nice food","malek",4);
            malek.addReview(rev1);
            malek.addReview(rev11);
            malek.addReview(rev2);

            //Review test = new Review("jjjj","aaaa",2);

            System.out.println(malek.reviews);
            System.out.println(malek);



        }catch (Exception ex){
            System.out.println("Error: "+ex);
        }

    }
}
