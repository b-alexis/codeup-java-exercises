

public class HelloWorld {
    // psvm
    public static void main(String[] args) {
        //sout
        // general syntax: type identifier;
        // 3 types of integers
        // var byteNumber;
        // var shortNumber;
        byte byteNumber =2;
        short shortNumber = 0;
        int intNumber = 1;
        long longNumber = 10;


        // floating point numbers
        float floatNumber = 2.0f; //any num w a decimal  is recognized as a double, if you want to save it as a float you must add an f to the end of the number.
        double doubleNumber = 10.5;

        char singleCharacter ='L';

        boolean booleanValue = true;

        String name = "Redwood"; //strings in java use double quotes. \n = new line: same escape sequence as javascript, "use backslash"


        //const MY_CONSTANT = 4;
        final int MY_CONSTANT = 4; //using final makes the value unchangeable.

        System.out.println(3.0f / 4); //same as console.log, case sensitive. float decimal sensitive

        int x = 5;
        System.out.println(x++); // 5
        System.out.println(++x); // 7
        System.out.println(x--); // 7
        System.out.println(--x); // 5

        x += 3; // 8
        System.out.println(x);

        // It is only valid if the value on the right is smaller than the type on hte left
        double aDoubleNumber = 10; // from int to double
        System.out.println(aDoubleNumber);

        //explicit type casting
        //type variable = (type aBiggerTypeVariable
        int aintegerNumber = (int) aDoubleNumber;

        System.out.println("Hello world!");
    }
}
