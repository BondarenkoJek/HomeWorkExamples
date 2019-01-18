package ua.bondarenkojek.hw1;

public class Ranges {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 8, 9, 10, 13, 14, 15, 16};
        printRanges(array.length, array);
    }

    public static void printRanges(int length, int[] array) {
        if (length < 1) {
            return;
        }

        StringBuilder result = new StringBuilder();

        int minRange = array[0];
        int maxRange = array[0];

        for (int i = 1; i < length; i++) {
            if ((maxRange + 1) == array[i]) {
                maxRange++;
                if (i == length - 1) {
                    appendRange(result, minRange, maxRange);
                }
            } else {
                appendRange(result, minRange, maxRange);
                minRange = array[i];
                maxRange = array[i];
            }
        }

//output [1 3][5][8 10][13 16]
        System.out.println(result);
    }

    private static void appendRange(StringBuilder result, int min, int max) {
        result.append("[");
        if (min == max) {
            result.append(min);
        } else {
            result.append(min);
            result.append(" ");
            result.append(max);
        }
        result.append("]");
    }
}
