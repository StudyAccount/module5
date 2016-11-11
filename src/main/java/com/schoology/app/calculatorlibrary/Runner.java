package com.schoology.app.calculatorlibrary;

import com.schoology.app.calculatorlibrary.calculator.Calculator;
import com.schoology.app.calculatorlibrary.calculator.SimpleCalculator;

import java.util.Scanner;

/**
 * Created by User on 06.10.2016.
 */
public class Runner {
    public static void main(String[] args) {

        Calculator simpleCalculator = new SimpleCalculator();
        Scanner scanner = new Scanner(System.in);

        simpleCalculator.init();

        while (true) {

            System.out.println("Enter expression");
            String input = scanner.nextLine();

            if ("quit".equals(input)){
                break;
            }

            String currentOperation = simpleCalculator.calculate(input);
            System.out.println("Result " + currentOperation);
        }

    }

}
