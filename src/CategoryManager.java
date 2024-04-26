import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class CategoryManager {
    private final List<Category> categories;

    public CategoryManager() {
        this.categories = new ArrayList<>();
        categories.add(new Category(1, "Programlama"));
    }

    // Kategori ekleme
    public void addCategory(Category category) {
        if (category != null) {
            categories.add(category);
            System.out.println("Kategori eklendi: " + category);
        } else {
            System.out.println("Geçersiz kategori bilgisi.");
        }
    }

    // Kategori listeleme
    public List<Category> getAllCategories() {
        return new ArrayList<>(categories);
    }

    // Kategori silme
    public void deleteCategory(int id) {
        Iterator<Category> iterator = categories.iterator();
        while (iterator.hasNext()) {
            Category category = iterator.next();
            if (category.getCategoryID() == id) {
                iterator.remove();
                System.out.println("Kategori silindi: " + category);
                return;
            }
        }
        System.out.println("ID'si " + id + " olan kategori bulunamadı.");
    }

    // Kategori güncelleme
    public void updateCategory(int id, String newName) {
        for (Category category : categories) {
            if (category.getCategoryID() == id) {
                category.setCategoryName(newName);
                System.out.println("Kategori güncellendi: " + category);
                return;
            }
        }
        System.out.println("ID'si " + id + " olan kategori bulunamadı.");
    }

    // ID'ye göre kategori getirme
    public Category getCategoryById(int id) {
        for (Category category : categories) {
            if (category.getCategoryID() == id) {
                return category;
            }
        }
        return null;
    }
}
