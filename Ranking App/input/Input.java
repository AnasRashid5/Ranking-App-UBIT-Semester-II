package input;

import java.util.ArrayList;
import java.util.Scanner;
import student.Student;
import student.Student_List;

public class Input {

    Student_List sl = new Student_List();


    public void choice() {
        Scanner sc = new Scanner(System.in);

        System.out.println("1. Show all students");
        System.out.println("2. Search by Seat No");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();
        sc.nextLine(); // consume newline

        if (choice == 1) {
            printAllStudents();
        } else if (choice == 2) {
            searchBySeatNo();
        } else {
            System.out.println("Invalid choice!");
        }
    }

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
            System.out.println("No student found with Seat No: " + inputSeat);
        }
    }

    // Print all students
    public void printAllStudents() {
        ArrayList<Student> students = sl.getAllStudents();

        if (students.isEmpty()) {
            System.out.println("No students found.");
            return;
        }

        for (Student s : students) {
            System.out.println(s.toString());
        }

        System.out.println("Total students Are: " + students.size());
    }
}

