public class Teacher {
    private String teacherId;
    private String name;

    // Constructor
    public Teacher(String teacherId, String name) {
        this.teacherId = teacherId;
        this.name = name;
    }

    public Teacher() {
    }

    // Getter cho ID giáo viên
    public String getTeacherId() {
        return teacherId;
    }

    // Getter cho tên giáo viên
    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Teacher ID: " + teacherId + ", Name: " + name;
    }
}
