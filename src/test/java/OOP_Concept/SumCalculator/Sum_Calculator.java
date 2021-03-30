package OOP_Concept.SumCalculator;

public class Sum_Calculator {

    private double firstNumber;
    private double secondNumber;

    public double getFirstNumber() {
        return firstNumber;
    }

    public void setFirstNumber(double firstNumber) {
        this.firstNumber = firstNumber;
    }

    public double getSecondNumber() {
        return secondNumber;
    }

    public void setSecondNumber(double secondNumber) {
        this.secondNumber = secondNumber;
    }

    public double getAdditionResult(){
        return firstNumber+secondNumber;
    }

    public double getSubstraction(){
        return secondNumber-firstNumber;
    }
    public double getMultiplication(){
        return firstNumber*secondNumber;
    }

    public double getDivision(){

        if(secondNumber!=0){
            return firstNumber/secondNumber;
        }else{
            return 0;
        }
    }
}
