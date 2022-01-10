package exercises;

public class ForLoop {
    public static void main(String[] args) {
        System.out.println("$10 000 at 2% interest = " + calculateInterest(10000.0, 2.0));
        System.out.println("$10 000 at 3% interest = " + calculateInterest(10000.0, 3.0));
        System.out.println("$10 000 at 4% interest = " + calculateInterest(10000.0, 4.0));
        System.out.println("$10 000 at 5% interest = " + calculateInterest(10000.0, 5.0));

        for (int i = 0; i < 5; i++) {
            System.out.println("Loop " + i + " hello!");
        }

        // using the for statement, call the calculateInterest method with
        // the amount of 10000 with an interestRate of 2,3,4,5,6,7, and 8
        // and print the results to the console window.

        // How would you modify the for loop above to do the same thing as
        // shown but to start from 8% and work back to 2%

        // Create a for statement using any range of numbers
        // Determine if the number is a prime number using the isPrime method
        // if it is a prime number, print it out AND increment a count of the
        // number of prime numbers found
        // if that count is 3 exit the for loop
        // hint:  Use the break; statement to exit

        for (int i = 2; i < 9; i++) {
            System.out.println("$10 000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
            //"%.2f" converting data to have value up to 2 decimal numbers
        }

        System.out.println("\n" + "Now we want start from 8% to 2% " + "\n");
        for (int i = 8; i >= 2; i--) {
            System.out.println("$10 000 at " + i + "% interest = " + String.format("%.2f", calculateInterest(10000.0, i)));
        }

        int count = 0;
        for (int i = 10; i < 50; i++) {
            if (isPrime(i)) {
                count++;
                System.out.println("Number " + i + " is prime number");
                if(count == 10){
                    System.out.println("Exiting for loop");
                    break;
                }
            }
        }
    }
    public static boolean isPrime(int n){
            if(n == 1){
                return false;
            }
            for(int i=2; i <= (long) Math.sqrt(n); i++){
                System.out.println("Lopping" + i);
                if(n% i ==0){
                    return false;
            }
        }
            return true;
    }

    public static double calculateInterest(double amount, double interestRate) {
        return amount * (interestRate / 100);
        }
    }
