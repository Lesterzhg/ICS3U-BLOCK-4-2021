package week1;

public class ExampleSix {
    public static void main(String[] args){
        int x = 1;
        int y = 2;
        int z = 3;
        x = x + 2;
        x += 2; //does same thing as ^^
        x++; // add one
        x--; // add two

        int s = 5;
        s++;
        ++s;
        s--;
        --s;

        int g = 3;
        int f = 3;

        int test1 = 2 * g++; // g++ does in order
        int test2 = 2 * ++f; // ++f does b4 other stuff

        System.out.println(y+z+s+test1+test2);
    }
}
