import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


        long i = 2;
        do {
            System.out.println(i);
            i*=i;
        }while (i <= 1000000);
        // in this case, we should use long, since the number is much bigger than you would use with just an integer. Using an integer would break or continue the loop, IT SHOULD NOT BE USED. just use long.

    }
}
