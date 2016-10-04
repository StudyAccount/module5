package com.schoology.app.calculatorlibrary.calculator;

import java.util.List;

/**
 * Created by User on 04.10.2016.
 */
public interface Calculator {

    String checkType(List<String> operands);

    boolean checkOperation(List<String> operation);

    String calculate(String input);


}
