package domain;

import java.util.Arrays;

public class Room {
    private Student[] students;
    private Computer[] computers;
    private String[] array;

    public Room(Student[] students, Computer[] computers, String[] array) {
        this.students = students;
        this.computers = computers;
        this.array = array;
    }

    public Room() {
    }

    @Override
    public String toString() {
        return "Room{" +
                "students=" + Arrays.toString(students) +
                ", computers=" + Arrays.toString(computers) +
                ", array=" + Arrays.toString(array) +
                '}';
    }

    public Student[] getStudents() {
        return students;
    }

    public void setStudents(Student[] students) {
        this.students = students;
    }

    public Computer[] getComputers() {
        return computers;
    }

    public void setComputers(Computer[] computers) {
        this.computers = computers;
    }

    public String[] getArray() {
        return array;
    }

    public void setArray(String[] array) {
        this.array = array;
    }
}
