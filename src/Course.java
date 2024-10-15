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
    public void setTeacher(String instructor) {
        this.instructor = instructor;
    }



    // Lấy danh sách sinh viên đã ghi danh
    public List<Student> getStudentList() {
        return studentList;
    }

    // Thêm sinh viên vào danh sách
    public void addStudent(Student student) {
        studentList.add(student);
    }

    // Xóa sinh viên khỏi danh sách
    public void removeStudent(Student student) {
        if (studentList.contains(student)) {
            studentList.remove(student);
            System.out.println("Đã xóa sinh viên: " + student.getStudentName());
        } else {
            System.out.println("Sinh viên không tồn tại trong khóa học.");
        }
    }



    @Override
    public String toString() {
        return "Course ID: " + courseId + ", Course Name: " + courseName + ", Instructor: " + instructor;
    }
}
