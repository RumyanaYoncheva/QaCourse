package lecture10;

public class CompareObjects {

    public int compareByNames(StudentMethodReference a, StudentMethodReference b){
        return a.getName().compareTo(b.getName());
    }
}
