public class Main {
    public static void main(String[] args) {

        System.out.println("Hello world!");
        /*
        Esto es un comentario de bloque
        bla
         */

        // byte -128 a 127
        byte number1 = 30;
        // short 2 bytes: -32768 a 32767
        short number2 = 30000;
        // int 4 bytes: -2147483648 a 2147483647
        int number3 = 2000000;
        //long 8 bytes -9,223,372,036,854,775,808 a 9,223,372,036,854,775,807
        long number4 = -9223372036854775808l;
        //float 4 bytes :6 o 7 numeros decimales
        float number5 = 25.65f;
        //double 8 bytes: 15 decimales
        double number6 = 25.6578473;
        //1 bit
        boolean isTrue = true;
        char char1 = 'a';

        System.out.println(number5);

        //Operators
        System.out.println(10 + 5);
        System.out.println(number2 - 5);
        System.out.println(10 * 5);
        System.out.println(10 / 5);
        int result = 10 / 4;
        double resultDecimal = 10. / 4.;
        System.out.println(result);
        System.out.println(resultDecimal);
        System.out.println(10.0 / 4.0);
        System.out.println(10. % 4.);
        double myNumber = .10;

        int plus1 = 10;
        System.out.println(++plus1);
        System.out.println(plus1);
        plus1--;
        ++plus1;
        --plus1;

        plus1 += 10;
        plus1 = plus1 + 10;
        plus1 *= 5;
        plus1 -= 5;
        plus1 /= 7;

        int var1 = -5;

        if (var1 > 5) {
            System.out.println("It's bigger than 5!");
        } else if (var1 > 0) {
            System.out.println("It's bigger than 0!");
        } else {
            System.out.println("It's smaller than 0");
        }

        int dayOfTheWeek = 5;
        String whichDay = whichDayOfTheWeek(dayOfTheWeek);
        System.out.println(whichDay);


        String productName = "    Lavavajillas premium 01    ";
        String date = "18/01/2022";

        String result2 = productFormatter(productName, date);



        Integer wrapper = 5;
        int number = 5;
        char char2 = 'a';
        String name = "Jaume";
        System.out.println("Hello, my name is " + name);
        System.out.println(name.charAt(4));


        System.out.println(name.contains("fdfd"));
    }

    private static String productFormatter(String productName, String date) {
        return "LAVAVAJILLAS_PREMIUM_01-18/01/2022";
    }


    static String whichDayOfTheWeek(int dayOfTheWeek) {
        switch (dayOfTheWeek) {
            case 1:
                 return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return "Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            default:
                if (dayOfTheWeek < 0) {
                    return "Incorrrect";
                } else {
                    return "Weekend!!";
                }
        }
    }

}
