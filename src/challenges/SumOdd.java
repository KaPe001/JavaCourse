package challenges;

public class SumOdd {

    //write a method called isOdd with an int parameter called number.
    //the method needs to return a boolean. check that number is > 0,
    //if it's not, return false.

    //write a second method called sumOdd that has 2 parameters start and end, which
    //represent a range of numbers. This method should use a for loop to sum all odd
    //numbers in that range including the end and return the sum.
    //It should call the method isOdd to check if each number is odd.

    public static boolean isOdd(int number){
        if(number <= 0){
            return false;
        }
        return number % 2 != 0;
    }

    public static int sumOdd(int start, int end) {
        int sum = 0;
        if ((end <= start) || (start < 0) || (end < 0)) {
            return -1;
        }
        for (int i = start; i <= end; i++) {
            if(isOdd(i)){
                sum += i;
                }
            }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(sumOdd(1, 100));
        System.out.println(sumOdd(-1, 100));
        System.out.println(sumOdd(100, 100));
        System.out.println(sumOdd(13, 13));
        System.out.println(sumOdd(100, -100));
        System.out.println(sumOdd(100, 1000));
        System.out.println(sumOdd(10, 5));
    }
}
