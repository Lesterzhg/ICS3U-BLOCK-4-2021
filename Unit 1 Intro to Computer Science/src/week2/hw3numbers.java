package week2;

public class hw3numbers {

    public static void main(String[] args){
        final int num=2038, /*num1, */num2, /*num3, */num4;
        //num1 = num/1000;
        num2 = num/100%10;
        //num3 = num%100/10;
        num4 = num%10;

        System.out.println("The product is " + num2*num4);
    }

}
    

