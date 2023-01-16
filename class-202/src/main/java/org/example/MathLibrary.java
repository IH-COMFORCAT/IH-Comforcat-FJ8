package org.example;

import java.util.*;

public class MathLibrary {

    public static int sum(int a, int b) {
        return a + b;
    }

    public static int[] sortArray(int[] array) {
        return Arrays.stream(array).sorted().toArray();
    }

}
