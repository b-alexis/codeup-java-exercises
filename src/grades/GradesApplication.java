package grades;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;



public class GradesApplication {
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

        //Added keys
        Students.put("b-alexis", Becca);
        Students.put("okcomputer", Bryan);
        Students.put("AxinAllCool", Raf);

        System.out.println("Welcome!\n");
        System.out.println("Here are the github usernames of our students:" + " " + Students);
        System.out.println("What Student would you like more information on?\n");



        do{

            if( )
        }

    }

}
