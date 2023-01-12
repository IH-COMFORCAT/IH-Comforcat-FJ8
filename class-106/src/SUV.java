public class SUV extends Car {

    private boolean is4wd;
    private boolean hasTowCapacity;

    public SUV(String brand, String model, int cc, boolean hasAirConditioned, String licensePlate, boolean is4wd, boolean hasTowCapacity) {
        /*
         new Car(brand, model, cc, hasAirConditioned, licensePlate)
         */
        super(brand, model, cc, hasAirConditioned, licensePlate);
        this.is4wd = is4wd;
        this.hasTowCapacity = hasTowCapacity;
    }

    public boolean isIs4wd() {
        return is4wd;
    }

    public void setIs4wd(boolean is4wd) {
        this.is4wd = is4wd;
    }

    public boolean isHasTowCapacity() {
        return hasTowCapacity;
    }

    public void setHasTowCapacity(boolean hasTowCapacity) {
        this.hasTowCapacity = hasTowCapacity;
    }

    @Override
    public void moveForward() {
        System.out.println("Avanzando en mi todoterreno");
        super.moveForward(15);
    }

    @Override
    public String toString() {
        return super.toString() +
                "is4wd=" + is4wd +
                ", hasTowCapacity=" + hasTowCapacity +
                '}';
    }
}
