package studentdatabase;

import java.util.Scanner;

public class StudentDatabaseApp {
    public static void main(String[] args) {
        // How many users?
//        Student student = new Student();
//        student.enroll();
//        student.payTuition();
//        System.out.println(student);


        // Create n number of new students
        System.out.println("Enter number of new students?");
        Scanner in = new Scanner(System.in);
        int numOfStudents = in.nextInt();

        Student[] students = new Student[numOfStudents];

        for (int i = 0; i < numOfStudents; i++){
            students[i] = new Student();
            students[i].enroll();
            students[i].payTuition();
        }

        for (int j = 0; j < numOfStudents; j++){
            System.out.println();
            System.out.println(students[j].toString());
        }
    }
}
