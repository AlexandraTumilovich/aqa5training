package Task1;

public class Calculator {
    private double result;

    public void addition(double a, double b) {
        double c = a + b;
        System.out.println("Результат: " + c + ". Предыдущий: " + result);
        result = c;
    }

    public void subtraction(double a, double b) {
        double c = a - b;
        System.out.println("Результат: " + c + ". Предыдущий: " + result);
        result = c;
    }

    public void multiplication(double a, double b) {
        double c = a * b;
        System.out.println("Результат: " + c + ". Предыдущий: " + result);
        result = c;
    }

    public void division(double a, double b) {
        double c = a / b;
        System.out.println("Результат: " + c + ". Предыдущий: " + result);
        result = c;
    }
}
