public class TheoreticalCourse extends Course {

    private int numberOfLectures;
    private int numberOfCredits;

    public TheoreticalCourse(String title, int capacity, int studentCount, int numberOfLectures, int numberOfCredits) {
        super(title, capacity, studentCount, new Professor("Jaume", 1231231.20, ""));
        setNumberOfLectures(numberOfLectures);
        setNumberOfCredits(numberOfCredits);
    }

    public int getNumberOfLectures() {
        return numberOfLectures;
    }

    public void setNumberOfLectures(int numberOfLectures) {
        if (numberOfLectures < 0) {
            System.err.println("Error");
        } else {
            this.numberOfLectures = numberOfLectures;
        }
    }

    public int getNumberOfCredits() {
        return numberOfCredits;
    }

    public void setNumberOfCredits(int numberOfCredits) {
        this.numberOfCredits = numberOfCredits;
    }
}
