package com.schoology.app.calculatorlibrary.calculator;

import java.util.List;

/**
 * Created by User on 04.10.2016.
 */
public interface Calculator {

    int checkType(List<String> operands);

    int checkOperation(List<String> operation);

    String calculate(String input);


}
