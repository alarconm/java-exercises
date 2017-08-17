package exercises.school;

public class Student {

    private static int nextStudentId = 1;
    private String name;
    private final int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {

        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {

        this(name, studentId, 0, 0);
    }

    public Student(String name) {

        this(name, nextStudentId);
        nextStudentId++;
    }

    public void addGrade(int courseCredits, double grade) {
        double currentQualityScore = this.gpa * this.numberOfCredits;
        currentQualityScore += (courseCredits * grade);
        this.numberOfCredits += courseCredits;
        this.gpa = (currentQualityScore) / (this.numberOfCredits);
    }

    public String getGradeLevel() {
        if(this.numberOfCredits >= 90) {
            return "Senior";
        }
        if(this.numberOfCredits >= 60) {
            return "Junior";
        }
        if (this.numberOfCredits >=30) {
            return "Sophomore";
        }
        return "Freshman";
    }

    @Override
    public String toString() {
        return getName() + ":" + getGradeLevel() + ":" + getGpa();
    }

    @Override
    public boolean equals(Object obj) {

        if (obj == this) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (obj.getClass() !=getClass()) {
            return false;
        }

        Student theStudent = (Student) obj;
        return theStudent.getStudentId() == getStudentId();
    }

    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }

    public int getStudentId() {
        return studentId;
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }

    public double getGpa() {
        return gpa;
    }

    public void setGpa(double gpa) {
        this.gpa = gpa;
    }
}
