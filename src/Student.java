public class Student {
    private String studentID;
    private String studentName;

    // Constructor
    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
    }

    public Student() {
    }

    // Getter cho ID sinh viên
    public String getStudentID() {
        return studentID;
    }

    // Getter cho tên sinh viên
    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentID + ", Student Name: " + studentName;
    }
}
