package file_reader;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class File_Dealing {
    // Method to read file and return all lines as ArrayList
    public ArrayList<String> fileReader() {
        ArrayList<String> fileData = new ArrayList<>();

        try {
            File f = new File("D:\\Oops Project\\Ranking App\\file_reader\\Result-_2nd-Semester_-Section-A-Checked-by-BETA-Group.txt");
            Scanner scanner = new Scanner(f);

            while (scanner.hasNextLine()) {
                String line = scanner.nextLine();
                fileData.add(line); // Add each line to ArrayList
            }
            scanner.close();

        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
        return fileData; // Return the ArrayList containing all file data

    }
}

// try {

// File myFile = new File(
// "D:\\Oops Project\\Ranking
// App\\file_reader\\Result-_2nd-Semester_-Section-A-Checked-by-BETA-Group.txt");

// Scanner sc = new Scanner(myFile);

// while (sc.hasNextLine()) {
// String line = sc.nextLine();

// System.out.println(line);
// }
// } catch (Exception e) {
// System.out.println("ERROR");
// }
// }