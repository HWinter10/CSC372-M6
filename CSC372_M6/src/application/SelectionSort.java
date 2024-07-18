package application;
import java.util.Comparator;

public class SelectionSort {
    public static void sort(Student[] students, Comparator<Student> comparator) {
        for (int i = 0; i < students.length - 1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < students.length; j++) {
                if (comparator.compare(students[j], students[minIndex]) < 0) {
                    minIndex = j;
                }
            }
            Student temp = students[minIndex];
            students[minIndex] = students[i];
            students[i] = temp;
        }
    }
}
