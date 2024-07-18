package application;
import java.util.Comparator;

// Compare students roll number ~ student IDs
public class RollnoComparator implements Comparator<Student> {
    @Override
    public int compare(Student s1, Student s2) {
        return Integer.compare(s1.getRollno(), s2.getRollno());
    }
}
