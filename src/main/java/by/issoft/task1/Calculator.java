package by.issoft.task1;

public class Calculator {
    private double result;

    public void addition(double a, double b) {
        double c = a + b;
        printResult(c);
    }

    public void subtraction(double a, double b) {
        double c = a - b;
        printResult(c);
    }

    public void multiplication(double a, double b) {
        double c = a * b;
        printResult(c);
    }

    public void division(double a, double b) {
        double c = a / b;
        printResult(c);
    }

    public void printResult(double num1){
        System.out.println("Результат: " + num1 + ". Предыдущий: " + result);
        result = num1;
    }
}
