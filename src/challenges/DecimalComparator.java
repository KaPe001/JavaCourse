package challenges;

public class DecimalComparator {
    public static boolean areEqualByThreeDecimalPlaces(double firstNum, double secNum) {
        int firstNumCheck = (int) (firstNum * 1000);
        int secondNumCheck = (int)(secNum * 1000);
        if (firstNumCheck - secondNumCheck == 0) {
            return true;
        }
        return false;
    }

    public static void main(String[] args) {
        areEqualByThreeDecimalPlaces(-3.1756, -3.175);
    }
}
