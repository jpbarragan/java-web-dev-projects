package org.launchcode;
import org.launchcode.Student;


public class StudentPractice {
    public static void main(String[] args){
        //insantiate your Student class below
        Student sampleStudent = new Student("JP", 12345, 1, 4.0);

    System.out.println(sampleStudent.getName());
    sampleStudent.setName("Pepe");
    System.out.println(sampleStudent.getName());
    }
}
