import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class InstructorManager {
    private final List<Instructor> instructors;

    public InstructorManager() {
        this.instructors=new ArrayList<Instructor>(); //this.instructors = new ArrayList<>();
        instructors.add(new Instructor(1,"Engin Demiroğ"));
        instructors.add(new Instructor(2,"Halit Enes Kalaycı"));

    }

    // Eğitmen ekleme
    public void addInstructor(Instructor instructor) {
        instructors.add(instructor);
    }

    // Eğitmen listeleme
    public void listInstructors() {
        for (Instructor instructor : instructors) {
            System.out.println(instructor);
        }
    }

    // Eğitmen silme
    public void deleteInstructor(int id) {
        Iterator<Instructor> iterator = instructors.iterator();
        while (iterator.hasNext()) {
            Instructor instructor = iterator.next();
            if (instructor.getInstructorID() == id) {
                iterator.remove();
                System.out.println("Kurs silindi: " + instructor);
                return;
            }
        }
        System.out.println("ID'si " + id + " olan eğitmen bulunamadı.");
    }

    // eğitmen güncelleme işlemi
    public void updateInstructor(int id, String newName) {
        for (Instructor instructor : instructors) {
            if (instructor.getInstructorID() == id) {
                instructor.setInstructorName(newName);
                System.out.println("Eğitmen güncellendi: " + instructor);
                return;
            }
        }
        System.out.println("ID'si " + id + " olan eğitmen bulunamadı.");
    }

    // ID'ye göre eğitmen getirme
    public String getInstructorById(int id) {
        for (Instructor instructor : instructors) {
            if (instructor.getInstructorID() == id) {
                return instructor.getInstructorName();
            }
        }
        return null;
    }
}

