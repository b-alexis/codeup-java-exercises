import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {
        int i = 5;
        long c = 2;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter a number");
        int number = input.nextInt();
        System.out.println("number | squared | cubed\n" + "------ | ------ | ------");

        for (int j = 1; j <= number; j++) {
            System.out.printf("%-7s|", j);
            System.out.printf("%-8s|", (j * j));
            System.out.printf("%-5s", (j * j * j));
            System.out.println();
        }
    }
}