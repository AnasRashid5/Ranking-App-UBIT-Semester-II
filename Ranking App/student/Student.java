package student;
// -------------------- SYED MUHAMMAD ASHHAD MATLUB  ---------

public class Student {
    public String seatNo;
    public String name;
    public double marks;
    public String rank;

    public Student(String seatNo, String name, double marks, String rank) {
        this.seatNo = seatNo;
        this.name = name;
        this.marks = marks;
        this.rank = rank;
    }

    @Override
    public String toString() {
        return "Seat No: " + seatNo + "\n"+ "Name: " + name + "\n"+ "Marks: " + marks + "\n"+ "Rank: " + rank + "\n"+ "-----------------------\n";
                
    }

}
