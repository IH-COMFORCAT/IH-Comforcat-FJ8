public class PracticalCourse extends Course{
    private String address;
    private int numberOfTools;
    private String[] resources;

    public PracticalCourse(String title, int capacity, int studentCount, String address, int numberOfTools, String[] resources) {
        super(title, capacity, studentCount, new Professor("Jaume", 1231231.20, ""));
        this.address = address;
        this.numberOfTools = numberOfTools;
        this.resources = resources;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getNumberOfTools() {
        return numberOfTools;
    }

    public void setNumberOfTools(int numberOfTools) {
        this.numberOfTools = numberOfTools;
    }

    public String[] getResources() {
        return resources;
    }

    public void setResources(String[] resources) {
        this.resources = resources;
    }
}
