package ua.bondarenkojek.hw1;

import java.util.Arrays;

public class RestoreArray {
    public static void main(String[] args) {
        int[] array = {1, 2, -1, 4, 7, 6, -2, 4};

//output 1 2 3 4 7 6 5 4
        System.out.println(Arrays.toString(restore(array.length, array)));
    }

    public static int[] restore(int length, int[] array) {
        int[] restoreArray = Arrays.copyOf(array, length);

        for (int i = 1; i < length - 1; i++) {
            if (restoreArray[i] < 0) {
                restoreArray[i] = (restoreArray[i - 1] + restoreArray[i + 1])/2;
            }
        }
        return restoreArray;
    }
}
