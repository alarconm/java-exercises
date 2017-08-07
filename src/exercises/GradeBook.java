package exercises;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class GradeBook {

    public static void main(String[] args) {

        HashMap<Integer, String> students = new HashMap<>();
        Scanner in = new Scanner(System.in);
        Integer newStudent;

        System.out.println("Enter all of your student ID's (or 0 to finish:");

        do {

            System.out.print("StudentId: ");
            newStudent = in.nextInt();

            if (!newStudent.equals(0)) {
                System.out.print("Student Name: ");
                String newName = in.next();
                students.put(newStudent, newName);

                in.nextLine();
            }

        } while(!newStudent.equals(0));

        System.out.println("\nClass roster:");

        for (Map.Entry<Integer, String> student : students.entrySet()) {
            System.out.println("ID: " + student.getKey() + " (" + student.getValue() + ")");
        }

    }
}
