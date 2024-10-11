import java.util.ArrayList;
import java.util.List;

public class CourseManagementSystem {
    private List<Course> courseList;
    private List<Student> studentList;
    private List<Teacher> teacherList;

    public CourseManagementSystem() {
        this.courseList = new ArrayList<>();
        this.studentList = new ArrayList<>();
        this.teacherList = new ArrayList<>();
    }

    // Phương thức quản lý khóa học
    public void addCourse(Course course) {
        courseList.add(course);
    }

    public void removeCourse(int courseId) {
        courseList.removeIf(course -> course.getCourseId() == courseId);
    }

    public List<Course> getCourseList() {
        return courseList;
    }

    // Phương thức quản lý sinh viên
    public void addStudent(Student student) {
        studentList.add(student);
    }

    public void removeStudent(String studentId) {
        studentList.removeIf(student -> student.getStudentID().equals(studentId));
    }

    public List<Student> getStudentList() {
        return studentList;
    }

    // Phương thức quản lý giáo viên
    public void addTeacher(Teacher teacher) {
        teacherList.add(teacher);
    }

    public void removeTeacher(String teacherId) {
        teacherList.removeIf(teacher -> teacher.getTeacherId().equals(teacherId));
    }

    public List<Teacher> getTeacherList() {
        return teacherList;
    }

    // Ghi danh sinh viên vào khóa học
    public void enrollStudent(int courseId, String studentId) {
        Course course = courseList.stream()
                .filter(c -> c.getCourseId() == courseId)
                .findFirst()
                .orElse(null);
        Student student = studentList.stream()
                .filter(s -> s.getStudentID().equals(studentId))
                .findFirst()
                .orElse(null);
        if (course != null && student != null) {
            course.addStudent(student); // Thêm sinh viên vào khóa học
        }
    }

    public List<Student> getEnrolledStudents(int courseId) {
        Course course = courseList.stream()
                .filter(c -> c.getCourseId() == courseId)
                .findFirst()
                .orElse(null);
        if (course != null) {
            return course.getStudentList(); // Trả về danh sách sinh viên đã ghi danh
        }
        return null;
    }

    // Phân công giáo viên cho khóa học
    public void assignTeacherToCourse(int courseId, String teacherId) {
        Course course = courseList.stream()
                .filter(c -> c.getCourseId() == courseId)
                .findFirst()
                .orElse(null);
        Teacher teacher = teacherList.stream()
                .filter(t -> t.getTeacherId().equals(teacherId))
                .findFirst()
                .orElse(null);
        if (course != null && teacher != null) {
            course.setInstructor(teacher.getName());
        }
    }

    public void printCourseDetails() {
        for (Course course : courseList) {
            System.out.println(course);
            List<Student> enrolledStudents = course.getStudentList();
            System.out.println("Danh sách sinh viên đã ghi danh:");
            if (enrolledStudents != null && !enrolledStudents.isEmpty()) {
                for (Student student : enrolledStudents) {
                    System.out.println(student);
                }
            } else {
                System.out.println("Chưa có sinh viên nào ghi danh.");
            }
        }
    }
}
