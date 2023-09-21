package school.management.system;

import java.text.DecimalFormat;

public class Main {
    private static final DecimalFormat df = new DecimalFormat("0,000.00");

    public static void main(String[] args) {

        Student student1 = new Student(
                1,
                23890473,
                "John",
                "Smith",
                "BSHC",
                0.0,
                1500.0,
                10000.0
        );

        System.out.println(
                "Course Year: " + student1.getCourseYear() +
                        "\nStudent ID: x" + student1.getStudentId() +
                        "\nFirst name: " + student1.getFirstName() +
                        "\nLast name: " + student1.getLastName() +
                        "\nCourse code: " + student1.getCourseCode() +
                        "\nAverage grade: " + student1.getAverageGrade() +
                        "%\nFees paid: €" + df.format(student1.getFeesPaid()) +
                        "\nTotal fees: €" + df.format(student1.getFeesTotal()) +
                        "\nFees owed: €" + df.format((student1.getFeesTotal() - student1.getFeesPaid()))
        );
    }
}
