package studentdatabase;

import java.util.Scanner;

public class Student {

    private String firstName;
    private String lastName;
    private String courses = "";
    private String studentId;
    private int gradeYear;
    private double tuitionBalance = 0.0;
    private static final double COST_OF_COURSE = 600.0;
    private static int id = 1000;

    // Constructor
    public Student() {
        Scanner in = new Scanner(System.in);

        System.out.print("Enter first name of student:");
        this.firstName = in.nextLine();

        System.out.print("Enter last name of student:");
        this.lastName = in.nextLine();

        System.out.println("1 - Freshman \n2 - Sophomore \n3 - Junior \n4 - Senior \nEnter student class level:");
        this.gradeYear = in.nextInt();

        setStudentId();

//        System.out.println("First Name: " + firstName + "\nLast name: " + "\nGrade year: " + gradeYear + "\nStudent ID: " + studentId);

    }

    // Generate ID
    private void setStudentId() {
        //Grade level + ID
        id++;
        this.studentId = this.gradeYear + "" + id;
    }

    // Enroll to courses
    public void enroll() {
        //Get inside loop
        do {
            System.out.print("Enter course to enroll. (Q to quit)\t");
            Scanner in = new Scanner(System.in);
            String course = in.nextLine();
            if (!course.equals("Q")) {
                courses = courses + "\n\t" + course;
                tuitionBalance = tuitionBalance + COST_OF_COURSE;
            } else {
                break;
            }
        } while (true);

//        System.out.println("Enrolled in: " + courses);
//        System.out.println("Tuition balance €" + tuitionBalance);

    }

    // View balance

    public void viewBalance() {
        System.out.println("Tuition Balance: €" + tuitionBalance);
    }

    // Pay Tuition
    public void payTuition() {
        viewBalance();
        Scanner in = new Scanner(System.in);
        System.out.print("How much would you like to pay?\t");
        double payment = in.nextDouble();

        tuitionBalance = tuitionBalance - payment;
        System.out.println("Thank you of your payment of: €" + payment);
        viewBalance();
    }

    // Show status

    public String toString() {
        return "Name: " + firstName + " " + lastName +
                "\nGrade Level: " + gradeYear +
                "\nStudent ID: " + studentId +
                "\nCourses enrolled: " + courses +
                "\nBalance: €" + tuitionBalance
                ;
    }
}