package school.management.system;

public class Student {
    private int courseYear, studentId;
    private String firstName, lastName, courseCode;
    private double averageGrade, feesPaid, feesTotal;

    public Student(int courseYear, int studentId, String firstName, String lastName, String courseCode, double averageGrade, double feesPaid, double feesTotal) {
        this.courseYear = courseYear;
        this.studentId = studentId;
        this.firstName = firstName;
        this.lastName = lastName;
        this.courseCode = courseCode;
        this.averageGrade = averageGrade;
        this.feesPaid = feesPaid;
        this.feesTotal = feesTotal;
    }

    public int getCourseYear() {
        return courseYear;
    }

    public void setCourseYear(int courseYear) {
        this.courseYear = courseYear;
    }

    public int getStudentId() {
        return studentId;
    }

    public void setStudentId(int studentId) {
        this.studentId = studentId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getCourseCode() {
        return courseCode;
    }

    public void setCourseCode(String courseCode) {
        this.courseCode = courseCode;
    }

    public double getAverageGrade() {
        return averageGrade;
    }

    public void setAverageGrade(double averageGrade) {
        this.averageGrade = averageGrade;
    }

    public double getFeesPaid() {
        return feesPaid;
    }

    public void setFeesPaid(double feesPaid) {
        this.feesPaid = feesPaid;
    }

    public double getFeesTotal() {
        return feesTotal;
    }

    public void setFeesTotal(double feesTotal) {
        this.feesTotal = feesTotal;
    }
}
