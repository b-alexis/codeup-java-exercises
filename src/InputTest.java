import util.Input;

public class InputTest {
    public static void main(String[] args){
        Input input = new Input();

        System.out.println("Enter number");
       int number = input.getInt(1, 10);
       System.out.println("your number is:" + number);


        System.out.println("Enter number");
        double num = input.getDouble();

        System.out.println("You chose "+ num);
    }
}