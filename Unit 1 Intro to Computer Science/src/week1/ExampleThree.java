package week1;

/**
 * Escape sequences
**/
public class ExampleThree {
    public static void main(String[] args){
        //System.out.println("This is "very" important!!"); double quotes encapsulate string lit putting a quote in a string lit no work
        System.out.println("This is \"very\" important!!"); //backslash escapes character, creates escape sequence
        //System.out.println("This is \very important!!"); \v not a valid escape sequence
        System.out.println("This is very \\important!!");
        System.out.println("This\nis\nvery\nimportant!!"); // \n = new line
    }
}
