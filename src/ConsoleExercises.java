    import java.util.Scanner;

public class ConsoleExercises {
    public static void main(String[] args) {
    Scanner scan = new Scanner(System.in);
    System.out.println("What is your age?");
    int age = scan.nextInt(); //Will not take anything but an integer.


    System.out.println("Give me three words."); // print out for each string to view each word on new line. only use next, NOT nextLine for it to accept 3 words, after three words are entered, hit enter.
    String firstWord = scan.next();
    String secondWord = scan.next();
    String thirdWord = scan.next();
    System.out.println(firstWord);
    System.out.println(secondWord);
    System.out.println(thirdWord);

    System.out.println("write one sentence.");
    String sentence = scan.nextLine();
    System.out.println(sentence);
    }
}
