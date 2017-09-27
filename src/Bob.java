import java.util.Scanner;

public class Bob {
    public static void main(String[] args) {

        {
            Scanner scan = new Scanner(System.in);
            System.out.println("Talk to Bob..");
            String convo = scan.nextLine();
       scan.nextLine();
            String question = "?";
            String exclamation = "!";
            if (convo.endsWith(question)) {
                System.out.println("sure");
            } else if (convo.endsWith(exclamation) || convo.equals(convo.toUpperCase()) && !convo.isEmpty()) {

                System.out.println("Whoa,Chill out!");
            } else if (convo.isEmpty())

            {
                System.out.println("Fine. Be that way!");
            } else

            {
                System.out.println("Whatever");

            }

        }
    }
}
