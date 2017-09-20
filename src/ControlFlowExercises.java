import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Give me the grade");
        int grade = input.nextInt();
        input.nextLine();
        if (grade <= 100 && grade >= 88) {
            System.out.println("A");
        } else if (grade <= 87 && grade >= 80) {
            System.out.println("B");
        } else if (grade <= 79 && grade >= 67) {
            System.out.println("C");
        } else if (grade <= 66 && grade >= 60) {
            System.out.println("D");
        } else if (grade <= 59) {
            System.out.print("F");
        }


    }
}