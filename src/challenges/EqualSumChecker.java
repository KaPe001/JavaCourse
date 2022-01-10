package challenges;

public class EqualSumChecker {
    public static boolean hasEqualSum(int firstValue, int secondValue, int thirdValue){
        if(firstValue + secondValue == thirdValue){
            return true;
        }
    return false;
    }

    public static void main(String[] args) {
        hasEqualSum(1,1,1);
    }
}
