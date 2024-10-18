public class Schedule {
    private String dayOfWeek;  // Ngày học (ví dụ: Thứ Hai)
    private String startTime;  // Giờ bắt đầu (ví dụ: 08:00)
    private String endTime;    // Giờ kết thúc (ví dụ: 10:00)

    public Schedule(String dayOfWeek, String startTime, String endTime) {
        this.dayOfWeek = dayOfWeek;
        this.startTime = startTime;
        this.endTime = endTime;
    }

    // Getter và Setter
    public String getDayOfWeek() {
        return dayOfWeek;
    }

    public void setDayOfWeek(String dayOfWeek) {
        this.dayOfWeek = dayOfWeek;
    }

    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public String getEndTime() {
        return endTime;
    }

    public void setEndTime(String endTime) {
        this.endTime = endTime;
    }

    @Override
    public String toString() {
        return dayOfWeek + ": " + startTime + " - " + endTime;
    }
}
