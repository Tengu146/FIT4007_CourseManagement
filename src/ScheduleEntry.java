public class ScheduleEntry {
    private int courseId;
    private Schedule schedule;

    public ScheduleEntry(int courseId, Schedule schedule) {
        this.courseId = courseId;
        this.schedule = schedule;
    }

    // Getter và Setter
    public int getCourseId() {
        return courseId;
    }

    public Schedule getSchedule() {
        return schedule;
    }

    public void setSchedule(Schedule schedule) {
        this.schedule = schedule;
    }
}
