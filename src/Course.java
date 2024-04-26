
public class Course {
    private int courseID;
    private String courseName;
    private int categoryID;
    private int instructorID;

    public Course(int courseID, String courseName, int categoryID, int instructorID) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.categoryID = categoryID;
        this.instructorID = instructorID;
    }

    public int getCourseID() {
        return courseID;
    }

    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCategoryID() {
        return categoryID;
    }

    public void setCategoryID(int categoryID) {
        this.categoryID = categoryID;
    }

    public int getInstructorID() {
        return instructorID;
    }

    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
    }

    @Override
    public String toString() {
        return "Course ID: " + courseID + ", Course Name: " + courseName;
    }
}
