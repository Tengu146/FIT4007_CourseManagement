public class Course {
    private int courseId;
    private String courseName;
    private String instructor;
    private String description;
    private int startDate;
    private int endDate;

    // Constructor
    public Course(int courseId, String courseName, String instructor, String description, int startDate, int endDate) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.instructor = instructor;
        this.description = description;
        this.startDate = startDate;
        this.endDate = endDate;
    }

    public Course() {
    }
    // Getter và setter

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getStartDate() {
        return startDate;
    }

    public void setStartDate(int startDate) {
        this.startDate = startDate;
    }

    public int getEndDate() {
        return endDate;
    }

    public void setEndDate(int endDate) {
        this.endDate = endDate;
    }

    @Override
    public String toString() {
        return "Course{" +
                "courseId=" + courseId +
                ", courseName='" + courseName + '\'' +
                ", instructor='" + instructor + '\'' +
                ", startDate=" + startDate +
                ", endDate=" + endDate +
                '}';
    }
}