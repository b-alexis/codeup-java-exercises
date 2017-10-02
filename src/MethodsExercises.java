import java.util.Scanner;

public class MethodsExercises {
    public static void main(String[] args) {
        System.out.println(addition(7, 3));
        System.out.println(subtraction(7, 3));
        System.out.println(multiplication(7, 3));
        System.out.println(division(7, 3));
        System.out.println("Enter a number between 1 and 10: ");
        System.out.println(getInteger(1, 10));
        System.out.println("Enter an integer between 1 and 10");
        getFactorial(1, 10);
        System.out.println("Enter the number of sides for our dice pls :)");

    }

    public static int addition(int x, int y) {
        return x + y;
    }

    public static int subtraction(int x, int y) {
        return x - y;
    }

    public static int multiplication(int x, int y) {
        return x * y;
    }

    public static int division(int x, int y) {
        return x / y;
    }

    //if user input is between 1 and 10 boolean will return true, if it is not in said parameters, boolean will read false, remember that java is strict , we must be specific of the data type.
    public static boolean getInteger(int i, int i1) {
        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();
        //alt solution int input = Integer.parseInt(scan.nextLine());
        if (userInput <= i && userInput >= i1) {
            return true;

        } else {
            return false;

        }
    }

    //use scanner to prompt and receive user number between 1 and 10 again
    public static int getFactorial(int x, int y) {
        Scanner scan = new Scanner(System.in);
        int input = scan.nextInt();
        int fact = 1;
        //Data type strict, use int inside for condition
        for (int i = 1; i <= input; i++) {
            fact = fact * i;
            System.out.println(i + "!" + input + "=" + fact);
           // (i + "! =" + i + "=" + (fact))
        }
        return fact;
    }

    public static int rollDice(int sides, Scanner input) {
        while (true){


//        Scanner input = new Scanner(System.in);
//        int sides =scan.nextInt();
//        double die1 = Math.floor(Math.random()*sides);
//        System.out.print(die1);


        }

    }



}