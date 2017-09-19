import java.util.Scanner;

public class ControlFlowExercises {
    public static void main(String[] args) {


       for (int counter = 1; counter <=100; counter++) {

           if(counter % 3 ==0 && counter % 5 ==0) {
               System.out.println("FizzBuzz");
               continue;
           }
          else if(counter % 3 == 0){
               System.out.println("Fizz");
               continue;
           }
            else if(counter % 5 == 0){
               System.out.println("Buzz");

           }
           System.out.println("counter =" + counter);
       }





    }
}
