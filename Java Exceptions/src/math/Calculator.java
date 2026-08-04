package math;

import exceptions.CalculatorException;
import exceptions.DivideByZeroException;
import exceptions.NonRealNumberException;

public class Calculator {
    public double add(double x, double y) {
        return x + y;
    }

    public double divide(double num, double den) {
        if (den == 0) {
            //this will attempt to stop the program
            throw new DivideByZeroException("Don't divide by zero!");
        }

        return num / den;
    }

    public double sqrt(double num) {
        if (num < 0) {
            throw new NonRealNumberException("Negative sqrt creates non-real numbers");
        }

        return Math.sqrt(num);
    }
}
