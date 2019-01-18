package ua.bondarenkojek.hw1;

import java.util.Arrays;

public class ArrayRotation {
    public static void main(String[] args) {
        int[] array = {5, 6, 1, 2, 6};

//output 1 2 6 5 6
        Arrays.stream(rotation(array.length, 2, array)).forEach(System.out::println);
    }

    public static int[] rotation(int length, int k, int[] array) {
        if (k >= length) {
            k = k % length;
        }

        if (k < 1 || length < 2) {
            return array;
        }

        int tmp = array[0];
        for (int i = 0; i < length - 1; i++) {
            array[i] = array[i + 1];
        }
        array[length - 1] = tmp;

        return rotation(length, --k, array);
    }
}
