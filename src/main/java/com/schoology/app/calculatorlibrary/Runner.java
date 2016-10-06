package com.schoology.app.calculatorlibrary;

import com.schoology.app.calculatorlibrary.calculator.Calculator;
import com.schoology.app.calculatorlibrary.calculator.SimpleCalculator;

/**
 * Created by User on 06.10.2016.
 */
public class Runner {
    public static void main(String[] args) {
        Calculator simpleCalculator = new SimpleCalculator();


        String currentOperation = simpleCalculator.calculate("6,asd.222,5");


        System.out.println(currentOperation);

    }

}
