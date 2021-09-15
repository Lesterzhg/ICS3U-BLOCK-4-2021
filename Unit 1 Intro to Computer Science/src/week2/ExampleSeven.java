package week2;
/**
 * final modifier
 */
public class ExampleSeven {
    public static void main(String[] args){
        final int x = 7;
        // x = 6; cannot reassign a value to a final var
        
        final int y;
        y = 8; // works bc can't be modded, but only AFTER assignment
        // y = 6; doesn't work bc final
       
        final int NUM_STUDENTS = 18; // use caps to indicate final

        System.out.println(x + y + NUM_STUDENTS);

    }
}
