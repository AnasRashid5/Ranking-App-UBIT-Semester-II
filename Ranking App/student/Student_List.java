package student;

import file_reader.File_Dealing;
import java.util.ArrayList;

public class Student_List {

    // Reads file and returns ArrayList<Student>
    public ArrayList<Student> getAllStudents() {

        File_Dealing file = new File_Dealing();

        ArrayList<String> lines = file.fileReader();
        ArrayList<Student> students = new ArrayList<>();

        String seatNo, name, rank;
        double marks;

        if (!lines.isEmpty()) {
            lines.remove(0); // skip header row (S.no SeatNo Name Marks Rank)
        }

        for (String line : lines) {
            String[] fields = line.trim().split("\\s+");

            if (fields.length < 4) {
                continue; // skip invalid line if is in file
            }

            seatNo = fields[1];

            // Name is between seatNo and marks so array index before marks and after seat
            // number

            StringBuilder nameBuilder = new StringBuilder();
            for (int i = 2; i <= fields.length - 3; i++) {
                if (i > 2) { // 2 is index from which name is starting so if it is 3 then will add gap.
                    nameBuilder.append(" ");
                }
                nameBuilder.append(fields[i]);
            }
            name = nameBuilder.toString();

            marks = Double.parseDouble(fields[fields.length - 2]);

            // rank if it is none in file
            if (fields[fields.length - 1].equalsIgnoreCase("None")) {
                rank = "Rank is below 8";
            } else {
                rank = fields[fields.length - 1];
            }

            students.add(new Student(seatNo, name, marks, rank));
        }

        return students;
    }
}

// try {

// BufferedReader bfrd = new BufferedReader(new FileReader(
// "D:\\Oops Project\\Ranking
// App\\file_reader\\Result-_2nd-Semester_-Section-A-Checked-by-BETA-Group.txt"));

// String line = bfrd.readLine();
// while (line != null) {
// String[] fields = line.split("\\s+");
// studentInfo.add(line);

// if (fields.length > 5) {
// System.out.println("Seat No: " + fields[1]);

// System.out.println("Marks: " + fields[fields.length - 2]);
// System.out.println("Marks: " + fields[5]);
// // System.out.println("Rank: " + fields[6]);
// System.out.println();
// }

// int marks = Integer.parseInt(fields[5]);

// line = bfrd.readLine();

// }

// bfrd.close();
// } catch (Exception e) {
// }

// }