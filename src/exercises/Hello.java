package exercises;

public class Hello {
    public static void main(String[] args){
        String name = "Kinga";
        System.out.println("exercises.Hello " + name + "!");

        int myFirstValue = (10 + 5) + (2 * 10);
        int mySecondValue = 12;
        int myThirdValue = myFirstValue * 2;
        int myTotal = myFirstValue + mySecondValue + myThirdValue;
        int myLastValue = 1000 - myTotal;
        System.out.println(myLastValue);


        int myValue = 1000;

        int myMinIntValue = Integer.MIN_VALUE;
        int myMaxIntValue = Integer.MAX_VALUE;
        System.out.println("Integer Minimum value = " + myMinIntValue);
        System.out.println("Integer Maximum value = " + myMaxIntValue);
        System.out.println("busted Maximum value = " + (myMaxIntValue + 1)); //overflow
        System.out.println("busted Minimum value = " + (myMinIntValue - 1)); //underflow

        byte firstNumber = 10;
        short secondNumber = 20;
        int thirdValue = 50;

        long all = (int) (50000 + 10 * (firstNumber + secondNumber + thirdValue));
        System.out.println(all);
    }
}
