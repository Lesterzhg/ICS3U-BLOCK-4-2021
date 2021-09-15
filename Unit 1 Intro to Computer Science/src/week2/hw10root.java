package week2;

public class hw10root {
    public static void main(String[] args){
        double a=-2, b=8, c=4;
        
        String x= ((-b+(Math.sqrt(b*b-(4*a*c))))/(2*a))+", "+ (-b-(Math.sqrt(b*b-(4*a*c))))/(2*a);
        System.out.println("The roots are " + x);    
    }
}
