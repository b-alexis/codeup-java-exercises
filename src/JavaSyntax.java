public class JavaSyntax {
    public static void main(String[] args){
        int MyFavoriteNumber = 8;
        System.out.println (MyFavoriteNumber); // prints out int variable MyFavoriteNumber which is 8.

//        String myString = "Java is fun!";
//        System.out.println(myString); //prints out string

//        char myString = 'J';
//        System.out.println(myString); // prints out char value

//        double myString = 3.14159;
//        System.out.println(myString); // prints out value of myString. put value in quotes if you want String as the data type, it will print out the exact input value.

//        long myNumber = 123;
//        System.out.println(myNumber); //a number with a decimal cannot be assigned to long. If you want to add a decimal number to a dataType of long use long in () parentheses, it will round the number

        float myNumber = 3.14f;
        System.out.println(myNumber); // assigning float to an value with a decimal works as long as there is an f at the end of the value, otherwise it is asumed as a double.

//        int x = 5;
//        System.out.println(x++); // prints out x value and will increase by one after each. modify the value after the line was printed.
//        System.out.println(x); // prints out value increased by one.

//        int x = 5;
//        System.out.println(++x); // prints out the value increased before the value
//        System.out.println(x); // prints out the value increased by one

      //variable 'class' cannot be created. it is reserved

        int x = 4;
        x += 5;
        System.out.println(x); //9


         int y = 4;
         y *= x;
         System.out.println(y); //36


         x /= y;
         y -= x;
        System.out.println(x);
        System.out.println(y);
    }
}
