package ua.bondarenkojek.hw1;

public class Ranges {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 5, 8, 9, 10, 13, 14, 15, 15, 17};
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
            } else {
                appendRange(result, minRange, maxRange);
                minRange = array[i];
                maxRange = array[i];
            }
        }
        appendRange(result, minRange, maxRange);

//output [1 3][5][8 10][13 15][15][17]
        System.out.println(result);
    }

    private static void appendRange(StringBuilder result, int min, int max) {
        result.append("[");
        result.append(min);
        if (min != max) {
            result.append(" ");
            result.append(max);
        }
        result.append("]");
    }
}
