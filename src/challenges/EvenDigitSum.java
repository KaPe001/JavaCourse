package challenges;

public class EvenDigitSum{
    public static int getEvenDigitSum(int number){
        if(number < 0){
            return -1;
        }
        int sum = 0;
        int remainder = 0;
        while(number > 0){
            remainder = number % 10;
            sum += (remainder % 2 == 0) ? remainder : 0;
            number /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(getEvenDigitSum( 123456789 )+", because 2 + 4 + 6 + 8 = 20");
        System.out.println(getEvenDigitSum( 252 )+", because 2 + 2 = 4");
    }
}
