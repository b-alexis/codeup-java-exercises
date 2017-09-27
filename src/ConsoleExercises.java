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


        //when running, only the first word in the sentence would print out using next and using nextLine as well, so I used a new Scanner system, and the result is the entire sentence print out. // another way to solve this ---> input.nextLine(); // This is the extra \n (enter) which will save it from moving to the next, and having an empty string. second method is better with saving memory.
        Scanner newSentence = new Scanner(System.in);
        System.out.println("write one sentence.");
        String sentence = newSentence.nextLine();
        System.out.println(sentence);

        //use double if you want to except decimals from the user, otherwise use Int
        System.out.println("Enter the width of the room.");
        double width = scan.nextDouble();
        System.out.println("Enter the length of the room.");
        double length = scan.nextDouble();
        //process
        System.out.println( width * 2 + length * 2);
        System.out.println( width * length);

        //another way like above is, putting the process into variables, then printing out those variables
        //int area = length * width;
        //int perimeter = 2* length + 2 * with;
        //System.out.print("the area is " + area);
        //System.out.print("the area is " + perimeter);

    }
}
