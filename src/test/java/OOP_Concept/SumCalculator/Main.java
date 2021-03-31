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

        /**
         *
         * Imagine, as a car manufacturer, you offer multiple car models to your customers.
         * Even though different car models might offer different features like a sunroof or bulletproof windows,
         * they would all include common components and features, like engine and wheels.
         *
         * It makes sense to create a basic design and extend it to create their specialized versions,
         * rather than designing each car model separately, from scratch.
         *
         * In a similar manner, with inheritance, we can create a class with basic features and behavior
         * and create its specialized versions, by creating classes, that inherit this base class.
         * In the same way, interfaces can extend existing interfaces.
         */
    }
}
