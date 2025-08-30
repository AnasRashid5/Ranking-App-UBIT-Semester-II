package app;

import input.Input;
import java.util.Scanner;
import student.Student_List;

public class App {
    public void run() {
        // File_Dealing files = new File_Dealing();
        // files.fileReader();

        // Student_List list = new Student_List();
        // list.searchList();

        Scanner sc = new Scanner(System.in);
        
        System.out.println("1. Show all students");
        System.out.println("2. Search by Seat No");
        System.out.print("Choose option: ");
        int choice = sc.nextInt();

        if (choice == 1) {
            Student_List sl = new Student_List();
            sl.printAllStudents();
        } else if (choice == 2) {
            Input input = new Input();
            input.searchBySeatNo();
        } else {
            System.out.println("Invalid choice!");
        }
    }
}

// -------------------------- SYED MUHAMMAD ASHHAD MATLUB -------------
