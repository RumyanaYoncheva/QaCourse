package lecture08;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main (String[] args){
        Student student = new Student("Rumy",20, "FMI",  "BIT",1919);

        List<String > studentCourses = new ArrayList<String>();
        studentCourses.add("Maths");
        studentCourses.add("Programing");

        //adding the courses for the student
        student.setCourses(studentCourses);
        student.prepareForExam();
        student.levelOfEducation(EducationLevel.NO);
    }
}
