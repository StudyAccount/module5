package com.schoology.app.calculatorlibrary.calculator;

import com.schoology.app.calculatorlibrary.operations.Operation;

import java.util.List;

/**
 * Created by User on 04.10.2016.
 */
public interface Calculator {

    boolean checkIfTypeIsSupported( List<String> operands);

    Operation checkIfOperationIsSupported(String operation);

    int checkType(List<String> operands);

    int checkOperation(String operation);

    String calculate(String input);


}
