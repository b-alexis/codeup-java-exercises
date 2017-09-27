package util;

import java.util.Scanner;

public class Input {
    private Scanner scanner;

    public Input(){
        this.scanner = new Scanner(System.in);
    }

    public String getString() {
        String userString = scanner.nextLine();
        scanner.nextLine();
        return userString;
    }

    public boolean yesNo() {
        System.out.println("Do you want to continue?");
        String userInput = this.scanner.nextLine();
        return userInput.equalsIgnoreCase("y") || userInput.equalsIgnoreCase("yes");
    }

    public int getInt() {
//        if (this.scanner.hasNextInt()) {
//            return this.scanner.nextInt();
//        } else {
//            System.out.println("invalid input");
//            return getInt();
//        }
        int Input = scanner.nextInt();
        scanner.nextLine();
        return Input;
    }

    // switch out int for double for the object methods should need to receive doubles
    public int getInt(int min, int max) {
        int userInput = getInt();
        if (userInput < min || userInput > max) {
            System.out.println(userInput + "is not between" + min + "and + max");
            return getInt(min, max);
        }
        scanner.nextLine();
        return userInput;
    }
}
