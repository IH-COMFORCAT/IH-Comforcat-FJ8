package org.example;

public class OddNumber {

    public static int[] createArray(int num) {
        if(num <= 0) return new int[0];
        int[] arrayResult;
        int index = 0;

        /*
        if(num % 2 == 0){
            arrayResult = new int[num / 2];
        }
        else{
            arrayResult = new int[(num / 2) + 1];
        }
        */

        arrayResult = num % 2 == 0? new int[(int) Math.floor(num/2)] : new int[(int) Math.floor(num/2) + 1];

        for(int i = 1 ; i <= num ; i++){
            if(i % 2 != 0){
                arrayResult[index] = i;
                index++;
            }

        }
        return arrayResult;
    }
}
