import java.util.ArrayList;
import java.util.List;

public class CourseManagementSystem {
    private List<Student> students = new ArrayList<>();
    private List<Teacher> instructors = new ArrayList<>();
    private List<Course> courses = new ArrayList<>();

        // ... Các phương thức khác của hệ thống

        // Phương thức thêm một khóa học
        public void addCourse(Course course) {
            courses.add(course);
        }

        // Phương thức tìm kiếm khóa học theo mã
        public Course findCourseById(int courseId) {
            for (Course course : courses) {
                if (course.getCourseId() == courseId) {
                    return course;
                }
            }
            return null;
        }

        // Phương thức cập nhật thông tin của một khóa học
        public void updateCourse(Course updatedCourse) {
            Course course = findCourseById(updatedCourse.getCourseId());
            if (course != null) {
                course.setCourseName(updatedCourse.getCourseName());
                // ... cập nhật các thuộc tính khác
            }
        }

        // Phương thức xóa một khóa học
        public void deleteCourse(int courseId) {
            courses.removeIf(course -> course.getCourseId() == courseId);
        }

        // Phương thức hiển thị thông tin tất cả các khóa học
        public void displayAllCourses() {
            for (Course course : courses) {
                System.out.println(course); // Giả sử lớp Course đã override phương thức toString()
            }
        }
    }

