import java.util.Arrays;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int myIntValue = 10;
        int anotherIntValue = myIntValue;
        System.out.println("My int value = " + myIntValue);
        System.out.println("Another value = " + anotherIntValue);

        anotherIntValue++;
        System.out.println("My int value = " + myIntValue);
        System.out.println("Another value = " + anotherIntValue);

        int[] myIntArray = new int[5];
        int[] anotherArray = myIntArray;

        System.out.println("My int array = " + Arrays.toString(myIntArray));
        System.out.println("Another array = " + Arrays.toString(anotherArray));

        anotherArray[0] = 1;
        System.out.println("My int array after change = " + Arrays.toString(myIntArray));
        System.out.println("Another array after change = " + Arrays.toString(anotherArray));

        anotherArray = new int[] {4, 5, 6, 7, 8};
        modifyArray(myIntArray);
        System.out.println("My int array after modify = " + Arrays.toString(myIntArray));
        System.out.println("Another array after modify = " + Arrays.toString(anotherArray));
    }

    private static void modifyArray(int[] array) {
        array[0] = 2;
        array = new int[] {1, 2, 3, 4, 5};
    }

    private static int[] readIntegers(int count) {
        Scanner scanner = new Scanner(System.in);
        int[] array = new int[count];
        for(int i = 0; i< array.length; i++) {
            array[i] = scanner.nextInt();
        }
        return array;
    }

    private static int findMin(int[] array) {
        int minValue = array[0];
        for(int i = 0; i < array.length; i++) {
            if(array[i] < minValue) {
                minValue = array[i];
            }
        }
        return minValue;
    }
}
