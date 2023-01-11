public class Main {
    public static void main(String[] args) {


        int[] array = {1, 3, -1, 17, 8, 3};
        difference(array);
        findTwoSmallest(array);
        calculateEquation(5, 8);

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
