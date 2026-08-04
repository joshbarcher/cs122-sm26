package app;

import exceptions.CalculatorException;
import exceptions.DivideByZeroException;
import exceptions.NonRealNumberException;
import math.Calculator;

public class App {
    public static void main(String[] args) throws Exception {
        Calculator calc = new Calculator();

        try {
            System.out.println("TRYING TO DIVIDE");

            //try some arithmetic, that "may" cause an error
            //double result = calc.divide(-100, 0);
            double result = calc.sqrt(-100);

            System.out.println("Result: " + result);
            System.out.println("PROGRAM STILL RUNNING");

        }  catch (DivideByZeroException ex) {
            System.out.println("Encountered divide by zero exception!");
        } catch (NonRealNumberException ex) {
            System.out.println("Encountered non real number exception!");
        } catch (RuntimeException ex) { //catch all 
            System.out.println("Exception thrown is " + ex.getClass().getName());
            System.out.println("Error: " + ex.getMessage());
            System.out.println("PROGRAM RECOVERED");
        }

        System.out.println("CONTINUING TO RUN PROGRAM");
    }
}
