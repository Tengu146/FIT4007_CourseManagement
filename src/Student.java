import java.util.ArrayList;
import java.util.List;

public class Student {
    private String studentID;
    private String studentName;

    // Constructor
    public Student(String studentID, String studentName) {
        this.studentID = studentID;
        this.studentName = studentName;
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

    public static class Timetable {
        private List<ScheduleEntry> schedules;  // Danh sách các lịch học

        public Timetable() {
            schedules = new ArrayList<>();
        }

        // Thêm hoặc cập nhật lịch học cho một khóa học
        public void addOrUpdateSchedule(int courseId, Schedule schedule) {
            boolean found = false;
            // Tìm khóa học đã có trong danh sách
            for (ScheduleEntry entry : schedules) {
                if (entry.getCourseId() == courseId) {
                    entry.setSchedule(schedule);  // Cập nhật lịch học
                    found = true;
                    System.out.println("Đã cập nhật lịch học cho khóa học ID: " + courseId);
                    break;
                }
            }
            // Nếu không tìm thấy, thêm mới
            if (!found) {
                schedules.add(new ScheduleEntry(courseId, schedule));
                System.out.println("Đã thêm lịch học mới cho khóa học ID: " + courseId);
            }
        }

        // Lấy lịch học cho một khóa học
        public Schedule getSchedule(int courseId) {
            for (ScheduleEntry entry : schedules) {
                if (entry.getCourseId() == courseId) {
                    return entry.getSchedule();
                }
            }
            return null;  // Trả về null nếu không tìm thấy lịch học
        }

        // Xóa lịch học cho một khóa học
        public void removeSchedule(int courseId) {
            schedules.removeIf(entry -> entry.getCourseId() == courseId);
            System.out.println("Đã xóa lịch học cho khóa học ID: " + courseId);
        }

        // Hiển thị toàn bộ lịch học
        public void displayAllSchedules() {
            if (schedules.isEmpty()) {
                System.out.println("Hiện không có lịch học nào.");
            } else {
                for (ScheduleEntry entry : schedules) {
                    System.out.println("Khóa học ID: " + entry.getCourseId() + " - " + entry.getSchedule());
                }
            }
        }
    }
}
