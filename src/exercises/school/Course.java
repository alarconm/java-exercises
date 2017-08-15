//package exercises.school;
//
//import java.util.ArrayList;
//import java.util.HashMap;
//
//public class Course {
//
//    private static int nextCourseId = 1;
//    private final int courseID;
//    private String courseName;
//    private int courseCredits;
//    private ArrayList students;
//
//
//    public Course(String courseName, HashMap building, int courseCredits, int courseID) {
//        this.courseCredits = courseCredits;
//        this.courseName = courseName;
//        this.courseID = courseID;
//    }
//
//    public Course(String courseName, int courseCredits) {
//        this(courseName, courseCredits, 0);
//    }
//
//    public Course(String courseName) {
//
//        this(courseName, nextCourseId);
//        nextCourseId++;
//    }
//
//
//}
