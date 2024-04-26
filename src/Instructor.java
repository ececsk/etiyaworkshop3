public class Instructor {
    private int instructorID;
    private String instructorName;



    public Instructor(int instructorID, String instructorName) {
        this.instructorID = instructorID;
        this.instructorName = instructorName;
    }


    public int getInstructorID() {
        return instructorID;
    }
    public void setInstructorID(int instructorID) {
        this.instructorID = instructorID;
    }


    public String getInstructorName() {
        return instructorName;
    }
    public void setInstructorName(String instructorName) {
        this.instructorName = instructorName;
    }

    @Override
    public String toString() {
        return "Instructor ID: " + instructorID + ", Instructor Name: " + instructorName;
    }
}
