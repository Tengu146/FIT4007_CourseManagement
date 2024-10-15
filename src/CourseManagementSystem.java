import java.util.ArrayList;
import java.util.List;

public class CourseManagementSystem {
    private List<Course> courses;
    private List<Student> students;
    private List<Teacher> teachers;

    public CourseManagementSystem() {
        this.courses = new ArrayList<>();
        this.students = new ArrayList<>();
        this.teachers = new ArrayList<>();
    }

    // Thêm khóa học vào hệ thống
    public void addCourse(Course course) {
        courses.add(course);
    }

    // Thêm sinh viên vào hệ thống
    public void addStudent(Student student) {
        students.add(student);
    }

    // Ghi danh sinh viên vào khóa học
    public void enrollStudent(int courseId, String studentId) {
        Course course = findCourseById(courseId);
        Student student = findStudentById(studentId);
        if (course != null && student != null) {
            course.addStudent(student);
        }
    }

    // Thêm giáo viên vào hệ thống
    public void addTeacher(Teacher teacher) {
        teachers.add(teacher);
    }

    // Phân công giáo viên cho khóa học
    public void assignTeacherToCourse(int courseId, String teacherId) {
        Course course = findCourseById(courseId);
        Teacher teacher = findTeacherById(teacherId);
        if (course != null && teacher != null) {
            course.setTeacher(String.valueOf(teacher));
        }
    }

    // Hiển thị thông tin chi tiết của khóa học
    public void printCourseDetails() {
        for (Course course : courses) {
            System.out.println(course);
        }
    }

    // Lấy danh sách sinh viên đã ghi danh trong khóa học
    public List<Student> getEnrolledStudents(int courseId) {
        Course course = findCourseById(courseId);
        if (course != null) {
            return course.getStudentList();
        }
        return null;
    }

    // Tìm khóa học theo ID
    private Course findCourseById(int courseId) {
        for (Course course : courses) {
            if (course.getCourseId() == courseId) {
                return course;
            }
        }
        return null;
    }

    // Tìm sinh viên theo ID
    private Student findStudentById(String studentId) {
        for (Student student : students) {
            if (student.getStudentID().equals(studentId)) {
                return student;
            }
        }
        return null;
    }

    // Tìm giáo viên theo ID
    private Teacher findTeacherById(String teacherId) {
        for (Teacher teacher : teachers) {
            if (teacher.getTeacherId().equals(teacherId)) {
                return teacher;
            }
        }
        return null;
    }

    // Xóa sinh viên khỏi khóa học
    public void removeStudentFromCourse(int courseId, String studentId) {
        Course course = findCourseById(courseId);
        Student student = findStudentById(studentId);
        if (course != null && student != null) {
            course.removeStudent(student);
        }
    }

    // Xóa khóa học khỏi hệ thống
    public void removeCourse(int courseId) {
        Course course = findCourseById(courseId);
        if (course != null) {
            courses.remove(course);
        }
    }

    // Xóa giáo viên khỏi hệ thống
    public void removeTeacher(String teacherId) {
        Teacher teacher = findTeacherById(teacherId);
        if (teacher != null) {
            teachers.remove(teacher);
        }
    }

    // Lấy danh sách các khóa học
    public List<Course> getCourses() {
        return courses;
    }
}
