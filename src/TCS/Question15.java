package TCS;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Question15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the student list : ");
        int n = sc.nextInt();
        List<Student> students = new ArrayList<>();
        System.out.println("Enter the list of students : ");
        for (int i = 0; i < n; i++) {
            System.out.println("Enter the : "+(i+1)+" student details: ");
            System.out.println("Enter the student name: ");
            String name = sc.next();
            System.out.println("Enter the student age: ");
            int age = sc.nextInt();
            System.out.println("Enter the student grade : ");
            String grade = sc.next();
            System.out.println("Enter the student gender: ");
            char gender = sc.next().charAt(0);
            students.add(new Student(name, age, grade, gender));
        }

        List<String> studentNames = new ArrayList<>();
        for (Student student : students) {
            if(student.getAge()>20){
                studentNames.add(student.getName());
            }
        }
        System.out.println(Arrays.toString(studentNames.toArray()));

    }
}

class Student{
       private String name;
       private int age;
       private String grade;
       private char gender;

    Student(String name, int age, String grade, char gender){
        this.name = name;
        this.age = age;
        this.grade = grade;
        this.gender = gender;
    }

    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGrade() {
        return grade;
    }

    public void setGrade(String grade) {
        this.grade = grade;
    }

    public char getGender() {
        return gender;
    }

    public void setGender(char gender) {
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", grade='" + grade + '\'' +
                ", gender=" + gender +
                '}';
    }
}

//[
//        {"Name": "Alice", "Age": 22, "Grade": "A", "Gender": "F"},
//        {"Name": "Bob", "Age": 19, "Grade": "B", "Gender": "M"},
//        {"Name": "Clara", "Age": 23, "Grade": "C", "Gender": "F"},
//        {"Name": "Dave", "Age": 25, "Grade": "B", "Gender": "M"}
//        ]