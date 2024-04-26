/*Kodlamaio sitesindeki Kurs, Kategori ve eğitmen
nesnelerini modelleyip koda dökünüz.
Tüm nesneler için CRUD (listeleme, ekleme, silme, güncelleme, id ye göre getirme)
 kodlarını yazınız. Kodlarınızı githuba atıp paylaşınız.*/
import java.util.List;
public class Main {
    public static void main(String[] args) {
        //Instructor
        InstructorManager instructorManager = new InstructorManager();
        Instructor newInstructor = new Instructor(3, "Muhammed İnan");
        instructorManager.addInstructor(newInstructor);

        // Tüm eğitmenleri listeleme
        System.out.println("Tüm eğitmenler:");
        instructorManager.listInstructors();

        // Eğitmen güncelleme
        int instructorIdToUpdate = 2;
        String newName = "Güncelleme Deneme";
        instructorManager.updateInstructor(instructorIdToUpdate, newName);

        // Güncellenmiş eğitmenleri listeleme
        System.out.println("\nGüncellenmiş eğitmen listesi:");
        instructorManager.listInstructors();

        // Eğitmen silme
        int instructorIdToDelete = 1;
        instructorManager.deleteInstructor(instructorIdToDelete);

        // Kalan eğitmenleri listeleme
        System.out.println("\nKalan eğitmenler:");
        instructorManager.listInstructors();

        // ID'ye göre eğitmen getirme
        int instructorIdToFind = 3;
        String foundInstructor = instructorManager.getInstructorById(instructorIdToFind);
        if (foundInstructor != null) {
            System.out.println("\nID'si " + instructorIdToFind + " olan eğitmen: " + foundInstructor);
        } else {
            System.out.println("\nID'si " + instructorIdToFind + " olan eğitmen bulunamadı.");
        }

        // Course

        CourseManager courseManager = new CourseManager();
        Course newCourse = new Course(4, "Java ile Veri Yapıları ve Algoritmalar", 1, 1);
        courseManager.addCourse(newCourse);

        // Tüm kursları listeleme
        System.out.println("\nTüm kurslar:");
        List<Course> allCourses = courseManager.listCourses();
        for (Course course : allCourses) {
            System.out.println(course);
        }

        // Kurs güncelleme
        int courseIdToUpdate = 2;
        String newCourseName = "Kurs güncelleme denemesi";
        courseManager.updateCourse(courseIdToUpdate, newCourseName);

        // Güncellenmiş kursları listeleme
        System.out.println("\nGüncellenmiş kurs listesi:");
        allCourses = courseManager.listCourses();
        for (Course course : allCourses) {
            System.out.println(course);
        }

        // Kurs silme
        int courseIdToDelete = 1;
        courseManager.deleteCourse(courseIdToDelete);

        // Kalan kursları listeleme
        System.out.println("\nKalan kurslar:");
        allCourses = courseManager.listCourses();
        for (Course course : allCourses) {
            System.out.println(course);
        }

        // ID'ye göre kurs getirme
        int courseIdToFind = 4;
        Course foundCourse = courseManager.getCourseById(courseIdToFind);
        if (foundCourse != null) {
            System.out.println("\nID'si " + courseIdToFind + " olan kurs: " + foundCourse.getCourseName());
        } else {
            System.out.println("\nID'si " + courseIdToFind + " olan kurs bulunamadı.");
        }

        // Category
        CategoryManager categoryManager = new CategoryManager();
        Category newCategory = new Category(2, "Yapay Zeka");
        categoryManager.addCategory(newCategory);

        // Tüm kategorileri listeleme
        System.out.println("\nTüm kategoriler:");
        List<Category> allCategories = categoryManager.getAllCategories();
        for (Category category : allCategories) {
            System.out.println(category);
        }

        // Kategori güncelleme
        int categoryIdToUpdate = 1;
        String newCategoryName = "Web Geliştirme";
        categoryManager.updateCategory(categoryIdToUpdate, newCategoryName);

        // Güncellenmiş kategorileri listeleme
        System.out.println("\nGüncellenmiş kategoriler:");
        allCategories = categoryManager.getAllCategories();
        for (Category category : allCategories) {
            System.out.println(category);
        }

        // Kategori silme
        int categoryIdToDelete = 2;
        categoryManager.deleteCategory(categoryIdToDelete);

        // Kalan kategorileri listeleme
        System.out.println("\nKalan kategoriler:");
        allCategories = categoryManager.getAllCategories();
        for (Category category : allCategories) {
            System.out.println(category);
        }
    }
}
