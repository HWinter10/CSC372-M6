package application;

public class Student {
    int rollno;  // roll number ~ student ID
    String name;
    String address;

    public Student(int rollno, String name, String address) {
        this.rollno = rollno; 
        this.name = name;
        this.address = address;
    }

    public int getRollno() {
        return rollno;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }
}
