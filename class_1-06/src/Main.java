import java.math.*;

public class Main {
    public static void main(String[] args) throws InterruptedException {


        int[] array = {1, 3, -1, 17, 8, 3};
        difference(array);
        findTwoSmallest(array);
        calculateEquation(5, 8);

        Car myNewCar = new Car("Ford", "Fiesta", 1600, true, "54678JBR");

        Car myOldCar = new Car("Ford", "Focus", 1200, true, "55050BVB", 45000);

        Car myNewOtherCar = new Car("Audi", "Q3", 2000, true);

        System.out.println(myNewOtherCar.getLicensePlate());

        myNewOtherCar.setLicensePlate("58272KLK");

        System.out.println(myNewOtherCar.getLicensePlate());




        myNewOtherCar.moveForward();
        myNewOtherCar.moveForward();
        myNewOtherCar.moveForward();

        System.out.println(myNewOtherCar.getMileage());
        myNewOtherCar.moveForward(150);
        System.out.println(myNewOtherCar.getMileage());

        System.out.println(Car.getTotalCars());



        myNewCar.setCc(-100);
        Thread.sleep(100);

        System.out.println(myNewCar.getCc());


        System.out.println("===HERENCIA===");

        SUV mySUV = new SUV("Mercerdes", "GLA", 1600, true, "324234BAC", false, false);

        int[] nums = {1, 2, 3, 5, 6};
        String[] names ={"Pepe", "Antonio", "Maria"};
        Car[] myCars = {myNewCar, myOldCar, myNewOtherCar, mySUV};

        for (Car car : myCars) {
            System.out.println(car.getBrand() + " " + car.getModel());

            if (car instanceof SUV) {
                ((SUV) car).moveForward();
            }
        }

        printArray(new int[] {1, 3, 4, 6, 8});

        double a = 0.7;
        double b = 0.2;

        System.out.println(a+b);

        BigDecimal bdA = new BigDecimal(a).setScale(1, RoundingMode.HALF_EVEN);
        BigDecimal bdB = new BigDecimal(b).setScale(1, RoundingMode.HALF_UP);

        System.out.println((bdA.multiply(bdB)).divide(new BigDecimal("2")));
        System.out.println(performOperation(new BigDecimal("5")));       

    }

    public static BigDecimal performOperation(BigDecimal x) {
        BigDecimal a = x.multiply(new BigDecimal("2.3")).add(new BigDecimal("1.5"));
        BigDecimal b = x.subtract(new BigDecimal("0.8"));
        return a.divide(b, 2, RoundingMode.HALF_UP);
    }

    public static void printArray(int[] numbers) {

    }

    public static void calculateEquation(double x, double y) {
        double result = Math.pow(x, 2) + Math.pow(((4*y/5)-x),2);
        System.out.println(result);
    }

    public static void findTwoSmallest(int[] numbers) {
        int smallest, secondSmallest;
        smallest = Integer.MAX_VALUE;
        secondSmallest = Integer.MAX_VALUE;

        for (int num : numbers) {
            if (num < smallest) {
                secondSmallest = smallest;
                smallest = num;
            }

            if (num < secondSmallest && num > smallest){
                secondSmallest = num;
            }
        }

        System.out.println("Smallest: " + smallest);
        System.out.println("Second Smallest: " + secondSmallest);
    }

    public static void difference(int[] numbers) {

        int min, max;

        min = numbers[0];
        max = numbers[0];

        for(int num : numbers) {
            if (num <= min) min = num;
            if (num >= max) max = num;
        }
        System.out.println(max - min);
    }
}
