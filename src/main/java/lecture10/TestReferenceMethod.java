package lecture10;

import com.sun.xml.internal.ws.api.ha.StickyFeature;

import java.util.Arrays;

public class TestReferenceMethod {
    public static void main(String[] args) {

        //Static Method Reference
        StudentMethodReference[] students = {new StudentMethodReference(3.4), new StudentMethodReference(5.3), new StudentMethodReference(2.8)};

        //sort an array, call the method compareGrades
        Arrays.sort(students, StudentMethodReference::compareGrades);

        for (StudentMethodReference student:students){
            System.out.println(student.getAvgGrade());
        }

        //Object Method Reference
    }
}
