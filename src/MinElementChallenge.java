import java.util.Scanner;

public class MinElementChallenge {
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Enter count: ");
        int count = scanner.nextInt();
        scanner.nextLine();

        int[] returnedArray = readElements(count);
        int returnedMin = findMin(returnedArray);
        System.out.println("Min value = " + returnedMin);

    }

    private static int readInteger() {
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        return number;
    }

    private static int[] readElements(int count) {
        int[] array = new int[count];
        for(int i = 0; i< array.length; i++) {
            System.out.println("Enter a value: ");
            int number = scanner.nextInt();
            scanner.nextLine();
            array[i] = number;
        }
        return array;
    }

    private static int findMin(int[] array) {
        int min = Integer.MAX_VALUE;
        for(int i = 0; i < array.length; i++) {
            int value = array[i];
            if(value < min) {
                min = value;
            }
        }
        return min;
    }
}
