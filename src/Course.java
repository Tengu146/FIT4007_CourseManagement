import java.util.ArrayList;
import java.util.List;

public class Course {
    private int courseId;
    private String courseName;
    private String instructor; // Tên giảng viên của khóa học
    private List<Student> studentList; // Danh sách sinh viên đã ghi danh

    // Constructor
    public Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.studentList = new ArrayList<>(); // Khởi tạo danh sách sinh viên
    }

    public Course() {
    }

    // Getter cho ID khóa học
    public int getCourseId() {
        return courseId;
    }

    // Getter cho tên khóa học
    public String getCourseName() {
        return courseName;
    }

    // Getter cho tên giảng viên
    public String getInstructor() {
        return instructor;
    }

    // Setter cho tên giảng viên
    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    // Thêm sinh viên vào danh sách của khóa học
    public void addStudent(Student student) {
        studentList.add(student);
    }

    // Lấy danh sách sinh viên đã ghi danh
    public List<Student> getStudentList() {
        return studentList;
    }

    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Course Name: " + courseName + ", Instructor: " + instructor;
    }
}
