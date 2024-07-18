package application;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<Student> students = new ArrayList<>();

        // Loop for input 10 times
        for (int i = 0; i < 10; i++) {
            System.out.println("Enter the following information about student #" + (i + 1));
            System.out.print("Student ID #: "); // ~ roll number
            int rollno = scanner.nextInt();
            scanner.nextLine();
            System.out.print("Full name: ");
            String name = scanner.nextLine();
            System.out.print("Street name: ");
            String address = scanner.nextLine();

            Student student = new Student(rollno, name, address);
            students.add(student);
        }

        Student[] studentArray = students.toArray(new Student[0]);

        // Before sort
        System.out.println("Before sorting:");
        printStudents(studentArray);

        // SelectionSort by name 
        SelectionSort.sort(studentArray, new NameComparator());
        System.out.println("After sorting by name:");
        printStudents(studentArray);

        
        // SelectionSort by roll number ~ student ID #
        SelectionSort.sort(studentArray, new RollnoComparator());
        System.out.println("After sorting by rollno:");
        printStudents(studentArray);
    }

    public static void printStudents(Student[] students) {
        for (Student student : students) {
            System.out.println(student.getRollno() + " " + student.getName() + " " + student.getAddress());
        }
    }
}
