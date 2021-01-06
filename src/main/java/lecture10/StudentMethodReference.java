package lecture10;

import lombok.Getter;

@Getter

public class StudentMethodReference {
    private double avgGrade;

    public StudentMethodReference(double avgGrade) {
        this.avgGrade = avgGrade;
    }

    public static int compareGrades (StudentMethodReference a, StudentMethodReference b){
        if(a.avgGrade>b.avgGrade) return 1;
        else if (a.avgGrade<b.avgGrade) return -1;
        else return 0;
    }


}
