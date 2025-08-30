package input;

import java.util.ArrayList;
import java.util.Scanner;
import student.Student;
import student.Student_List;

public class Input {

    public void searchBySeatNo() {
        // Get all students from Student_List
        Student_List sl = new Student_List();
        
        ArrayList<Student> students = sl.getAllStudents();

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        // Take input from user
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Seat No:");
        String inputSeat = sc.nextLine().replaceAll("\\s", "");

        boolean found = false;
        for (Student s : students) {
            if (s.seatNo.equalsIgnoreCase(inputSeat)) {
                System.out.println("Student found:");
                System.out.println(s.toString());;
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("No student found with Seat No: " + inputSeat);
        }
    }
}
