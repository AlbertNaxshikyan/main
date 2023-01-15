package HomeWork7;

public class Calculator {

    double multiply(double a, double b) {
        return a * b;
    }

    double plus(double a, double b) {
        return a + b;

    }

    double minus(double a, double b) {
        return a - b;
    }

    double divide(double a, double b) {
        return a / b;


    }

    double divideTest(double a, double b) {
        if (b == 0) {
            System.out.println("Not divide by zero: ");
            return -1;
        }
        return a / b;
    }
}
