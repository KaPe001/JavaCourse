package OOP;

public class SimpleCalculator {
    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber(){
        return firstNumber;
    }
    public double getSecondNumber(){
        return secondNumber;
    }
    public void setFirstNumber(double firstNumber){
        this.firstNumber = firstNumber;
    }
    public void setSecondNumber(double secondNumber){
        this.secondNumber = secondNumber;
    }
    public double getAdditionalResult(){
        double AdditionalResult = firstNumber + secondNumber;
        return AdditionalResult;
    }
    public double getSubtractionResult(){
        double subtractionResult = firstNumber - secondNumber;
        return subtractionResult;
    }
    public double getMultiplicationResult(){
        double multiplicationResult = firstNumber * secondNumber;
        return multiplicationResult;
    }
    public double getDivisionResult(){
        double divisionResult = firstNumber / secondNumber;
        if(secondNumber == 0){
            return 0.0d;
        }
        return divisionResult;
    }

}
