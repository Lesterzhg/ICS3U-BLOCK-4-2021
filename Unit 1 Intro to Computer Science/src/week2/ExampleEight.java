package week2;
/**
 * type casting
 */    
public class ExampleEight {
    public static void main(String[] args){
        final int NUM_MARKS = 5;

        int markOne = 78, markTwo = 87, markThree = 64, markFour = 95, markFive = 84;

        double average = (double) (markOne + markTwo + markThree + markFour + markFive) / NUM_MARKS;

        System.out.print("The average is " + average);

        int x = (int) 3.7;

        double z = (double)7;// explicit cast

        // int to doub: "widening conversion"
        // double to int: "narrowing conversion"

        boolean xx = !true;
        //boolean p = (int) true;

        System.out.println(x+z);
        System.out.println(xx);
     }
}
