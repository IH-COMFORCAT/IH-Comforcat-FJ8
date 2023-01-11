
public class Car {
    private static final int wheels = 4;
    private static int totalCars = 0;
    private String brand;
    private String model;
    private int cc;
    private boolean hasAirConditioned;
    private String licensePlate;
    private int mileage;

    public Car(String brand, String model, int cc, boolean hasAirConditioned, String licensePlate) {
        totalCars++;
        setBrand(brand);
        this.model = model;
        this.cc = cc;
        this.hasAirConditioned = hasAirConditioned;
        this.licensePlate = licensePlate;
        this.mileage = 0;
    }

    public Car(String brand, String model, int cc, boolean hasAirConditioned, String licensePlate, int mileage) {
        totalCars++;
        this.brand = brand;
        this.model = model;
        this.cc = cc;
        this.hasAirConditioned = hasAirConditioned;
        this.licensePlate = licensePlate;
        this.mileage = mileage;
    }

    public Car(String brand, String model, int cc, boolean hasAirConditioned) {
        totalCars++;
        this.brand = brand;
        this.model = model;
        this.cc = cc;
        this.hasAirConditioned = hasAirConditioned;
    }

    public void setLicensePlate(String licensePlate) {
        this.licensePlate = licensePlate;
    }

    public int getMileage() {
        return mileage;
    }

    public void setMileage(int mileage) {
        this.mileage = mileage;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        if (brand.length() < 1) {
            System.out.println("Error");
        } else {
            this.brand = brand;
        }
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCc() {
        return cc;
    }

    public void setCc(int cc) {
        if (cc <= 0) {
            System.err.println("Error");
        } else {
            this.cc = cc;
        }
    }

    public boolean isHasAirConditioned() {
        return hasAirConditioned;
    }

    public void setHasAirConditioned(boolean hasAirConditioned) {
        this.hasAirConditioned = hasAirConditioned;
    }

    public String getLicensePlate() {
        return licensePlate;
    }

    public void moveForward() {
        System.out.println("Avazando!");
        this.mileage += 10;
    }

    public void moveForward(int kilometers) {
        System.out.println("Avanzando " + kilometers + " kilómetros");
        this.mileage += kilometers;
    }

    public static int getTotalCars() {
        return totalCars;
    }
}
