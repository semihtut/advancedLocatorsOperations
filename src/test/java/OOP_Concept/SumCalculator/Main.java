package OOP_Concept.SumCalculator;

public class Main {
    public static void main(String[] args) {
        Sum_Calculator calc = new Sum_Calculator();
        calc.setFirstNumber(5.0);
        calc.setSecondNumber(4.0);

        System.out.println("calc.getAdditionResult() = " + calc.getAdditionResult());
        System.out.println("calc.getMultiplication() = " + calc.getMultiplication());
        System.out.println("calc.getSubstraction() = " + calc.getSubstraction());
        System.out.println("calc.getDivision() = " + calc.getDivision());
        calc.setSecondNumber(0);
        System.out.println("calc.getDivision() = " + calc.getDivision());
    }
}
