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
