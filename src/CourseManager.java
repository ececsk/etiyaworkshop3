import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CourseManager {
    private final List<Course> courses;

    public CourseManager() {
        this.courses = new ArrayList<>();
        courses.add(new Course(1, "Yazılım Geliştirici Yetiştirme Kampı (C# + ANGULAR)", 1, 1));
        courses.add(new Course(2, "Programlamaya Giriş için Temel Kurs", 1, 1));
        courses.add(new Course(3, "Yazılım Geliştirici Yetiştirme Kampı - Python & Selenium", 1, 2));
    }

    // Kurs ekleme
    public void addCourse(Course course) {
        if (course != null) {
            courses.add(course);
            System.out.println("Kurs eklendi: " + course);
        } else {
            System.out.println("Geçersiz kurs bilgisi.");
        }
    }

    // Kurs listeleme
    public List<Course> listCourses() {
        return new ArrayList<>(courses);
    }

    // Kurs silme
    public void deleteCourse(int id) {
        Iterator<Course> iterator = courses.iterator();
        while (iterator.hasNext()) {
            Course course = iterator.next();
            if (course.getCourseID() == id) {
                iterator.remove();
                System.out.println("Kurs silindi: " + course);
                return;
            }
        }
        System.out.println("ID'si " + id + " olan kurs bulunamadı.");
    }

    // Kurs güncelleme işlemi
    public void updateCourse(int id, String newName) {
        for (Course course : courses) {
            if (course.getCourseID() == id) {
                course.setCourseName(newName);
                System.out.println("Kurs güncellendi: " + course);
                return;
            }
        }
        System.out.println("ID'si " + id + " olan kurs bulunamadı.");
    }

    // ID'ye göre kurs getirme
    public Course getCourseById(int id) {
        for (Course course : courses) {
            if (course.getCourseID() == id) {
                return course;
            }
        }
        return null;
    }
}
