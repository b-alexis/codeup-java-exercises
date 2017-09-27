import java.util.Random;
public class ServerNameGenerator {

    private static String[] Nouns =
            {"fast", "moving", "forward", "learning", "quick", "awesome", "amazing", "boring", "lame", "cute"};


   private static String[] Adjectives =
            {"flower", "lizard", "kitten", "frogFish", "turtle", "pants", "sweater", "Mountain", "lion", "dolphin"};

    public static void main(String[] args) {
    String getName = getRand(Adjectives) + "-" + getRand(Nouns);
    System.out.println("Here is your server name!:\n" + getName);

    }
    private static Random rand = new Random();
public static String getRand(String[] wordArray){
    return wordArray [rand.nextInt(wordArray.length)];
}

}