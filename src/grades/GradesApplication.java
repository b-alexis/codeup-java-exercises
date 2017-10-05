package grades;

import java.util.ArrayList;
import java.util.HashMap;


public class GradesApplication {
    static Input input = new Input();

    public static void main(String[] args) {
        //Declaring HashMap
        HashMap<String, Student> Students = new HashMap<>();

        //Adding new students
        Student Becca = new Student("Becca");
        Student Bryan = new Student("Bryan");
        Student Raf = new Student("Raf");

        //Grades for Students
        Becca.addGrade(77);
        Becca.addGrade(100);
        Becca.addGrade(85);

        Bryan.addGrade(90);
        Bryan.addGrade(100);
        Bryan.addGrade(80);

        Raf.addGrade(99);
        Raf.addGrade(100);
        Raf.addGrade(92);

        //Added keys / Students to the map
        Students.put("b-alexis", Becca);
        Students.put("okcomputer", Bryan);
        Students.put("AxinAllCool", Raf);

        System.out.println("Welcome!\n");
        System.out.println("Here are the github usernames of our students:" + " " + Students);
        System.out.println("What Student would you like more information on?\n");

    }
        while(true)

    {
        System.out.println("1. - View all info students");
        System.out.println("2.- View all names");
        System.out.println("3. - Which Student:");
        System.out.println("4.- Exit");

        int option = input.getInt(1, 4);

        switch (option) {
            case 1:
                printAll(Students);
                break;
            case 2:
                //view all names
                break;
            case 3:
                // view names
                System.out.println("Give me the username:");
                printOne(Students, input.getString());
                break;


        System.out.println("Would you like to continue?");
        if (!input.yesNo()) {
            break;
        }
    }}

    public static void printAll(HashMap<String, Student> Students) {
        for (String key : Students.keySet()) {
            System.out.println("Name: " + Student.getName() + "- github Username: " + key + "\n" + "Current Average: " + Student.getGradeAverage() + "\n");
        }


    }

}
