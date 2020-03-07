package Assignment;

import Classes.Student;

public interface StudentServices{
    void addStudent(Student student);
    Student getStudent(int id);
    void isStudentPassed(int id);
}