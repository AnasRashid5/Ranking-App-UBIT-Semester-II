package input;

import java.util.ArrayList;
import java.util.Scanner;
import student.Student;
import student.Student_List;

public class Input {

    Student_List sl = new Student_List();


    // Search student by seat number
    public void searchBySeatNo() {
        ArrayList<Student> students = sl.getAllStudents();

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        Scanner sc = new Scanner(System.in);
        System.out.print("Enter your Seat No: ");
        String inputSeat = sc.nextLine().replaceAll("\\s", "");

        boolean found = false;
        for (Student s : students) {
            if (s.seatNo.equalsIgnoreCase(inputSeat)) {
                System.out.println("Student found:");
                System.out.println(s.toString());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("\n No student found with Seat No: " + inputSeat);
        }
    }
}

