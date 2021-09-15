package week1;

public class ExampleFive {
 public static void main(String[] args){
    int markOne = 75, markTwo = 80, markThree = 87;
    //double average = (markOne+markTwo+markThree)/3.0;// 242/3=80
    double average = (markOne+markTwo+markThree)/3.0; // 242/3.0=80.666667
    System.out.println(average);

    //Ints vs Doubs
    System.out.println(4/5); //=0
    System.out.println(4.0/5); //=0.8
    System.out.println(5/4); //=1
    System.out.println(5/4.0); //=1.25

    //Modulus
    System.out.println(13/3); //4
    System.out.println(13&3); //1 (remainder)
}   
}
