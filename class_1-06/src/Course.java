public class Course {
    private final int classId;
    private static int counter = 0;
    private String title;
    private int capacity;
    private int studentCount;

    public Course(String title, int capacity, int studentCount) {
        this.classId = counter++;
        this.title = title;
        setCapacity(capacity);
        setStudentCount(studentCount);
    }

    private void setCapacity(int capacity) {
        this.capacity = capacity < 0 ? 100 : capacity;
        /*
        La línea de arriba equivale a esto:
        if (capacity < 0) {
            this.capacity = 100;
        } else {
            this.capacity = capacity;
        }
         */
    }

    public int getClassId() {
        return classId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCapacity() {
        return capacity;
    }

    public int getStudentCount() {
        return studentCount;
    }

    public void setStudentCount(int studentCount) {
        if (studentCount > capacity || studentCount < 0) {
            System.err.println("Error");
        } else {
            this.studentCount = studentCount;
        }
    }
}
