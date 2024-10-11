public class Student {
<<<<<<< HEAD
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
=======
    private String studentId;
    private String name;
    private String birthDate;
    private String phoneNumber;
    private String email;

    public Student(String studentId, String name, String birthDate, String phoneNumber, String email) {
        this.studentId = studentId;
        this.name = name;
        this.birthDate = birthDate;
        this.phoneNumber = phoneNumber;
        this.email = email;
    }
    public String getStudentId() {
        return studentId;
    }
    public String getName() {
        return name;
>>>>>>> c4f3f6a0f1b3e7c51a0005fd09c214248ff11154
    }
    public String getBirthDate() {
        return birthDate;
    }
    public String getPhoneNumber() {
        return phoneNumber;
    }
    public String getEmail() {
        return email;
    }

<<<<<<< HEAD
    // Getter cho tên sinh viên
    public String getStudentName() {
        return studentName;
    }

    @Override
    public String toString() {
        return "Student ID: " + studentID + ", Student Name: " + studentName;
=======
    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
>>>>>>> c4f3f6a0f1b3e7c51a0005fd09c214248ff11154
    }
}
