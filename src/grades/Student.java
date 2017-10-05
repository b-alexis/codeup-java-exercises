package grades;

import com.sun.tools.doclets.formats.html.SourceToHTMLConverter;

import java.util.ArrayList;

public class Student {
    //declaring statements
    private String name;
    private ArrayList<Integer> grades;

    //declaring constructor for ArrayList and name
    public Student(String name) {
        this.name = name;
        this.grades = new ArrayList<>();
    }
    //getter for name
    public String getName() {
        return name;
    }
    //getter for arraylist
    public ArrayList<Integer> getGrade() {
        return grades;
    }
    // adding grade, does not return a value
    public void addGrade(int grade) {
        this.grades.add(grade);
    }
    //method for getting the grade average
    public double getGradeAverage() {
        double numOfGrades = this.grades.size();
        double sum = 0;
System.out.println(numOfGrades);
        for (int grade : this.grades) {
            sum += grade;
        }

        return (sum/numOfGrades);
    }

    public static void main(String[] args) {
        Student becca = new Student("Becca");
        becca.addGrade(105);
        becca.addGrade(50);
        becca.addGrade(85);
        Student daniel = new Student("daniel");
        daniel.addGrade(50);
        daniel.addGrade(78);
        Student mari = new Student("mari");
        mari.addGrade(100);
        mari.addGrade(98);

        System.out.println(becca.getGradeAverage());
    }

}
