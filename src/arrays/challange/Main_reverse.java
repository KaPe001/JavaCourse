package arrays.challange;

import java.util.Arrays;

public class Main_reverse {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 11, 9, 15};
        System.out.println("Array is equal to: " + Arrays.toString(array));
        reverse(array);

        System.out.println("Reversed array is: " + Arrays.toString(array));
    }

    private static void reverse(int[] array) {
        int maxIndex = array.length - 1;
        int halfLength = array.length / 2;

        for(int i = 0; i < halfLength; i++) {
            int temp = array[i];
            array[i] = array[maxIndex - i];
            array[maxIndex - i] = temp;
        }
    }
}
