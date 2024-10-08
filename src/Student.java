public class Student {
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

    @Override
    public String toString() {
        return "Student{" +
                "studentId='" + studentId + '\'' +
                ", name='" + name + '\'' +
                ", birthDate='" + birthDate + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
