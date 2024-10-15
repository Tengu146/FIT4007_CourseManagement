import java.util.Scanner;
import java.util.List;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CourseManagementSystem courseManagementSystem = new CourseManagementSystem();

        int choice;
        do {
            System.out.println("\nMENU:");
            System.out.println("1. Them khoa hoc");
            System.out.println("2. Them sinh vien vao khoa hoc");
            System.out.println("3. Them giao vien");
            System.out.println("4. Phan cong giao vien cho khoa hoc");
            System.out.println("5. Hien thi danh sach sinh vien trong khoa hoc");
            System.out.println("6. Hien thi thong tin khoa hoc");
            System.out.println("7. Xoa sinh vien khoi khoa hoc");  // Chức năng mới
            System.out.println("8. Xoa khoa hoc");                // Chức năng mới
            System.out.println("9. Xoa giao vien");               // Chức năng mới
            System.out.println("10. Hien thi danh sach khoa hoc"); // Chức năng mới
            System.out.println("0. Thoat");
            System.out.print("Nhap lua chon: ");
            choice = scanner.nextInt();
            scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập số

            switch (choice) {
                case 1:
                    themKhoaHoc(scanner, courseManagementSystem);
                    break;
                case 2:
                    themSinhVienVaoKhoaHoc(scanner, courseManagementSystem);
                    break;
                case 3:
                    themGiaoVien(scanner, courseManagementSystem);
                    break;
                case 4:
                    phanCongGiaoVienChoKhoaHoc(scanner, courseManagementSystem);
                    break;
                case 5:
                    hienThiSinhVienTrongKhoaHoc(scanner, courseManagementSystem);
                    break;
                case 6:
                    courseManagementSystem.printCourseDetails();
                    break;
                case 7:
                    xoaSinhVienKhoiKhoaHoc(scanner, courseManagementSystem);
                    break;
                case 8:
                    xoaKhoaHoc(scanner, courseManagementSystem);
                    break;
                case 9:
                    xoaGiaoVien(scanner, courseManagementSystem);
                    break;
                case 10:
                    hienThiDanhSachKhoaHoc(courseManagementSystem);
                    break;
                case 0:
                    System.out.println("Ket thuc chuong trinh!");
                    break;
                default:
                    System.out.println("Lua chon khong hop le!");
            }
        } while (choice != 0);

        scanner.close();
    }

    // Chức năng thêm khóa học
    private static void themKhoaHoc(Scanner scanner, CourseManagementSystem cms) {
        System.out.print("Nhap ID khoa hoc: ");
        int courseId = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống sau khi nhập số
        System.out.print("Nhap ten khoa hoc: ");
        String courseName = scanner.nextLine();

        Course course = new Course(courseId, courseName);
        cms.addCourse(course);  // Gọi qua CourseManagementSystem
        System.out.println("Da them khoa hoc thanh cong!");
    }

    // Chức năng thêm sinh viên vào khóa học
    private static void themSinhVienVaoKhoaHoc(Scanner scanner, CourseManagementSystem cms) {
        System.out.print("Nhap ID khoa hoc: ");
        int courseId = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống
        System.out.print("Nhap ID sinh vien: ");
        String studentId = scanner.nextLine();
        System.out.print("Nhap ten sinh vien: ");
        String studentName = scanner.nextLine();

        Student student = new Student(studentId, studentName);
        cms.addStudent(student);  // Gọi qua CourseManagementSystem
        cms.enrollStudent(courseId, studentId);  // Ghi danh sinh viên
        System.out.println("Da ghi danh sinh vien vao khoa hoc!");
    }

    // Chức năng thêm giáo viên
    private static void themGiaoVien(Scanner scanner, CourseManagementSystem cms) {
        System.out.print("Nhap ID giao vien: ");
        String teacherId = scanner.nextLine();
        System.out.print("Nhap ten giao vien: ");
        String teacherName = scanner.nextLine();

        Teacher teacher = new Teacher(teacherId, teacherName);
        cms.addTeacher(teacher);  // Gọi qua CourseManagementSystem
        System.out.println("Da them giao vien thanh cong!");
    }

    // Chức năng phân công giáo viên cho khóa học
    private static void phanCongGiaoVienChoKhoaHoc(Scanner scanner, CourseManagementSystem cms) {
        System.out.print("Nhap ID khoa hoc: ");
        int courseId = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống
        System.out.print("Nhap ID giao vien: ");
        String teacherId = scanner.nextLine();

        cms.assignTeacherToCourse(courseId, teacherId);  // Gọi qua CourseManagementSystem
        System.out.println("Da phan cong giao vien cho khoa hoc!");
    }

    // Chức năng hiển thị danh sách sinh viên trong khóa học
    private static void hienThiSinhVienTrongKhoaHoc(Scanner scanner, CourseManagementSystem cms) {
        System.out.print("Nhap ID khoa hoc: ");
        int courseId = scanner.nextInt();
        scanner.nextLine(); // Đọc bỏ dòng trống

        List<Student> studentList = cms.getEnrolledStudents(courseId);  // Lấy qua CourseManagementSystem
        if (studentList != null) {
            System.out.println("Danh sach sinh vien trong khoa hoc:");
            for (Student student : studentList) {
                System.out.println(student);
            }
        } else {
            System.out.println("Khong tim thay khoa hoc hoac chua co sinh vien nao ghi danh.");
        }
    }

    // Chức năng mới: Xóa sinh viên khỏi khóa học
    private static void xoaSinhVienKhoiKhoaHoc(Scanner scanner, CourseManagementSystem cms) {
        System.out.print("Nhap ID khoa hoc: ");
        int courseId = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Nhap ID sinh vien: ");
        String studentId = scanner.nextLine();

        cms.removeStudentFromCourse(courseId, studentId);  // Xóa sinh viên khỏi khóa học
        System.out.println("Da xoa sinh vien khoi khoa hoc!");
    }

    // Chức năng mới: Xóa khóa học
    private static void xoaKhoaHoc(Scanner scanner, CourseManagementSystem cms) {
        System.out.print("Nhap ID khoa hoc: ");
        int courseId = scanner.nextInt();
        scanner.nextLine();

        cms.removeCourse(courseId);  // Xóa khóa học khỏi hệ thống
        System.out.println("Da xoa khoa hoc thanh cong!");
    }

    // Chức năng mới: Xóa giáo viên
    private static void xoaGiaoVien(Scanner scanner, CourseManagementSystem cms) {
        System.out.print("Nhap ID giao vien: ");
        String teacherId = scanner.nextLine();

        cms.removeTeacher(teacherId);  // Xóa giáo viên khỏi hệ thống
        System.out.println("Da xoa giao vien thanh cong!");
    }

    // Chức năng mới: Hiển thị danh sách các khóa học
    private static void hienThiDanhSachKhoaHoc(CourseManagementSystem cms) {
        List<Course> courses = cms.getCourses();  // Lấy danh sách các khóa học từ hệ thống
        if (courses != null && !courses.isEmpty()) {
            System.out.println("Danh sach cac khoa hoc:");
            for (Course course : courses) {
                System.out.println(course);
            }
        } else {
            System.out.println("Khong co khoa hoc nao trong he thong.");
        }
    }
}
