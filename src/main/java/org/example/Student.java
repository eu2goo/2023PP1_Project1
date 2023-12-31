package org.example;

public class Student {
    private String name;
    private String studentId;

    public Student(String studentId) {
        this.studentId = studentId;
    }
    public Student(String studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
    public void setStudentId(String studentId) {
        this.studentId = studentId;
    }
    public String getName() {

        return name;

    }
    public String getStudentId() {
        return studentId;

    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", studentId='" + studentId + '\'' +
                '}';
    }
}
